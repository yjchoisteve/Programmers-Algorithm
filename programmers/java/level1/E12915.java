package programmers.java.level1;

public class E12915 {
    public String[] solution(String[] strings, int n) {
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].charAt(n) > strings[j].charAt(n)
                        || strings[i].charAt(n) == strings[j].charAt(n) && strings[i].compareTo(strings[j]) > 0) {
                    String tmp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = tmp;
                }
            }
        }
        return strings;
    }

    public static void main(String[] args) {
        String[] a = new E12915().solution(new String[] { "sun", "bed", "car" }, 1);
        for (String s : a) {
            System.out.println(s);
        }
        System.out.println();
        String[] b = new E12915().solution(new String[] { "abce", "abcd", "cdx" }, 2);
        for (String s : b) {
            System.out.println(s);
        }
    }
}
