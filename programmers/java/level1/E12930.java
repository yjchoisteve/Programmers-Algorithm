package programmers.java.level1;

public class E12930 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0, j = 0; i < s.length(); i++, j++) {
            char c = s.charAt(i);
            if (j % 2 == 0) {
                c = Character.toUpperCase(c);
            }
            sb.append(c);
            if (c == ' ') {
                j = -1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new E12930());
    }
}
