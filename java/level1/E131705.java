package programmers.java.level1;

public class E131705 {
    public int solution(int[] number) {
        int ret = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        ret++;
                    }
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new E131705().solution(new int[] { -2, 3, 0, 2, -5 }));
        System.out.println(new E131705().solution(new int[] { -3, -2, -1, 0, 1, 2, 3 }));
        System.out.println(new E131705().solution(new int[] { -1, 1, -1, 1 }));
    }
}
