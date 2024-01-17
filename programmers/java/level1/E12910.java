package programmers.java.level1;

public class E12910 {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count++;
            }
        }
        if (count == 0) {
            return new int[] { -1 };
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        int[] ret = new int[count];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                ret[j++] = arr[i];
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] a = new E12910().solution(new int[] { 5, 9, 7, 10 }, 5);
        for (int i : a) {
            System.out.println(i);
        }
        System.out.println();
        int[] b = new E12910().solution(new int[] { 2, 36, 1, 3 }, 1);
        for (int i : b) {
            System.out.println(i);
        }
        System.out.println();
        int[] c = new E12910().solution(new int[] { 3, 2, 6 }, 10);
        for (int i : c) {
            System.out.println(i);
        }
    }
}
