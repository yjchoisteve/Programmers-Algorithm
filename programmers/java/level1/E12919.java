package programmers.java.level1;

public class E12919 {
    public String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                return String.format("김서방은 %d에 있다", i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(new E12919().solution(new String[] { "Jane", "Kim" }));
    }
}
