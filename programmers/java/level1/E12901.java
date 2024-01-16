package programmers.java.level1;

public class E12901 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] ret = new String[n];
        for (int i = 0; i < n; i++) {
            ret[i] = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i])).substring(16 - n)
                    .replace(' ', '0')
                    .replace("0", " ").replace("1", "#");
        }
        return ret;
    }

    public static void main(String[] args) {
        String[] a = new E12901().solution(5, new int[] { 9, 20, 28, 18, 11 }, new int[] { 30, 1, 21, 17, 28 });
        for (String s : a) {
            System.out.println(s);
        }
        System.out.println();
        String[] b = new E12901().solution(6, new int[] { 46, 33, 33, 22, 31, 50 },
                new int[] { 27, 56, 19, 14, 14, 10 });
        for (String s : b) {
            System.out.println(s);
        }
    }
}
