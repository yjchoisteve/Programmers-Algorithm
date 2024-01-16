package programmers.java.level1;

import java.util.Stack;

public class E133502 {
    public int solution(int[] ingredient) {
        Stack<Integer> s = new Stack<>();
        int ret = 0;
        for (int i : ingredient) {
            s.push(Integer.valueOf(i));
            while (s.size() > 3) {
                if (s.peek() == 1 && s.elementAt(s.size() - 2) == 3 && s.elementAt(s.size() - 3) == 2
                        && s.elementAt(s.size() - 4) == 1) {
                    s.pop();
                    s.pop();
                    s.pop();
                    s.pop();
                    ret++;
                } else {
                    break;
                }
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new E133502().solution(new int[] { 2, 1, 1, 2, 3, 1, 2, 3, 1 }));
        System.out.println(new E133502().solution(new int[] { 1, 3, 2, 1, 2, 1, 3, 1, 2 }));
    }
}
