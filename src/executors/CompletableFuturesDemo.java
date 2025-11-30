package executors;

// CompletableFuture is a Java built-in tool for running tasks asynchronously
// Meaning you can run work in the background without blocking your main thread

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class CompletableFuturesDemo {
    public static void show(){
        Supplier<Integer> task = () -> 1;
        var future = CompletableFuture.supplyAsync(task);
        try {
            var result = future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
