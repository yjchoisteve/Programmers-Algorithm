package programmers.java.foundation;

import java.util.Scanner;

public class E181944 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(String.format("%d is %s", n, n % 2 == 0 ? "even" : "odd"));
    }
}