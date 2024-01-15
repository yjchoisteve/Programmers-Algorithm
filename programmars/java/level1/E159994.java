package programmars.java.level1;

public class E159994 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0, idx2 = 0;
        for (String s : goal) {
            if (idx1 < cards1.length && s.equals(cards1[idx1])) {
                idx1++;
            } else if (idx2 < cards2.length && s.equals(cards2[idx2])) {
                idx2++;
            } else {
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String[] args) {
        System.out.println(new E159994());
    }
}
