package streams;
import java.util.List;
import java.util.stream.Collectors;


public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        // Collectors class (https://docs.oracle.com/javase/8/docs/api/java/util/stream/Collectors.html)
        // The Collector implements various useful reduction operations
        // accumulating elements into collections
        // summarizing elements according to various criteria, etc.
        // EX:
        // toList() -> Returns a Collector that accumulates the input elements into a new List
        // toSet() -> Returns a Collector that accumulates the input elements into a new Set
        // toMap() -> Returns a Collector that accumulates elements into a Map whose keys and values are the result of applying the provided mapping functions to the input elements.
        var result = movies.stream()
                .filter(m -> m.getLikes() > 10)
//                .collect(Collectors.toList());
//                .collect(Collectors.toSet());
                  .collect(Collectors.toMap(m -> m.getTitle(), m -> m.getLikes()));

        System.out.println(result);
    }
}
