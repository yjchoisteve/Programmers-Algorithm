package programmars.java.level1;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E131128 {
    public String solution(String X, String Y) {
        X = Stream.of(X.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        Y = Stream.of(Y.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
        StringBuilder sb = new StringBuilder();
        for (int xIdx = 0, yIdx = 0; xIdx < X.length() && yIdx < Y.length();) {
            if (X.charAt(xIdx) == Y.charAt(yIdx)) {
                sb.append(String.valueOf(X.charAt(xIdx)));
                xIdx++;
                yIdx++;
            } else if (X.charAt(xIdx) < Y.charAt(yIdx)) {
                yIdx++;
            } else {
                xIdx++;
            }
        }
        return sb.toString().isEmpty() ? "-1" : sb.toString().startsWith("0") ? "0" : sb.toString().toString();
    }

    public static void main(String[] args) {
        System.out.println(new E131128());
    }
}
