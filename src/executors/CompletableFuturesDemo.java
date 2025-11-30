package executors;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {
    public static void show(){
    var future = CompletableFuture.supplyAsync(() -> 1);

    // The following methods are used ona CompletableFuture to say: "When this future is done, run something afterward"
        // The difference between them is:
        // Do you need the result of the previous future?
        // Do you want the follow-up to run asynchronously or in the same thread?
        // 1) .thenRun(): When the future completes, run this action - but i don't need the result.
        // Runs after the future finishes, does NOT receive the result, runs in the same thread that completed the previous future.
        // 2) .thenRunAsync(): Do the same thing as .thenRun(), but run it asynchronously in a different thread
        // Also does not receive the result, runs in a separate thread
        // 3) .thenAccept(): When the future completes, receive the result and do something with it.
        // Consumers the result, returns CompletableFuture<Void>, runs in the same thread that completed the previous future.
        // 4) .thenAcceptAsync(): Like .thenAccept(), but consume the result asynchronously in another thread.
        // Receives the result, runs in a different thread.
        future.thenRunAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Done");
        });
    };
}
