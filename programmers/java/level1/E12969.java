package programmers.java.level1;

import java.util.Scanner;

public class E12969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (b-- > 0) {
            System.out.println("*".repeat(a));
        }
    }
}
