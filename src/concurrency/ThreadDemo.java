package concurrency;

public class ThreadDemo {
    public static void show() {
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        // .join() method makes the current thread wait until another thread finishes.
        // Thinking of it like: Don't continue until this work finishes their task.
        // We tell the current thread to wait for the other thread to finish and then execute.
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File is ready to be scanned");


    }
}
