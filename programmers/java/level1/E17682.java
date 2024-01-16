package programmers.java.level1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E17682 {
    public int solution(String dartResult) {
        Pattern regex = Pattern.compile("(\\d+)([SDT])([*#]?)");
        Matcher matcher = regex.matcher(dartResult);
        int idx = 0;
        int[] scores = new int[3];
        while (matcher.find()) {
            int score = Integer.parseInt(matcher.group(1));
            char pow = matcher.group(2).charAt(0);
            scores[idx] = (int) Math.pow(score, pow == 'S' ? 1 : pow == 'D' ? 2 : 3);
            if (matcher.group().contains("*")) {
                scores[idx] *= 2;
                if (idx > 0) {
                    scores[idx - 1] *= 2;
                }
            } else if (matcher.group().contains("#")) {
                scores[idx] *= -1;
            }
            idx++;
        }
        return scores[0] + scores[1] + scores[2];
    }

    public static void main(String[] args) {
        System.out.println(new E17682().solution("1S2D*3T\t"));
    }
}
