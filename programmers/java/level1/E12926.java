package programmers.java.level1;

public class E12926 {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        s.chars().forEach(c -> {
            if (Character.isUpperCase(c)) {
                sb.append((char) ((c - 65 + n) % 26 + 65));
            } else if (Character.isLowerCase(c)) {
                sb.append((char) ((c - 97 + n) % 26 + 97));
            } else {
                sb.append((char) c);
            }
        });
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new E12926().solution("AB", 1));
        System.out.println(new E12926().solution("z", 1));
        System.out.println(new E12926().solution("a B z", 4));
    }
}
