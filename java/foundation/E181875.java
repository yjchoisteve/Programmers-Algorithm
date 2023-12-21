package programmers.java;

import java.util.stream.IntStream;

public class E181875 {
    public String[] solution(String[] strArr) {
        return IntStream.range(0, strArr.length)
                .mapToObj(i -> i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase()).toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(new E181875().solution(new String[] { "AAA", "BBB", "CCC", "DDD" }));
        System.out.println(new E181875().solution(new String[] { "aBc", "AbC" }));
    }
}
