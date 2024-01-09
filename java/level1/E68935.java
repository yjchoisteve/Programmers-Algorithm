package programmers.java.level1;

public class E68935 {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
        }
        return Integer.parseInt(sb.toString(), 3);
    }

    public static void main(String[] args) {
        System.out.println(new E68935().solution(45));
    }
}
