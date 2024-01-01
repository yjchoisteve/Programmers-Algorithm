package programmers.java;

public class E120848 {
    public int solution(int n) {
        int r = 1, i = 1;
        while (r <= n) {
            r *= ++i;
        }
        return i - 1;
    }

    public static void main(String[] args) {
        System.out.println(new E120848().solution(3628800));
    }
}
