package streams;
import java.util.List;


public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        // PEEKING ELEMENTS
        // While working with complex queries you may run into issues. You get the wrong result.
        // To troubleshoot these issues, you can use the .peek() method.
        // With the .peek() method we can observe the output of each operation.

        movies.stream().filter(m -> m.getLikes() > 10)
                .peek(m -> System.out.println("filtered: " + m.getTitle()))
                .map(Movie::getTitle)
                .peek(t -> System.out.println(("mapped: " + t)))
                .forEach(System.out::println);
    }
}
