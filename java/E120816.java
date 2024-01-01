
package programmers.java;

import java.util.Scanner;

public class E120816 {
    public int solution(int slice, int n) {
        return (int) Math.ceil((double) n / slice);
    }

    public static void main(String[] args) {
        System.out.println(new E120816());
    }
}
