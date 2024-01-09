package programmers.java.level1;

public class E67256 {
    public String solution(int[] numbers, String hand) {
        int[] left = { 3, 0 }, right = { 3, 2 };
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            switch (numbers[i]) {
                case 1:
                case 4:
                case 7:
                    sb.append("L");
                    left[0] = (numbers[i] - 1) / 3;
                    left[1] = 0;
                    break;
                case 3:
                case 6:
                case 9:
                    sb.append("R");
                    right[0] = (numbers[i] - 1) / 3;
                    right[1] = 2;
                    break;
                default:
                    int y = numbers[i] == 0 ? 3 : numbers[i] / 3;
                    int ld = Math.abs(left[0] - y) + Math.abs(left[1] - 1);
                    int rd = Math.abs(right[0] - y) + Math.abs(right[1] - 1);
                    if (ld < rd) {
                        left[0] = y;
                        left[1] = 1;
                        sb.append("L");
                    } else if (ld > rd) {
                        right[0] = y;
                        right[1] = 1;
                        sb.append("R");
                    } else {
                        if (hand.equals("left")) {
                            left[0] = y;
                            left[1] = 1;
                            sb.append("L");
                        } else {
                            right[0] = y;
                            right[1] = 1;
                            sb.append("R");
                        }
                    }
                    break;

            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new E67256().solution(new int[] { 7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2 }, "left"));
    }
}
