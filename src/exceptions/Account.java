package exceptions;

import java.io.IOException;

public class Account {
    public void deposit (float value) throws IOException {
        if (value <= 0){
            // This tells the dev that they are passing an illegal argument.
            throw new IOException();
        }
    }
}
