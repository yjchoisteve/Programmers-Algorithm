package programmers.java.foundation;

public class E181884 {
    public int solution(int[] numbers, int n) {
        int ret = 0;
        for (int x : numbers) {
            ret += x;
            if (ret > n) {
                break;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new E181884().solution(new int[] { 34, 5, 71, 29, 100, 34 }, 123));
        System.out.println(new E181884().solution(new int[] { 58, 44, 27, 10, 100 }, 139));
    }
}
