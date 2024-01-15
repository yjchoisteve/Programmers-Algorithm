package programmars.java.level0;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E181918 {
    public int[] solution(int[] arr) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < arr.length;) {
            if (l.isEmpty() || l.get(l.size() - 1) < arr[i])
                l.add(arr[i++]);
            else
                l.remove(l.size() - 1);
        }
        return l.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E181918());
    }
}
