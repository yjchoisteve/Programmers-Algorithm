package programmers.java.level1;

public class E12977 {
    public int solution(int[] nums) {
        int ret = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int s = nums[i] + nums[j] + nums[k];
                    ret++;
                    for (int n = 2; n * n <= s; n++) {
                        if (s % n == 0) {
                            ret--;
                            break;
                        }
                    }
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new E12977().solution(new int[] { 1, 2, 3, 4 }));
        System.out.println(new E12977().solution(new int[] { 1, 2, 7, 6, 4 }));
    }
}
