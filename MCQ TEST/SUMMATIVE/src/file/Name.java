package file;

import java.util.Scanner;

public class Name {
    static String name;
    public static void name() {
        //input name
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Name : ");
        name = scan.nextLine();
        // end of input name

    }
}
