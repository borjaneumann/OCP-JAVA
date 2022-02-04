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


     */

}
