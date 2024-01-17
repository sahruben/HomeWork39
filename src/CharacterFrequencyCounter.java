import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
public class CharacterFrequencyCounter {
    public static Map<Character, Integer> countCharacterFrequency(String inputString) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        inputString.chars()
                .mapToObj(c -> (char) c)
                .forEach(character -> frequencyMap.merge(character, 1, Integer::sum));

        return frequencyMap;
    }
}
