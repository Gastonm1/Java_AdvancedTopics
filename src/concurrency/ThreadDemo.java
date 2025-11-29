package concurrency;

public class ThreadDemo {
    public static void show() {
        System.out.println(Thread.currentThread().getName());


        // Because of the .sleep() method on DownloadFileTask.java all the threads below (10 threads) will start at the same time
        // BUT WILL NOT complete until after 5 seconds.
        // When running you will see them start. count to 5 and you will see them complete.
        for (var i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }

    }
}
