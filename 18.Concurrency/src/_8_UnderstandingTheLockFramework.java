public class _8_UnderstandingTheLockFramework {

    /*
    A synchronized block supports only a limited set of functionality. For
    example, what if we want to check whether a lock is available and, if it is
    not, perform some other task? Furthermore, if the lock is never available
    and we synchronize on it, we might hang forever.

    The Concurrency API includes the Lock interface that is conceptually
    similar to using the synchronized keyword, but with a lot more bells and
    whistles. Instead of synchronizing on any Object, though, we can “lock”
    only on an object that implements the Lock interface.

     */

}
