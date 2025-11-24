import exceptions.ExceptionsDemo;
import generics.GenericList;


import java.io.IOException;

public class Main {
    public static void main(String[] args) {
         var list = new GenericList<Integer>();
         list.add(1);
         int number = list.get(0);
    }
}