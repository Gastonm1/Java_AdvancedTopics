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

        // Partition the movies into two categories
        // Movies with more than 20 likes & movies with less than 20 likes
        // We have a collector for this purpose
        // get the likes > 20
        // create collector and reference the title and join together as string with "," to separate
        var result = movies.stream()
                .collect(Collectors.partitioningBy(
                        m -> m.getLikes() > 20,
                        Collectors.mapping(Movie::getTitle, Collectors.joining(", "))));
        System.out.println(result);


    }
}
