package concurrency;

public class DownloadFileTask implements Runnable {
    private final DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Starting file download: " + Thread.currentThread().getName());

      for (var i = 0; i < 10_000; i++) {
          if(Thread.currentThread().isInterrupted()) return;
          status.incrementTotalBytes();
      }

        System.out.println("Download complete :" + Thread.currentThread().getName());
    }
}
