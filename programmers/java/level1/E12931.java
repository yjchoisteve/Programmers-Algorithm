package programmers.java.level1;

public class E12931 {
    public int solution(int n) {
        int ret = 0;
        while (n != 0) {
            ret += n % 10;
            n /= 10;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new E12931().solution(123));
        System.out.println(new E12931().solution(987));
    }
}
