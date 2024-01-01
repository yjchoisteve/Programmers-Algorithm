package programmers.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class E120903 {
    public int solution(String[] s1, String[] s2) {
        Set<String> s = new HashSet<>(Arrays.asList(s1));
        s.retainAll(new HashSet<>(Arrays.asList(s2)));
        return s.size();
    }

    public static void main(String[] args) {
        System.out.println(new E120903());
    }
}
