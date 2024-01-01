package programmers.java.foundation;

import java.util.*;

public class E181926 {
    public int solution(int n, String control) {
        for (int i = 0; i < control.length(); i++) {
            char x = control.charAt(i);
            switch (x) {
                case 'w':
                    n++;
                    break;
                case 's':
                    n--;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
                default:
                    break;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(new E181926().solution(0, "wsdawsdassw"));
    }
}
