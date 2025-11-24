package generics;

// We use the comparable interface to compare objects for order
// For example: we can compare two user objects
// Used when sorting objects

public class User implements Comparable<User> {
    private int points;

    public User(int points) {
        this.points = points;
    }


    @Override
    public int compareTo(User other) {
        // this < 0 -> -1
        // this == 0 -> 0
        // this > 0 -> 1
        return points - other.points;
    }
}
