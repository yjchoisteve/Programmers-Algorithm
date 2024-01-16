package programmers.java.level1;

public class E86051 {
    public int solution(int[] numbers) {
        int ret = 45;
        for (int i : numbers) {
            ret -= i;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new E86051());
    }
}
