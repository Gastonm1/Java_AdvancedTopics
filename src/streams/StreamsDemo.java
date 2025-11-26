package streams;
import java.util.List;
import java.util.stream.Collectors;


public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("a", 10, Genre.THRILLER),
                new Movie("b", 20, Genre.ACTION),
                new Movie("c", 30, Genre.ACTION)
        );

        // Sometimes you may want to group or classify the data
        // Ex: classify the movies by genre.
        var result = movies.stream()
                // Separated into objects by genre
//                .collect(Collectors.groupingBy(
//                        Movie::getGenre));

                // Number of objects OF each Genre
                //  .collect(Collectors.groupingBy(
                //   Movie::getGenre, Collectors.counting()));

                // Join name of movies with comma (CAN ONLY JOIN WITH STRINGS)
                // So get the movie title FIRST and then join
                .collect(Collectors.groupingBy(
                        Movie::getGenre,
                        Collectors.mapping(Movie::getTitle, Collectors.joining(","))));
        System.out.println(result);
    }
}
