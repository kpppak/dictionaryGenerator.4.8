import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        final int MIN_FREQUENCY = 1;
        final String TEXT =
                "Meet my family." + "There are five of us – my parents," + " my elder brother, my baby sister and me." +
                        "First, meet my mum and dad, Jane and Michael." +
                        "My mum enjoys reading and my dad enjoys" + "playing chess with my brother Ken." +
                        "My mum is slim and rather tall." + "She has long red hair and big brown eyes." +
                        "She has a very pleasant smile and a soft voice. My mother is very kind and understanding.";
        List<String> dictionary = words.apply(TEXT).stream()
                .filter(e -> Collections.frequency(words.apply(TEXT), e) >= MIN_FREQUENCY)
                .collect(Collectors.toList());

        dictionary.stream()
                .forEach(System.out::println);
        }
        //чистая функция: она детерминирована, не обладает побочными эффектами, наличие монады

    public static Function<String, List<String>> words = x -> Arrays.stream(x.split("\\b"))
            .map(String::toUpperCase)
            .sorted(Comparator.naturalOrder())
            .collect(Collectors.toList());
}



