package programmars.java.level0;

import java.util.Scanner;

public class E181843 {
    public int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(new E181843().solution("banana", "ana"));
        System.out.println(new E181843().solution("banana", "wxyz"));
    }
}
