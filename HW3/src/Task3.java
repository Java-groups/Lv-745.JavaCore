import java.util.Scanner;

public class Task3 {
    enum ErrorCode {
        ERROR_400("Bad Request"),
        ERROR_401("Unauthorized"),
        ERROR_402("Payment Required"),
        ERROR_403("forbidden"),
        ERROR_404("Page not found"),
        ERROR_405("Method not allowed"),
        ERROR_406("ot Acceptable")
        ;

        private final String name;

        ErrorCode(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter HTTP error code: ");
        int errorCode = scanner.nextInt();

        for (ErrorCode code : ErrorCode.values()) {
            if (code.name().equals("ERROR_" + errorCode)) {
                System.out.println("HTTP Error " + errorCode + ": " + code.getName());
                return;
            }
        }

        System.out.println("Unknown HTTP error code");
    }
}
