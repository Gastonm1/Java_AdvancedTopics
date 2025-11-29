package executors;

import java.util.concurrent.Executors;

// The Executors class has a number of static factory methods for constructing executor service instances.
// newCachedThreadPool: New threads are created as needed; idle threads are kept for 60 seconds
// newFixedThreadPool: The pool contains a fixed set of threads; idle threads are kept indefinitely
// newSingleThreadExecutor: A "pool" with a single thread that executes the submitted tasks sequentially
// newVirtualThreadPerTaskExecutor: An executor that runs each task on a new virtual thread

public class ExecutorsDemo {
    public static void show() {
        var executor = Executors.newFixedThreadPool(2);

        // When you're working with executors. After it completes a task, it keeps running in case there might be more tasks coming in the future.
        // So it's not going to terminate, it's going to stay in the memory, waiting for new tasks
        // So we have to explicitly shut down an executor and terminate our program.
        // We can use .shutdown() or .shutdownNow()
        // .shutdown(): will wait to the task its working on is complete and then shutdown
        // .shutdownNow(): will forcefully stop the task
        // Make sure to put it in a try block

        try {
        executor.submit(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        }
        finally {
            executor.shutdown();
        }


    }
}
