package programmers.java.level0;

public class E181929 {
    public int solution(int[] num_list) {
        int r1 = 0, r2 = 1;
        for (int n : num_list) {
            r2 *= n;
            r1 += n;
        }
        return r1 * r1 > r2 ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(new E181929().solution(new int[] { 3, 4, 5, 2, 1 }));
        System.out.println(new E181929().solution(new int[] { 5, 7, 8, 3 }));
    }
}
