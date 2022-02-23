package OtherClass;

import java.util.Scanner;

public class User {
    Scanner scan = new Scanner(System.in);
    String userName;

    public String UserName(){
        System.out.println("Your name: ");

        userName = scan.nextLine();

        return userName;
    }

    public String getUserName() {
        return userName;
    }
}
