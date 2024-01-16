package programmers.java.level1;

public class E161990 {
    public int[] solution(String[] wallpaper) {
        int[] ret = { 100, 100, -1, -1 };
        for (int i = 0; i < wallpaper.length; i++) {
            if (wallpaper[i].contains("#")) {
                ret[0] = Math.min(ret[0], i);
                ret[1] = Math.min(ret[1], wallpaper[i].indexOf("#"));
                ret[2] = Math.max(ret[2], i + 1);
                ret[3] = Math.max(ret[3], wallpaper[i].lastIndexOf("#") + 1);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(new E161990().solution(new String[] { ".#...", "..#..", "...#." }));
    }
}
