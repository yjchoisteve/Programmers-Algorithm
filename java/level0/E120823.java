package programmers.java.level0;

import java.util.Scanner;

public class E120823 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
