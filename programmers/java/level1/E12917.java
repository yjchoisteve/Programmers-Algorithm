package programmers.java.level1;

public class E12917 {
    public String solution(String s) {
        String[] t = s.split("");
        for (int i = 0; i < t.length; i++) {
            for (int j = i + 1; j < t.length; j++) {
                if (t[i].compareTo(t[j]) < 0) {
                    String tmp = t[i];
                    t[i] = t[j];
                    t[j] = tmp;
                }
            }
        }
        return String.join("", t);
    }

    public static void main(String[] args) {
        System.out.println(new E12917().solution("Zbcdefg"));
    }
}
