package programmers.java;

public class E120894 {
    public long solution(String numbers) {
        String[] l = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        for (int i = 0; i < l.length; i++) {
            numbers = numbers.replace(l[i], String.valueOf(i));
        }
        return Long.valueOf(numbers);
    }

    public static void main(String[] args) {
        System.out.println(new E120894().solution("onetwothreefourfivesixseveneightnine"));
    }
}
