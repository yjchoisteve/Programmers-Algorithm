package programmers.java.level2;

public class E250135 {
    public int solution(int h1, int m1, int s1, int h2, int m2, int s2) {
        return alarmCount(toSeconds(h2, m2, s2)) - alarmCount(toSeconds(h1, m1, s1))
                + (isOperlapped(h1, m1, s1) ? 1 : 0);
    }

    int alarmCount(int s) {
        int hAlarmCnt = (int) (s * 719 / 43200.0);
        int mAlarmCnt = (int) (s * 59 / 3600.0);
        return 1 + hAlarmCnt + mAlarmCnt - (s >= 12 * 3600 ? 1 : 0);
    }

    int toSeconds(int h, int m, int s) {
        return s + m * 60 + h * 3600;
    }

    boolean isOperlapped(int h, int m, int s) {
        double hAngle = (h * 30 + m * 0.5 + s * 0.5 / 60) % 360;
        double mAngle = m * 6 + s * 0.1;
        double sAngle = s * 6;
        return hAngle == sAngle || mAngle == sAngle;
    }

    public static void main(String[] args) {
    }
}
