package _02_CreatingThreadsWithTheConcurrencyAPI.Examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CpuIntensiveTask implements Runnable{
    public static void main(String[] args) {
        // get count of available cores
        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(coreCount);
        // submit the tasks for execution
        for (int i = 0; i < 100; i++) {
            service.execute(new CpuIntensiveTask());
        }

    }

    @Override
    public void run() {
        //some CPU intensive operations
    }
}
