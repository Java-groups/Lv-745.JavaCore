package pt3;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String[] userNames = {"JohnDoe123", "Jane_Smith", "User-Name", "a", "abcdefghijklmnopqrstuvwxyz012345"};

        // Define the regular expression to match user names
        String regex = "^[a-zA-Z0-9_]{3,15}$";
        Pattern pattern = Pattern.compile(regex);

        // Check the validity of each user name
        for (String userName : userNames) {
            boolean isValid = pattern.matcher(userName).matches();
            String result = isValid ? "valid" : "invalid";
            System.out.println("User name " + userName + " is " + result);
        }

            }
        }


