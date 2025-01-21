import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 8, 2, 5, 7, 9, 3);

        nums.stream()
                .filter(predicate)
                .sorted() //new stream
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c+e);
    }
}