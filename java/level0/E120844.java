package programmers.java.level0;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E120844 {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> l = IntStream.of(numbers).boxed().collect(Collectors.toList());
        if (direction.equals("right")) {
            l.add(0, l.remove(l.size() - 1));
        } else {
            l.add(l.remove(0));
        }
        return l.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E120844());
    }
}
