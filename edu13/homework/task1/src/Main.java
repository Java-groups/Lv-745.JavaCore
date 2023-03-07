import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        String message = "abcd";
        int n = 2;
        String encrypt = encrypt(message, n);
        System.out.println(encrypt);
        String decrypted = decrypt(encrypt, n);
        System.out.println(decrypted);
    }

    public static String encrypt(String s, int n) {
        Function<Character, Character> encryptString = c -> {
            if (Character.isLetter(c)) {
                int code = ((int) c + n - (int) 'a') % 26 + (int) 'a';
                return (char) code;
            } else {
                return c;
            }
        };
        return transformString(s, encryptString);
    }

    public static String decrypt(String s, int n) {
        Function<Character, Character> decryptFn = c -> {
            if (Character.isLetter(c)) {
                int code = ((int) c - n - (int) 'a' + 26) % 26 + (int) 'a';
                return (char) code;
            } else {
                return c;
            }
        };
        return transformString(s, decryptFn);
    }

    private static String transformString(String s, Function<Character, Character> fn) {
        StringBuilder result = new StringBuilder();
        s.chars().mapToObj(c -> (char) c).forEach(c -> result.append(fn.apply(c)));
        return result.toString();
    }

}