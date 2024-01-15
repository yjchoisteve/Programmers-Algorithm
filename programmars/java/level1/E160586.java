package programmars.java.level1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class E160586 {
    public int[] solution(String[] keymap, String[] targets) {
        return IntStream.range(0, targets.length).map(i -> {
            int[] tmp = Stream.of(targets[i].split(""))
                    .mapToInt(s -> IntStream.range(0, keymap.length).map(j -> keymap[j].indexOf(s) + 1)
                            .filter(t -> t != 0).min()
                            .orElse(-1))
                    .toArray();
            if (IntStream.of(tmp).filter(t -> t == -1).count() > 0) {
                return -1;
            }
            return IntStream.of(tmp).sum();
        }).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E160586());
    }
}
