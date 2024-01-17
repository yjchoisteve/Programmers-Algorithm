package programmers.java.level1;

public class E12943 {
    public int solution(int num) {
        int ret = 0;
        while (num > 1 && ret++ < 500) {
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
        }
        return num != 1 ? -1 : ret;
    }

    public static void main(String[] args) {
        System.out.println(new E12943().solution(6));
        System.out.println(new E12943().solution(16));
        System.out.println(new E12943().solution(626331));
    }
}
