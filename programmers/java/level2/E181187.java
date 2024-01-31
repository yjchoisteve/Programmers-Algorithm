package programmers.java.level2;

public class E181187 {
    public long solution(int r1, int r2) {
        long ret = 0;
        double pow1 = Math.pow(r1, 2), pow2 = Math.pow(r2, 2);
        int linedCnt = (r2 - r1 + 1) * 4;
        for (int i = 0; i <= r2; i++) {
            double xPow = Math.pow(i, 2);
            if (i > r1) {
                pow1 = 0;
            }
            double y1 = 0;
            if (pow1 != 0) {
                y1 = Math.sqrt(pow1 - xPow);
                if (y1 > Math.floor(y1)) {
                    y1 = Math.ceil(y1);
                }
            }
            double y2 = Math.sqrt(pow2 - xPow);
            if (y2 > Math.floor(y2)) {
                y2 = Math.floor(y2);
            }
            ret += (int) y2 - (int) y1 + 1;
        }
        return ret * 4 - linedCnt;
    }

    public static void main(String[] args) {
    }
}
