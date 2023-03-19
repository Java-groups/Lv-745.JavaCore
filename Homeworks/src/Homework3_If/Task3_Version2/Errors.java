package Homework3_If.Task3_Version2;

public enum Errors {
    BAD_REQUEST {
        public String getTitle() {
            return "Bad request";
        }
    },
    UNAUTHORIZED {
        public String getTitle() {
            return "Unauthorized";
        }
    },
    PAYMENT_REQUIRED {
        public String getTitle() {
            return "Payment request";
        }
    };

    public abstract String getTitle();

}
