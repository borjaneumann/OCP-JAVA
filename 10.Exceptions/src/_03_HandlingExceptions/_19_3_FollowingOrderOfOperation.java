package _03_HandlingExceptions;

public class _19_3_FollowingOrderOfOperation implements AutoCloseable{

    // #1 Resources are closed after the try clause ends and before any catch/finally clauses.
    // #2 Resources are closed in the reverse order from which they were created.

    private final int num;
    public _19_3_FollowingOrderOfOperation(int num) { this.num = num; }
    public void close() {
        System.out.println("closing: " + num);
    }

    public static void main(String[] args) {
        try (_19_3_FollowingOrderOfOperation a1 = new _19_3_FollowingOrderOfOperation(1);
             _19_3_FollowingOrderOfOperation a2 = new _19_3_FollowingOrderOfOperation(2)) {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("ex");
        } finally {
            System.out.println("finally");
        }
    }
    /*
    Closing: 2
    Closing: 1
    ex
    finally

    TRY-WITH-RESOURCES GUARANTEES
    =============================
    Does a try-with-resources statement guarantee a resource will be closed? No.
    For the exam, you just need to know try-with-resources is guaranteed to call the close() method
    on the resource.
     */
}
