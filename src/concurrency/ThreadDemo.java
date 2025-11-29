package concurrency;

public class ThreadDemo {
    public static void show() {
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        // let's cancel the thread after its started
        // FIRST lets make it wait for 1 second.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // after waiting 1 sec, lets cancel with .interrupt()
        // Which Interrupts the thread.
        // It politely asks a thread to stop what it’s doing. It does NOT force it to stop
        // it's up to THAT thread to decide if it wants to stop.
        // It sends a signal (an “interrupted status”) to the thread.
        // The thread must check for that signal and stop itself. (Found in DownloadFileTask.java)
        // Think of it like: you tap someone on the shoulder and say "Hey, stop when you get a chance"
        thread.interrupt();

    }
}
