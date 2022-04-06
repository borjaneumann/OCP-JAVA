package HandlingExceptions;

public class TryWithResourcesOrderOfOperation implements AutoCloseable{
    // # Resources are closed after the try clause ends and before any catch/finally clauses.
    // # Resources are closed in the reverse order from which they were created.

    private final int num;
    public TryWithResourcesOrderOfOperation(int num) { this.num = num; }
    public void close() {
        System.out.println("closing: " + num);
    }

    public static void main(String[] args) {
        try (TryWithResourcesOrderOfOperation a1 = new TryWithResourcesOrderOfOperation(1);
            TryWithResourcesOrderOfOperation a2 = new TryWithResourcesOrderOfOperation(2)) {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("ex");
        } finally {
            System.out.println("finally");
        }
    }
}
