package programmars.java.level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E181885 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> l = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i])
                l.add(todo_list[i]);
        }
        return l.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Arrays.asList(
                new E181885().solution(new String[] { "problemsolving", "practiceguitar", "swim", "studygraph" },
                        new boolean[] { true, false, true, false }))
                .forEach(x -> System.out.println(x));
    }
}
