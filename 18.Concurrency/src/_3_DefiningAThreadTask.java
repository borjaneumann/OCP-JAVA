public class _3_DefiningAThreadTask {
    /*Defining the task that a Thread instance will execute can be done two
    ways in Java:
    1) Provide a Runnable object or lambda expression to the Thread
    constructor.
    2) Create a class that extends Thread and overrides the run() method.
    The following are examples of these techniques:*/

    static class PrintData implements Runnable {
        @Override public void run() { // Overrides method in Runnable
            for(int i = 0; i < 3; i++)
                System.out.println("Printing record: "+i);
        }
        public static void main(String[] args) {
            (new Thread(new PrintData())).start();
        }
    }
    static class ReadInventoryThread extends Thread { //less common practise
        @Override public void run() { // Overrides method in Thread
            System.out.println("Printing zoo inventory");
        }
        public static void main(String[] args) {
            (new ReadInventoryThread()).start();
        }
    }


}
