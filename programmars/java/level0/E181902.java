package programmars.java.level0;

import java.util.Scanner;

public class E181902 {
    public int[] solution(String my_string) {
        int[] l = new int[52];
        my_string.chars().forEach(c -> {
            if (Character.isUpperCase(c))
                l[c - 65]++;
            else if (Character.isLowerCase(c))
                l[c - 97 + 26]++;
        });
        return l;
    }

    public static void main(String[] args) {
        for (int solution : new E181902().solution("Programmers")) {
            System.out.print(solution + ", ");
        }
    }
}
