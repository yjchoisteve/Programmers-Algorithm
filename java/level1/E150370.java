package programmers.java.level1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class E150370 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate today2 = LocalDate.parse(today, formatter);
        return IntStream.rangeClosed(1, privacies.length).filter(i -> {
            String[] tmp = privacies[i - 1].split(" ");
            LocalDate start = LocalDate.parse(tmp[0], formatter);
            int month = Integer.parseInt(
                    Stream.of(terms).filter(e2 -> e2.contains(tmp[1])).toArray(String[]::new)[0].split(" ")[1]);
            if (ChronoUnit.MONTHS.between(start, today2) >= month) {
                return true;
            }
            return false;
        }).toArray();
    }

    public static void main(String[] args) {
        System.out.println(new E150370().solution("2022.05.19", new String[] { "A 6", "B 12", "C 3" },
                new String[] { "2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C" }));
    }
}
