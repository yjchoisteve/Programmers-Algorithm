package programmers.java.level2;

public class E178870 {
    public int[] solution(int[] sequence, int k) {
        int len = sequence.length;
        int l = 0, r = len;
        int sum = 0;
        for (int start = 0, end = 0; start < len; start++) {
            while (end < len && sum < k) {
                sum += sequence[end++];
            }
            if (sum == k) {
                int range = end - start - 1;
                if ((r - l) > range) {
                    l = start;
                    r = end - 1;
                }
            }
            sum -= sequence[start];
        }
        return new int[] { l, r };
    }

    public static void main(String[] args) {
    }
}
