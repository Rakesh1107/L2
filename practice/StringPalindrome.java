package practice;

public class StringPalindrome {
    public static void main(String[] args) {
        String word = "";
        boolean palindrome = isPalindrome(word);
        System.out.println(palindrome);
    }

    private static boolean isPalindrome(String word) {

        if (word == null || word.length() == 0) return false;

        int start = 0, end = word.length()-1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }


}
