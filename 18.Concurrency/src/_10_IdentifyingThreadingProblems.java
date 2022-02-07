import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _10_IdentifyingThreadingProblems {
    /*
    Intro
    =====
    A threading problem can occur in multithreaded applications when two or
    more threads interact in an unexpected and undesirable way.

    The Concurrency API was created to help eliminate potential threading
    issues common to all developers.

    Although the Concurrency API reduces the potential for threading issues,
    it does not eliminate it. In practice, finding and identifying threading
    issues within an application is often one of the most difficult tasks a
    developer can undertake.

    UNDERSTANDING LIVENESS
    ======================
    As you have seen in this chapter, many thread operations can be
    performed independently, but some require coordination.

    What happens to the application while all of these threads are waiting? In
    many cases, the waiting is ephemeral, and the user has very little idea that
    any delay has occurred. In other cases, though, the waiting may be
    extremely long, perhaps infinite.

    Liveness is the ability of an application to be able to execute in a timely
    manner. Liveness problems, then, are those in which the application
    becomes unresponsive or in some kind of “stuck” state.

    For the exam,there are three types of liveness issues with which you should be familiar:
    1) deadlock
    2) starvation, and
    3) livelock.

    Deadlock
    ========
    Deadlock occurs when two or more threads are blocked forever, each
    waiting on the other. We can illustrate this principle with the following
    example. Imagine that our zoo has two foxes: Foxy and Tails. Foxy likes
    to eat first and then drink water, while Tails likes to drink water first and
    then eat. Furthermore, neither animal likes to share, and they will finish
    their meal only if they have exclusive access to both food and water.
    The zookeeper places the food on one side of the environment and the
    water on the other side. Although our foxes are fast, it still takes them 100
    milliseconds to run from one side of the environment to the other.

     */
    static class Food{};
    static class Water {};
    public static class Fox {
        public void eatAndDrink( Food food, Water water) {
            synchronized (food) {
                System.out.println("Got Food");
                move();
                synchronized (water) {
                    System.out.println("Got water");
                }
            }
        }
        public void drinkAndEat (Food food, Water water) {
            synchronized (water) {
                System.out.println("Got water");
                move();
                synchronized (food) {
                    System.out.println("Got food");
                }
            }
        }
        public void move() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e){
                //Handle exception
            }
        }

        public static void main(String[] args) {
            //create participants and resources
            Fox foxy = new Fox();
            Fox tails = new Fox();
            Food food = new Food();
            Water water = new Water();

            // Process data
            ExecutorService service = null;
            try {
                service = Executors.newScheduledThreadPool(10);
                service.submit(()->foxy.eatAndDrink(food, water));
                service.submit(()->tails.drinkAndEat(food, water));
            } finally {
                if (service !=null) service.shutdown();
            }
        }

    }
    /*
    In this example, Foxy obtains the food and then moves to the other side of
    the environment to obtain the water. Unfortunately, Tails already drank
    the water and is waiting for the food to become available. The result is that
    our program outputs the following, and it hangs indefinitely:
    Got Food!
    Got Water!
    This example is considered a deadlock because both participants are
    permanently blocked, waiting on resources that will never become
    available.

    PREVENTING DEADLOCKS
    ====================
    How do you fix a deadlock once it has occurred? The answer is that
    you can't in most situations.

    On the other hand, there are numerous strategies to help prevent deadlocks
    from ever happening in the first place.
    One common strategy to avoid deadlocks is for all threads to
    order their resource requests.

    For example, if both foxes have a rule
    that they need to obtain food before water, then the previous
    deadlock scenario will not happen again.
     */
}
