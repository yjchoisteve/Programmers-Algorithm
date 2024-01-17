package programmers.java.level1;

public class E12935 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[] { -1 };
        }
        int[] ret = new int[arr.length - 1];
        int max = Integer.MAX_VALUE, idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                max = arr[i];
                idx = i;
            }
        }
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != idx) {
                ret[j++] = arr[i];
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] a = new E12935().solution(new int[] { 4, 3, 2, 1 });
        for (int i : a) {
            System.out.println(i);
        }
        System.out.println();
        int[] b = new E12935().solution(new int[] { 10 });
        for (int i : b) {
            System.out.println(i);
        }
    }
}
