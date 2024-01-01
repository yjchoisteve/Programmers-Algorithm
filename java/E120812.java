package programmers.java;

import java.util.Arrays;
import java.util.Map;

public class E120812 {
    public int solution(int[] array) {
        // Create a frequency map using Java streams
        Map<Integer, Long> frequencyMap = Arrays.stream(array)
                .boxed()
                .collect(java.util.stream.Collectors.groupingBy(java.util.function.Function.identity(),
                        java.util.stream.Collectors.counting()));

        // Find the maximum frequency
        long maxFrequency = frequencyMap.values().stream()
                .max(Long::compare)
                .orElse(0L);

        // Find the mode(s)
        long finalMaxFrequency = maxFrequency;
        long modeCount = frequencyMap.values().stream()
                .filter(frequency -> frequency == finalMaxFrequency)
                .count();

        // If there is more than one mode, return -1
        if (modeCount > 1) {
            return -1;
        }

        // Find the key(s) with the maximum frequency
        return frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() == finalMaxFrequency)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(-1);
    }

    public static void main(String[] args) {
        System.out.println(new E120812());
    }
}
