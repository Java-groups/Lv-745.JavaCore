public class Task5 {
    public static String palindrome() {
        String str = "ABCCBA";
        boolean isPalindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            return (str + " is a palindrome.");
        } else {
            return (str + " is not a palindrome.");
        }
    }
}
