package programmars.java.level0;

import java.util.Scanner;

public class E120921 {
    public int solution(String A, String B) {
        StringBuilder sb = new StringBuilder(A);
        for (int i = 0; i < A.length(); i++) {
            if (sb.toString().equals(B))
                return i;
            sb.insert(0, sb.substring(sb.length() - 1)).replace(A.length(), sb.length(), "");
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new E120921().solution("hello", "ohell"));
    }
}
