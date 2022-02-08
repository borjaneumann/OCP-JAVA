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

    /*
    Starvation
    ==========
    Starvation occurs when a single thread is perpetually denied access to a
    shared resource or lock. The thread is still active, but it is unable to
    complete its work as a result of other threads constantly taking the
    resource that they are trying to access.
    In our fox example, imagine that we have a pack of very hungry, very
    competitive foxes in our environment. Every time Foxy stands up to go
    get food, one of the other foxes sees her and rushes to eat before her. Foxy
    is free to roam around the enclosure, take a nap, and howl for a zookeeper
    but is never able to obtain access to the food. In this example, Foxy
    literally and figuratively experiences starvation. It's a good thing that this
    is just a theoretical example!
     */

    /*
    Livelock
    ========
    Livelock occurs when two or more threads are conceptually blocked
    forever, although they are each still active and trying to complete their
    task. Livelock is a special case of resource starvation in which two or
    more threads actively try to acquire a set of locks, are unable to do so, and
    restart part of the process.

    Livelock is often a result of two threads trying to resolve a deadlock.
    Returning to our fox example, imagine that Foxy and Tails are both
    holding their food and water resources, respectively. They each realize
    that they cannot finish their meal in this state, so they both let go of their
    food and water, run to opposite side of the environment, and pick up the
    other resource. Now Foxy has the water, Tails has the food, and neither is
    able to finish their meal!

    If Foxy and Tails continue this process forever, it is referred to as livelock.
    Both Foxy and Tails are active, running back and forth across their area,
    but neither is able to finish their meal. Foxy and Tails are executing a form
    of failed deadlock recovery. Each fox notices that they are potentially
    entering a deadlock state and responds by releasing all of its locked
    resources. Unfortunately, the lock and unlock process is cyclical, and the
    two foxes are conceptually deadlocked.

    In practice, livelock is often a difficult issue to detect. Threads in a
    livelock state appear active and able to respond to requests, even when
    they are in fact stuck in an endless cycle.
     */

    /*
    MANAGING RACE CONDITIONS
    ========================
    A race condition is an undesirable result that occurs when two tasks,
    which should be completed sequentially, are completed at the same time.

    Imagine two zoo patrons, Olivia and Sophia, are signing up for an account on the zoo's new
    visitor website. Both of them want to use the same username, ZooFan, and
    they each send requests to create the account at the same time,

    What result does the web server return when both users attempt to create
    an account with the same username?

    Scenario 1) Both users are able to create accounts with username ZooFan.
                This is the worst possible outcome to this race condition, as it causes significant
                and potentially unrecoverable data problems.
    Scenario 2) Both users are unable to create an account with username ZooFan,
                returning an error message to both users.
                In this scenario, the data is protected since no two accounts with the same
                username exist in the system. The users are free to try again with the same
                username, ZooFan, since no one has been granted access to it.
    Scenario 3) One user is able to create the account with the username ZooFan, while
                the other user receives an error message.
                It is considered the best solution to this type of race condition.
                Like the second situation, we preserve data integrity, but unlike
                the second situation, at least one user is able to move forward on the first
                request, avoiding additional race condition scenarios. Also unlike the
                previous scenario, we can provide the user who didn't win the race with a
                clearer error message because we are now sure that the account username
                is no longer available in the system.

                For the exam, you should understand that race conditions lead to invalid
                data if they are not properly handled.

                Race conditions tend to appear in highly concurrent applications. As a
                software system grows and more users are added, they tend to appear
                more frequently. One solution is to use a monitor to synchronize on the
                relevant overlapping task. In the previous example, the relevant task is the
                method that determines whether an account username is in use and
                reserves it in the system if it is available

     */
}
