package challengesStreams;

import java.util.Arrays;
import java.util.List;

public class StreamsExamples {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList(
                "London",
                "New York",
                "Tokyo",
                "CDMX");
//        cities.stream().forEach(city -> System.out.println(city));
        cities.forEach(System.out::println);
    }
}