package _03_UsingStreams;

public class _12_0_UsingCommonTerminalOperations {
    /*You can perform a terminal operation without any intermediate operations
    but not the other way around. This is why we will talk about terminal
    operations first. Reductions are a special type of terminal operation where
    all of the contents of the stream are combined into a single primitive or
    Object. For example, you might have an int or a Collection.
     */

    public static void main(String[] args) {

       /*Method                 What happens for infinite streams   Return value            Reduction
       ==============================================================================================
        count()                 Does not terminate                  long                    Yes
        min(), max()            Does not terminate                  Optional<T>             Yes
        findAny() findFirst()   Terminates                          Optional<T>             No

        allMatch()
        anyMatch()              Sometimes terminates                boolean                 No
        noneMatch()

        forEach()               Does not terminate                  void                    No
        reduce()                Does not terminate                  Varies                  Yes
        collect()               Does not terminate                  Varies                  Yes */
    }
}