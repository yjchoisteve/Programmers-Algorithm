package programmars.java.level0;

import java.util.Scanner;
import java.util.stream.IntStream;

public class E120854 {
    public int[] solution(String[] strlist) {
        return IntStream.range(0, strlist.length).map(i -> strlist[i].length()).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E120854());
    }
}
