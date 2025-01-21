import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Stream<String> nameStream = names.stream();

        //from an array
        String[] nameArray = {"Aliko", "Dangote", "Brian"};
        Stream<String> arrayStream = Arrays.stream(nameArray);

        //from a range of numbers
        IntStream numStream = IntStream.range(1,5);

        //From values directly
        Stream<String> directStream = Stream.of("Patricia", "Sunami", "Chanel");
    }
}
