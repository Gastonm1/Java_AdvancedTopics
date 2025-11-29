package concurrency;

// A thread is a thread of execution in a program. The Java Virtual Machine allows an application to have multiple threads of execution running concurrently.
// Every thread has a priority. Threads with higher priority are executed in preference to threads with lower priority.
// When code running in some thread creates a new Thread object, the new thread has its priority initially set equal to the priority of the creating thread,
// The  way to create a thread is to declare a class that implements the Runnable interface.
// That class then implements the run method. An instance of the class can then be allocated, passed as an argument when creating Thread, and started.
// The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread. The class must define a method of no arguments called run.
// This interface is designed to provide a common protocol for objects that wish to execute code while they are active. For example, Runnable is implemented by class Thread. Being active simply means that a thread has been started and has not yet been stopped.

import java.sql.SQLOutput;

// Task: concurrency when downloading a file
public class ThreadDemo {
    public static void show() {
        System.out.println(Thread.currentThread().getName());


        for (var i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }

    }
}
