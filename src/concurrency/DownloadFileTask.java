package concurrency;

public class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Starting file download: " + Thread.currentThread().getName());

        // Thread.sleep causes the current thread to suspend execution for a specified period.
        // This is an efficient means of making processor time available to the other threads of an application or other applications that might be running on a computer system.
        // .sleep() takes one argument which is how long you want to suspend the execution: .sleep(long millis)
        // below example is 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Download complete :" + Thread.currentThread().getName());
    }
}
