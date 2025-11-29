

// Concurrency and Multi-threading
// Java's concurrency ecosystem is one of the richest and oldest in programming.
// Process: A process is an instance of a program or application
// Thread: A sequence of instructions. Technically a thread is "the thing" that executes your code.
// Multi-threading: is the technique of running multiple threads within a single program so tasks can execute independently or at the same time.
// Concurrency: Doing multiple things as IF they're happening at the same time. It's when a thread starts, runs or completes at overlapping times - not strictly one after the other.
// Each process has at least one thread called the "MAIN" thread. but we can create additional threads to run many tasks concurrently.

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // Thread & Runtime is a class in the Java Lang package
        // A method within Thread is .activeCount() which returns the number of active threads in the current process
        // A method within Runtime is .getRunTime() which has another method .availableProcessors() which will return the number of available threads
        System.out.println(Thread.activeCount());
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}