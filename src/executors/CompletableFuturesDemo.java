package executors;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturesDemo {
    public static void show(){
        var future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Getting the current weather");
            throw new IllegalStateException();
        });

        // Exception Handling
        // .exceptionally(): Lets you recover from an exception inside a CompletableFuture. It catches the error and lets you return a fallback value.
        // "If something wrong, do this instead"
        // This way, the future WILL NOT fail - it returns the fallback.
        // InterruptedException: The thread was told to stop what its doing and return early.
        // "You're doing something, but someone tapped your shoulder saying stop"
        // ExecutionException: Something inside the async task threw an exception - this wraps it.
        // does not tell you the real error directly. It's a wrapper containing the real exception
            try {
                var temperature = future.exceptionally(ex -> 1).get();
                System.out.println(temperature);
            } catch (InterruptedException e){
                e.printStackTrace();
            } catch (ExecutionException e){
                e.printStackTrace();
            }
    };
}
