package programmars.java.level0;

import java.util.Scanner;

public class E120851 {
    public int solution(String my_string) {
        return my_string.chars().filter(i -> Character.isDigit((char) i)).map(i -> i - 48).sum();
    }

    public static void main(String[] args) {
        System.out.println(new E120851());
    }
}
