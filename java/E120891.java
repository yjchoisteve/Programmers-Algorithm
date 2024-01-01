package programmers.java;

import java.util.stream.Stream;

public class E120891 {
    public int solution(int order) {
        return String.valueOf(order).replaceAll("[0124578]", "").length();
    }

    public static void main(String[] args) {
        System.out.println(new E120891());
    }
}
