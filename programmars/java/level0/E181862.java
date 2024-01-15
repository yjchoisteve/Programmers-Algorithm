package programmars.java.level0;

import java.util.Arrays;
import java.util.Scanner;

public class E181862 {
    public String[] solution(String myStr) {
        String[] ret = Arrays.asList(myStr.split("[abc]")).stream().filter(s -> !s.equals("")).toArray(String[]::new);
        return ret.length == 0 ? new String[] { "EMPTY" } : ret;
    }

    public static void main(String[] args) {
        System.out.println(new E181862().solution("baconlettucetomato"));
        System.out.println(new E181862().solution("abcd"));
        System.out.println(new E181862().solution("cabab"));
    }
}
