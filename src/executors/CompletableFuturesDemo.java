package executors;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {
       public static void show(){
        var first = CompletableFuture.supplyAsync(() -> {
            LongTask.simulate();
            return 20;
        });

        var second = CompletableFuture.supplyAsync(() -> 20);

        // .anyOf: immediately returns a future that completes when the ready regardless if there are several other futures completes — success or failure.
        CompletableFuture.anyOf(first, second)
                .thenAccept(temp -> System.out.println(temp));
    };
}
