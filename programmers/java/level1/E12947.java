package programmers.java.level1;

public class E12947 {
    public boolean solution(int x) {
        String s = String.valueOf(x);
        int sum = s.length() * -48;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i);
        }
        return x % sum == 0;
    }

    public static void main(String[] args) {
        System.out.println(new E12947().solution(10));
        System.out.println(new E12947().solution(12));
        System.out.println(new E12947().solution(11));
        System.out.println(new E12947().solution(13));
    }
}
