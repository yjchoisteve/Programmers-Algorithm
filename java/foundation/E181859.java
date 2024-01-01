package programmers.java.foundation;

import java.util.Stack;

public class E181859 {
    public int[] solution(int[] arr) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (s.isEmpty() || s.peek() != arr[i])
                s.push(arr[i]);
            else
                s.pop();
        }
        if (s.isEmpty())
            s.push(-1);
        return s.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E181859());
    }
}
