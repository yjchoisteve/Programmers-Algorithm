package programmers.java.level0;

import java.util.Arrays;
import java.util.Scanner;

public class E120861 {
    public int[] solution(String[] keyinput, int[] board) {
        int xMin = -(board[0] / 2), xMax = board[0] / 2, yMin = -(board[1] / 2), yMax = board[1] / 2;
        int[] ret = { 0, 0 };
        for (String s : keyinput) {
            switch (s) {
                case "left":
                    if (ret[0] > xMin)
                        ret[0]--;
                    break;
                case "right":
                    if (ret[0] < xMax)
                        ret[0]++;
                    break;
                case "up":
                    if (ret[1] < yMax)
                        ret[1]++;
                    break;
                case "down":
                    if (ret[1] > yMin)
                        ret[1]--;
                    break;
                default:
                    break;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        // new E120861().solution(new String[] { "left", "right", "up", "right", "right"
        // }, new int[] { 11, 11 });
        new E120861().solution(new String[] { "down", "down", "down", "down", "down" }, new int[] { 7, 9 });
    }
}
