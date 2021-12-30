package _3_AutomatingResourceManagement;

public class _11_UnderstandingSuppressedExceptions {
    //What happens if the close() method throws an exception? Let's try an illustrative example:

    static class TurkeyCage implements AutoCloseable {
        public void close() {
            System.out.println("Close gate");
        }
        public static void main(String[] args) {
            try (var t = new TurkeyCage()) {
            System.out.println("Put turkeys in");
            }
        }
    }
    static class JammedTurkeyCage implements AutoCloseable {
        public void close() throws IllegalStateException {
           throw new IllegalStateException("Cage door does not close");
        }
        public static void main(String[] args) {
          try (JammedTurkeyCage t = new JammedTurkeyCage()) {
               System.out.println("Put turkeys in");
          } catch (IllegalStateException e) {
              System.out.println("Caught: " + e.getMessage());
          }
        }
    }

    //What happens if the try block also throws
    //an exception? When multiple exceptions are thrown, all but the first are
    //called suppressed exceptions. The idea is that Java treats the first
    //exception as the primary one and tacks on any that come up while
    //automatically closing.
    public static void main(String[] args) {
       try (JammedTurkeyCage t = new JammedTurkeyCage()) {
           throw new IllegalStateException("Turkeys ran off");
       } catch (IllegalStateException e) {
            System.out.println("Caught: " + e.getMessage()); //Caught: Turkeys ran off
         for (Throwable t: e.getSuppressed()) //iterate through any suppressed exceptions and print them.
               System.out.println("Suppressed: "+t.getMessage()); //Suppressed: Cage door does not close
       }
    }
    //Keep in mind that the catch block looks for matches on the primary
    //exception. What do you think this code prints?
//    public static void main(String[] args) {
//       try (JammedTurkeyCage t = new JammedTurkeyCage()) {
//           throw new RuntimeException("Turkeys ran off");//runtime doesnt match illegalStateException
//       } catch (IllegalStateException e) {
//            System.out.println("caught: " + e.getMessage());
//       }
//    }
    //Java remembers the suppressed exceptions that go with a primary
    //exception even if we don't handle them in the code.

    /*If more than two resources throw an exception, the first one to be
    thrown becomes the primary exception, with the rest being grouped
    as suppressed exceptions. And since resources are closed in reverse
    order in which they are declared, the primary exception would be on
    the last declared resource that throws an exception.*/

    /*
    Keep in mind that suppressed exceptions apply only to exceptions thrown
    in the try clause. The following example does not throw a suppressed exception:*/
//    public static void main(String[] args) {
//        try (JammedTurkeyCage t = new JammedTurkeyCage()) {
//            throw new IllegalStateException("Turkeys ran off");
//        } finally {
//            throw new RuntimeException("and we couldn't find them");
//        }
//    }

    /*
        This has always been and continues to be bad programming practice. We
    don't want to lose exceptions! Although out of scope for the exam, the
    reason for this has to do with backward compatibility. Automatic resource
    management was added in Java 7, and this behavior existed before this
    feature was added.
     */

}
