package streams;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );


        // MAPPING
        // get movie titles
//        movies.stream().map(movie -> movie.getTitle()).forEach(name -> System.out.println(name));
//        // get movie likes
//        movies.stream().mapToInt(movie -> movie.getLikes()).forEach(like -> System.out.println(like));

        // FILTERING
//        Predicate<Movie> isPopular = m -> m.getLikes() > 10;
//        movies.stream().filter(isPopular).forEach(m -> System.out.println(m.getTitle()));

        // SLICING
        // slice a specific movie title
//        movies.stream().skip(2).forEach(m -> System.out.println(m.getTitle()));

        // SORT
        // reverse
//        movies.stream().sorted(Comparator.comparing(Movie::getTitle).reversed()).forEach(m -> System.out.println(m.getTitle()));
//        // forward
//        movies.stream().sorted(Comparator.comparing(Movie::getTitle)).forEach(m -> System.out.println(m.getTitle()));

        // Getting Unique Elements
        movies.stream()
                .map(Movie::getLikes)
                .distinct() // removes any duplicates
                .forEach(System.out::println);
    }
}
