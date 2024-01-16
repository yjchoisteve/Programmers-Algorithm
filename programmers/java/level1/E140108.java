package programmers.java.level1;

public class E140108 {
    public int solution(String s) {
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            int c1 = 1, c2 = 0;
            for (int j = i + 1; j < s.length(); j++, i++) {
                if (c1 == c2) {
                    count++;
                    break;
                } else if (cur == s.charAt(j)) {
                    c1++;
                } else {
                    c2++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new E140108());
    }
}
