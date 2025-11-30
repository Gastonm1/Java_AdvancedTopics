package executors;

import java.util.concurrent.CompletableFuture;

// .thenApply(): Returns a new CompletionStage that, when this stage completes normally
// is executed with this stage's result as the argument to the supplied function.
// .thenApplyAsync: same thing but does it asynchronously
public class CompletableFuturesDemo {
    public static int toFahrenheit(int celsius){
        return (int) (celsius * 1.8) + 32;
    }

    public static void show(){
     var future = CompletableFuture.supplyAsync(() -> 20);
        var result = future
                .thenApply(CompletableFuturesDemo::toFahrenheit)
                .thenAccept(f -> System.out.println(f));
    };
}
