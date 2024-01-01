package programmers.java.foundation;

import java.util.Scanner;

public class E181935 {
    public int solution(int n) {
        boolean isEven = n % 2 == 0;
        int ret = 0;
        for (int i = 1; i <= n; i++) {
            if (!isEven && i % 2 == 0 || isEven && i % 2 == 1)
                continue;
            ret += isEven ? i * i : i;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new E181935().solution(7));
        System.out.println(new E181935().solution(10));
    }
}
