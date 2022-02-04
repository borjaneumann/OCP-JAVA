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

     */

}
