package programmers.java.level1;

public class E42862 {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] ret = new int[n];
        int count = 0;
        for (int t : lost) {
            ret[t - 1]--;
        }
        for (int t : reserve) {
            ret[t - 1]++;
        }
        for (int i = 0; i < n; i++) {
            if (ret[i] == -1) {
                if (i > 0 && ret[i - 1] > 0) {
                    ret[i - 1]--;
                    ret[i] = 0;
                } else if (i < n - 1 && ret[i + 1] > 0) {
                    ret[i + 1]--;
                    ret[i] = 0;
                }
            }
            if (ret[i] >= 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new E42862().solution(5, new int[] { 2, 4 }, new int[] { 1, 3, 5 }));
        System.out.println(new E42862().solution(5, new int[] { 2, 4 }, new int[] { 3 }));
        System.out.println(new E42862().solution(3, new int[] { 3 }, new int[] { 1 }));
    }
}
