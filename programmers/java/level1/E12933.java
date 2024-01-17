package programmers.java.level1;

public class E12933 {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    String tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return Long.valueOf(String.join("", arr));
    }

    public static void main(String[] args) {
        System.out.println(new E12933().solution(118372));
    }
}
