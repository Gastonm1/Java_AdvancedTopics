package concurrency;

// Concurrency Issues
// Sometimes our threads need to access or modify a shared resource
// If multiple threads access the same object and at least one of them changes the object...
// There will be issues. Its like have one burger and multiple people trying to eat the burger at the same time
// If the multiple threads try to change the same data we make get wrong results or our application may crash
// When this happens, it's called race condition: multiple threads are racing or competing to modify some data
// Note these are not JAVA only problems. This is for any concurrency system.
// The same thing happens in databases because multiple users can modify the same data at the same time

public class ThreadDemo {
    public static void show() {
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread.interrupt();

    }
}
