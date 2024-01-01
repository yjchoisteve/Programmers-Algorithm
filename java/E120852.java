package programmers.java;

import java.util.ArrayList;
import java.util.List;

public class E120852 {
    public int[] solution(int n) {
        List<Integer> l = new ArrayList<>();
        for (int i = 2, r = n; i <= r;) {
            if (r % i == 0) {
                r /= i;
                if (!l.contains(i)) {
                    l.add(i);
                }
            } else {
                i++;
            }
        }
        return l.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E120852());
    }
}
