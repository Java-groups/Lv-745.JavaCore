package home3;

import java.util.Scanner;

public class Home3 {
    enum Error {
        BADREQUEST, UNAUTHORIZED, PAYMENTREQUIRED, FORBIDDEN, NOTFOUND
    }
    public static void main(String[] args) {

        Error myError = Error.NOTFOUND;


        //Scanner scanner = new Scanner(System.in);
        //int HTTPError = scanner.nextInt();

        switch (myError) {
            case BADREQUEST:
                System.out.println("Error is 400");
                break;
            case UNAUTHORIZED:
                System.out.println("Error is 401");
                break;
            case PAYMENTREQUIRED:
                System.out.println("Error is 402");
                break;
            case FORBIDDEN:
                System.out.println("Error is 403");
                break;
            case NOTFOUND:
                System.out.println("Error is 404");
                break;
            default:
                System.out.println("Error");
        }

    }


}
