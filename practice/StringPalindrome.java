package practice;

public class StringPalindrome {
    public static void main(String[] args) {
        String word = "abcba";
        boolean palindrome = isPalindrome(word);
        System.out.println(palindrome);
    }

    private static boolean isPalindrome(String word) {
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
