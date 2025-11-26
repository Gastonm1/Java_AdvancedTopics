package streams;
import java.util.List;
import java.util.Optional;


public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        // General Reducer
        // Reduce the object to add up all the likes from the movies

        Optional<Integer> sum = movies.stream()
//                .map(Movie::getLikes)
//                .reduce(Integer::sum);
                // [10,20,30]
                // [30,30]
                // [60]
                // LAMBDA REFERENCE ^ same result
                .map(Movie::getLikes)
                .reduce(Integer::sum);
        System.out.println(sum.orElse(0));
    }
}
