package programmers.java.level1;

public class E12932 {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] ret = new int[s.length()];
        for (int i = 0, j = s.length() - 1; i < s.length(); i++, j--) {
            ret[i] = s.charAt(j) - 48;
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] a = new E12932().solution(12345);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
