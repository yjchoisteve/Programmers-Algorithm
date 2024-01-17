package programmers.java.level1;

public class E12982 {
    public int solution(int[] d, int budget) {
        int ret = 0;
        for (int i = 0; i < d.length; i++) {
            for (int j = i + 1; j < d.length; j++) {
                if (d[i] > d[j]) {
                    int tmp = d[i];
                    d[i] = d[j];
                    d[j] = tmp;
                }
            }
        }
        for (int t : d) {
            if (budget >= t) {
                budget -= t;
                ret++;
            } else {
                break;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new E12982().solution(new int[] { 1, 3, 2, 5, 4 }, 9));
        System.out.println(new E12982().solution(new int[] { 2, 2, 3, 3 }, 10));
    }
}
