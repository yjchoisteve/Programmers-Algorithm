package programmars.java.level1;

public class E87389 {
    public int solution(int n) {
        for (int i = 0; i < n; i++) {
            if (n % i == 1) {
                return i;
            }
        }
        return n - 1;
    }

    public static void main(String[] args) {
        System.out.println(new E87389());
    }
}
