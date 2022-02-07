import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class _9_UsingConcurrentCollections {

    /*
    Intro
    =====
    Besides managing threads, the Concurrency API includes interfaces and
    classes that help you coordinate access to collections shared by multiple
    tasks. By collections, we are of course referring to the Java Collections
    Framework that we introduced in Chapter 14, “Generics and Collections.”
    In this section, we will demonstrate many of the concurrent classes
    available to you when using the Concurrency API.

    UNDERSTANDING MEMORY CONSISTENCY ERRORS
    ========================================

    The purpose of the concurrent collection classes is to solve common
    memory consistency errors. A memory consistency error occurs when two
    threads have inconsistent views of what should be the same data.
    Conceptually, we want writes on one thread to be available to another
    thread if it accesses the concurrent collection after the write has occurred.

    When two threads try to modify the same nonconcurrent collection, the
    JVM may throw a ConcurrentModificationException at runtime. In
    fact, it can happen with a single thread. Take a look at the following code
    snippet:

    var foodData = new Hashmap<String, Integer>();
    foodData.put("penguin", 1);
    foodData.put("flamingo", 2);
    for (String key: foodData.keySet())
        foodData.remove(key);

    This snippet will throw a ConcurrentModificationException during the
    second iteration of the loop, since the iterator on keySet() is not properly
    updated after the first element is removed. Changing the first line to use a
    ConcurrentHashMap will prevent the code from throwing an exception at
    runtime.

    var foodData = new ConcurrentHashMap<String, Integer>();
    foodData.put("penguin", 1);
    foodData.put("flamingo", 2);
    for(String key: foodData.keySet())
    foodData.remove(key);

    Although we don't usually modify a loop variable, this example highlights
    the fact that the ConcurrentHashMap is ordering read/write access such
    that all access to the class is consistent. In this code snippet, the iterator
    created by keySet() is updated as soon as an object is removed from the
    Map.

    The concurrent classes were created to help avoid common issues in
    which multiple threads are adding and removing objects from the same
    collections. At any given instance, all threads should have the same
    consistent view of the structure of the collection.

    WORKING WITH CONCURRENT CLASSES
    ===============================
    You should use a concurrent collection class anytime that you are going to
    have multiple threads modify a collections object outside a synchronized
    block or method, even if you don't expect a concurrency problem. On the
    other hand, immutable or read‐only objects can be accessed by any
    number of threads without a concurrent collection.

    Immutable objects can be accessed by any number of threads and do
    not require synchronization. By definition, they do not change, so
    there is no chance of a memory consistency error.

    In the same way that we instantiate an ArrayList object but pass around a
    List reference, it is considered a good practice to instantiate a concurrent
    collection but pass it around using a nonconcurrent interface whenever
    possible. In some cases, the callers may need to know that it is a
    concurrent collection so that a concurrent interface or class is appropriate,
    but for the majority of circumstances, that distinction is not necessary.

    Concurrent collection classes (7)
    Class name                  Java Collections Framework interfaces   Elements ordered?       Sorted?         Blocking?
    =====================================================================================================================
    ConcurrentHashMap           ConcurrentMap                           No                      No              No
    ---------------------------------------------------------------------------------------------------------------------
    ConcurrentLinkedQueue       Queue                                   Yes                     No              No
    ---------------------------------------------------------------------------------------------------------------------
    ConcurrentSkipListMap       ConcurrentMap                           Yes                     Yes             No
                                SortedMap NavigableMap
    ---------------------------------------------------------------------------------------------------------------------
    ConcurrentSkipListSet       SortedSet NavigableSet                  Yes                     Yes             No
    ---------------------------------------------------------------------------------------------------------------------
    CopyOnWriteArrayList        List                                    Yes                     No              No
    ---------------------------------------------------------------------------------------------------------------------
    CopyOnWriteArraySet         Set                                     No                      No              No
    ---------------------------------------------------------------------------------------------------------------------
    LinkedBlockingQueue         BlockingQueue                           Yes                     No              Yes

    Based on Chapter 14, classes like
    ConcurrentHashMap and ConcurrentLinkedQueue should be quite easy for you to learn.

    Understanding SkipList Collections
    ==================================
     */
     public static class concurrentClasses1 {
        public static void main(String[] args) {
            Map<String, Integer>map = new ConcurrentHashMap<>();
            map.put("zebra", 52);
            map.put("elephant", 10);
            System.out.println(map.get("elephant")); //10

            Queue<Integer> queue = new ConcurrentLinkedQueue<>();
            queue.offer(31);
            System.out.println(queue.peek()); //31
            System.out.println(queue.poll()); //31

        }
   }
    /*All of these classes implement multiple interfaces. For example,
    ConcurrentHashMap implements Map and ConcurrentMap. When declaring
    methods that take a concurrent collection, it is up to you to determine the
    appropriate method parameter type. For example, a method signature may
    require a ConcurrentMap reference to ensure that an object passed to it is
    properly supported in a multithreaded environment.
    */
    public static class concurrentClasses2 {
        public static void main(String[] args) {
            Set<String> gardenAnimals = new ConcurrentSkipListSet<>();
            gardenAnimals.add("rabbit");
            gardenAnimals.add("gopher");
            System.out.println(gardenAnimals.stream()
                .collect(Collectors.joining(","))); //gopher, rabbit

            Map<String, String> rainForestAnimalDiet = new ConcurrentSkipListMap<>();
            rainForestAnimalDiet.put("koala", "bamboo");
            rainForestAnimalDiet.entrySet()
                    .stream()
                    .forEach((e) -> System.out.println(
                            e.getKey() + e.getValue() //koala-bamboo
                    ));
        }
    }
    /*
    When you see SkipList or SkipSet on the exam, just think “sorted”
    concurrent collections, and the rest should follow naturally.

    Understanding CopyOnWrite Collections
    =====================================
    These classes copy all of their elements to a new underlying structure
    anytime an element is added, modified, or removed from the collection. By a modified element, we
    mean that the reference in the collection is changed. Modifying the actual
    contents of objects within the collection will not cause a new structure to be allocated.

    Although the data is copied to a new underlying structure, our reference to
    the Collection object does not change. This is particularly useful in
    multithreaded environments that need to iterate the collection. Any iterator
    established prior to a modification will not see the changes, but instead it
    will iterate over the original elements prior to the modification.

     */
    public static class concurrentClasses3a {
        public static void main(String[] args) {
            List<Integer> favNumbers = new CopyOnWriteArrayList<>(List.of(4,3,42));
            for(var n: favNumbers) {
                System.out.print(n + " "); //4,3,42
                favNumbers.add(9);
            }
            System.out.println();
            System.out.println("Size: " + favNumbers.size()); // Size: 6
            System.out.println(favNumbers); // [4, 3, 42, 9, 9, 9]
        }
    }
    /*
    Despite adding elements to the array while iterating over it, the for loop
    only iterated on the ones created when the loop started. Alternatively, if
    we had used a regular ArrayList object, a
    ConcurrentModificationException would have been thrown at runtime.
    With either class, though, we avoid entering an infinite loop in which
    elements are constantly added to the array as we iterate over them.

    The CopyOnWrite classes are similar to the immutable object pattern
    that you saw in Chapter 12, “Java Fundamentals,” as a new
    underlying structure is created every time the collection is modified.
    Unlike a true immutable object, though, the reference to the object
    stays the same even while the underlying data is changed.


    The CopyOnWriteArraySet is used just like a HashSet and has similar
    properties as the CopyOnWriteArrayList class.
     */
    public static class concurrentClasses3b {
        public static void main(String[] args) {
            Set<Character> favLetters = new CopyOnWriteArraySet<>(List.of('a','t'));
            for(char c: favLetters) {
                System.out.print(c+" "); //a,t
                favLetters.add('s');
            }
            System.out.println();
            System.out.println("Size: "+ favLetters.size()); //Size: 3
            System.out.println(favLetters); //[a, t, s]
        }
    }
    /*
    The CopyOnWrite classes can use a lot of memory, since a new collection
    structure needs be allocated anytime the collection is modified. They are
    commonly used in multithreaded environment situations where reads are
    far more common than writes.
     */
    /*
    REVISISINTG DELETING WHILE LOOPING
    ==================================
    In Chapter 14, we showed an example where deleting from an
    ArrayList while iterating over it triggered a
    ConcurrentModificationException. Here we present a version that
    does work using CopyOnWriteArrayList:
    */
    public void deletingWhileLooping(){
        List<String> birds = new CopyOnWriteArrayList<>();
            birds.add("hawk");
            birds.add("hawk");
            birds.add("hawk");
        for (String bird : birds)
                    birds.remove(bird);
        System.out.print(birds.size()); // 0
    }
    /*
    As mentioned, though, CopyOnWrite classes can use a lot of
    memory. Another approach is to use the ArrayList class with an
    iterator, as shown here:
    */
    public void deletingWhileLoopingWithIterator(){
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        birds.add("hawk");
        var iterator = birds.iterator();
        while(iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.print(birds.size()); // 0
    }
    /*
    Understanding Blocking Queues
    =============================
    The final collection class you should know for the exam
    is the LinkedBlockingQueue, which implements the BlockingQueue
    interface. The BlockingQueue is just like a regular Queue, except that it
    includes methods that will wait a specific amount of time to complete an
    operation.

    Since BlockingQueue inherits all of the methods from Queue, we skip the
    inherited methods you learned in Chapter 14 and present the new methods below:

    BlockingQueue waiting methods(2)
    Method name                                 Description
    ========================================================================================================
    offer(E e, long timeout, TimeUnit unit)     Adds an item to the queue, waiting the specified time and
                                                returning false if the time elapses before space is available
    ---------------------------------------------------------------------------------------------------------
    poll(long timeout, TimeUnit unit)           Retrieves and removes an item from the queue,
                                                waiting the specified time and returning null if the
                                                time elapses before the item is available
    --------------------------------------------------------------------------------------------------------

    The implementation class LinkedBlockingQueue, as the name implies,
    maintains a linked list between elements. The following sample is using a
    LinkedBlockingQueue to wait for the results of some of the operations.
    The two BlockingQueue waiting methods can each throw a checked
    InterruptedException, as they can be interrupted before they finish
    waiting for a result; therefore, they must be properly caught.
     */
    public void linkedBlockingQueue() {
        try {
            var blockingQueue = new LinkedBlockingQueue<Integer>();
            blockingQueue.offer(39);
            blockingQueue.offer(3,4, TimeUnit.SECONDS);
            System.out.println(blockingQueue.poll()); //39
            System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS)); //3
        } catch (InterruptedException e) {
            //handle interruption
        }
    }
    /*
    As shown in this example, since LinkedBlockingQueue implements both
    Queue and BlockingQueue, we can use methods available to both, such as
    those that don't take any wait arguments.

    OBTAINING SYNCHRONIZED COLLECTIONS
    ==================================
    The Concurrency API also includes methods for obtaining synchronized
    versions of existing nonconcurrent collection objects. These synchronized
    methods are defined in the Collections class. They operate on the
    inputted collection and return a reference that is the same type as the
    underlying collection.

     */



}
