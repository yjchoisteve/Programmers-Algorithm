package programmers.java.level0;

public class E181911 {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_strings.length; i++) {
            sb.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new E181911().solution(new String[] { "progressive", "hamburger", "hammer", "ahocorasick" },
                new int[][] { { 0, 4 }, { 1, 2 }, { 3, 5 }, { 7, 7 } }));
    }
}
