package programmers.java.level1;

import java.util.stream.IntStream;

public class E76501 {
    public int solution(int[] absolutes, boolean[] signs) {
        int ret = 0;
        for (int i = 0; i < absolutes.length; i++) {
            ret += signs[i] ? absolutes[i] : -absolutes[i];
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new E76501());
    }
}
