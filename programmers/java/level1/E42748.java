package programmers.java.level1;

public class E42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] ret = new int[commands.length];
        for (int k = 0; k < commands.length; k++) {
            int[] command = commands[k];
            int[] arr = new int[command[1] - command[0] + 1];
            for (int i = command[0] - 1, sortedCount = 0; i < command[1]; i++, sortedCount++) {
                int idx = 0;
                for (; idx < sortedCount && array[i] > arr[idx]; idx++) {
                }
                for (int j = arr.length - 2; j >= idx; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[idx] = array[i];
            }
            ret[k] = arr[command[2] - 1];
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] a = new E42748().solution(new int[] { 1, 5, 2, 6, 3, 7, 4 },
                new int[][] { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } });
        for (int n : a) {
            System.out.println(n);
        }
    }
}
