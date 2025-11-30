package executors;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturesDemo {
    public static CompletableFuture<String> getUserEmailAsync() {
        return CompletableFuture.supplyAsync(() -> "email");
    }

    public static CompletableFuture<String> getPlaylistAsync(String email) {
        return CompletableFuture.supplyAsync(() -> "playlist");
    }

    public static void show(){
     // id -> email
        getUserEmailAsync()
        // email -> playlist
        .thenCompose(CompletableFuturesDemo::getPlaylistAsync)
        .thenAccept(playlist -> System.out.println(playlist));

    };
}
