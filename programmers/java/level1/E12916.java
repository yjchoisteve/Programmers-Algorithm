package programmers.java.level1;

public class E12916 {
    boolean solution(String s) {
        s = s.toLowerCase();
        int pCnt = 0, yCnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                pCnt++;
            } else if (s.charAt(i) == 'y') {
                yCnt++;
            }
        }
        return pCnt == yCnt;
    }

    public static void main(String[] args) {
        System.out.println(new E12916().solution("pPoooyY"));
        System.out.println(new E12916().solution("Pyy"));
    }
}
