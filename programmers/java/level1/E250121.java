package programmers.java.level1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class E250121 {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<String> keywords = Arrays.asList(new String[] { "code", "date", "maximum", "remain" });
        return Stream.of(data).filter(e -> e[keywords.indexOf(ext)] < val_ext)
                .sorted(Comparator.comparing(e -> e[keywords.indexOf(sort_by)]))
                .toArray(int[][]::new);
    }

    public static void main(String[] args) {
        System.out.println(new E250121());
    }
}
