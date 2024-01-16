package programmers.java.level1;

public class E72410 {
    public String solution(String new_id) {
        String tmp = new_id.toLowerCase().replaceAll("[^a-z0-9_\\-.]", "").replaceAll("\\.{2,}", ".")
                .replaceFirst("^\\.", "")
                .replaceFirst("\\.$", "");
        tmp = tmp.isBlank() ? "a" : tmp;
        tmp = tmp.substring(0, Math.min(15, tmp.length()))
                .replaceFirst("^\\.", "")
                .replaceFirst("\\.$", "");
        tmp += tmp.substring(tmp.length() - 1).repeat(Math.max(0, 3 - tmp.length()));
        return tmp;
    }

    public static void main(String[] args) {
        System.out.println(new E72410().solution("z-+.^."));
    }
}
