package set3;

public class ExpandString {
    public static void main(String[] args) {
        String word = "a1b10";

        String result = expand(word);
        System.out.println(result);
    }

    private static String expand(String word) {
        StringBuilder sb = new StringBuilder();

        char c = ' ';
        int count;
        for (int i = 0; i < word.length()-1; i++) {
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                c = word.charAt(i);
            }
            else {
                count = Integer.parseInt(String.valueOf(word.charAt(i)));
                if (word.charAt(i+1) >= '0' && word.charAt(i+1) <= '9') {
                    count = count * 10 + Integer.parseInt(String.valueOf(word.charAt(i+1)));
                }
                sb.append(String.valueOf(c).repeat(Math.max(0, count)));
            }
        }
        return sb.toString();
    }
}
