package _6_DestroyingObjects;

public class _21_UnderstandingGarbageCollection {
    /*
    Java provides a garbage collector to automatically look for objects that aren’t needed
    anymore. ONe of the process running in JVM is abuilt in garbage collector.

    All Java objects are stored in your program memory’s heap.
    The heap, which is also referred to as the free store, represents a large pool of unused
    memory allocated to your Java application. The heap may be quite large,
    depending on your environment, but there is always a limit to its size.

    If your program keeps instantiating objects and leaving them on the heap,
    eventually it will run out of memory and crash.

    Definition
    ----------
    Garbage collection refers to the process of automatically freeing memory
    on the heap by deleting objects that are no longer reachable in your
    program.
    Eligible for Garbage Collection
    -------------------------------
    As a developer, the most interesting part of garbage collection is
    determining when the memory belonging to an object can be reclaimed.

    Does this mean an object that’s eligible for garbage collection will be
    immediately garbage collected? Definitely not.

    Calling System.gc()
    -------------------
    Java includes a built-in method to help support garbage collection that can
    be called at any time. The JVM is free to ignore the request.
    It merely suggests that the JVM kick off garbage collection.

    public static void main(String[] args) {
        System.gc();
    }
    For the exam, you need to know that System.gc() is not guaranteed to run
    or do anything, and you should be able to recognize when objects become
    eligible for garbage collection.
     */

}
