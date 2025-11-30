package executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

// The Callable interface in Java, found within the java.util.concurrent package, represents a task that returns a result and may throw an exception.
// It is designed for use in multithreaded environments, particularly with the Java Concurrency API, as an alternative to the Runnable interface.
// Very similar to the runnable interface but this represents a task that returns a value

public class ExecutorsDemo {
    public static void show() {
        var executor = Executors.newFixedThreadPool(2);

        try {
        var future = executor.submit(() -> {
                LongTask.simulate();
                return 1;
            });
            System.out.println("Do more work");
            try {
                var result = future.get();
                System.out.println(result);
            } catch (InterruptedException | ExecutionException  e) {
                e.printStackTrace();
            }
        }
        finally {
            executor.shutdown();
        }
    }
}
