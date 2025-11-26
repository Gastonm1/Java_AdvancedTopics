package streams;
import java.util.List;

// Streams
// Allow us to process a collection of objects in a declarative Or more accurately functional way
// Functional programming is a special type of declarative programming
// Every collection in Java has a method called .stream() which returns a stream of objects
// A stream is a sequence of objects, but it's not like a collection. It does not store data
// It's a way to get data out of a collection.
// A collection is like a water tank, while a stream is like a pipe that takes water from the tank.

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        // Imperative Programming
        int count = 0;
        for (var movie : movies) {
            if (movie.getLikes() > 10) ;
            count++;
        }

        // Declarative (Functional) Programming
        var count2 = movies.stream().filter(movie -> movie.getLikes() > 10).count();
    }
}
