package programmers.java.level1;

public class E12950 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] ret = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                ret[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int[][] a = new E12950().solution(new int[][] { { 1, 2 }, { 2, 3 } }, new int[][] { { 3, 4 }, { 5, 6 } });
        for (int[] i : a) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] b = new E12950().solution(new int[][] { { 1 }, { 2 } }, new int[][] { { 3 }, { 4 } });
        for (int[] i : b) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
