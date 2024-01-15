package programmars.java.level0;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E120838 {
    public String solution(String letter) {
        Map<String, String> morse = new HashMap<>();
        String[] s = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f','--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l','--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r','...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x','-.--':'y','--..':'z'"
                .replace("'", "").split(",");
        for (int i = 0; i < s.length; i++) {
            String[] tmp = s[i].split(":");
            morse.put(tmp[0], tmp[1]);
        }
        return Stream.of(letter.split(" ")).map(e -> morse.get(e)).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(new E120838());
    }
}
