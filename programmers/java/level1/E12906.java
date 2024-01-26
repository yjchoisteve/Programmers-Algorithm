package programmers.java.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class E12906 {
    public int[] solution(int[] arr) {
        String s = Arrays.stream(arr).mapToObj(Integer::toString).collect(Collectors.joining());
        String regex = "(\\d)\\1*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        List<Integer> ret = new ArrayList<>();
        while (matcher.find()) {
            String found = matcher.group();
            ret.add(Integer.valueOf(found));
        }
        return ret.stream().mapToInt(i -> i).toArray();
        // int count = 0;
        // for (int i = 1; i < arr.length; i++) {
        // if (arr[i] == arr[count]) {
        // continue;
        // } else {
        // arr[++count] = arr[i];
        // }
        // }
        // int[] ret = new int[count + 1];
        // for (int i = 0; i < count + 1; i++) {
        // ret[i] = arr[i];
        // }
        // return ret;
    }

    public static void main(String[] args) {
        int[] a = new E12906().solution(new int[] { 1, 1, 3, 3, 0, 1, 1 });
        for (int i : a) {
            System.out.println(i);
        }
        System.out.println();
        int[] b = new E12906().solution(new int[] { 4, 4, 4, 3, 3 });
        for (int i : b) {
            System.out.println(i);
        }
    }
}
