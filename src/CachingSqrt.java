import java.util.HashMap;
import java.util.Map;


public class CachingSqrt {

    private static Map<Double, Double> cache = new HashMap<>();

    public static double sqrt(double number) {
        return cache.computeIfAbsent(number, n -> Math.sqrt(n));
    }

    public static double cacheSqrt(double number) {
        return cache.values().stream()
                .filter(result -> result == Math.sqrt(number))
                .findFirst()
                .orElseGet(() -> {
                    double result = Math.sqrt(number);
                    cache.put(number, result);
                    return result;
                });
    }
}