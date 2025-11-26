package streams;
import java.util.List;

public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        // get movie titles
        movies.stream().map(movie -> movie.getTitle()).forEach(name -> System.out.println(name));
        // get movie likes
        movies.stream().mapToInt(movie -> movie.getLikes()).forEach(like -> System.out.println(like));
    }
}
