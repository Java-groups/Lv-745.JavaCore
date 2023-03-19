package Homework3_If.Task3_Version1;

public enum Errors {
    BAD_REQUEST {
        public int getCode() {
            return 400;
        }

        public String getTitle() {
            return "Bad request";
        }
    },
    UNAUTHORIZED {
        public int getCode() {
            return 401;
        }

        public String getTitle() {
            return "Unauthorized";
        }
    },
    PAYMENT_REQUIRED {
        public int getCode() {
            return 402;
        }

        public String getTitle() {
            return "Payment request";
        }
    };

    public abstract String getTitle();

    public abstract int getCode();
}
