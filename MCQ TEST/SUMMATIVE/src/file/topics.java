package file;

import java.io.*;
import java.util.Scanner;

public class topics extends Que {
    public static String topics, excData = "";
    public static int num = 0;

    public static void setTopics() throws FileNotFoundException {
        //file folder
        Scanner scanner = new Scanner(System.in);

        String[] dataIn;
        File f = new File("Data");
        dataIn = f.list();
        System.out.println(" ");
        //end of file folder


        //choose topic
        do {
            System.out.println("Choose your topic : ");
            num = 0;
            for (String pathname : dataIn) {
                num++;

                StringBuilder build = new StringBuilder(pathname);
                String newNum = "\t" + num + ". ";

                build.delete(pathname.length() - 4, pathname.length());
                System.out.println(newNum + build);
            }
            System.out.print("Your topic : ");
            topics = scanner.next();

            if (topics.equals("1")) {
                excData = "Data\\HTML & CSS.csv";
                Opti(excData);
            } else if (topics.equals("2")) {
                excData = "Data\\Java.csv";
                Opti(excData);
            } else {
                System.out.println("Please select 1 or 2\n");
                setTopics();
            }


        } while ((topics.equals("1") || topics.equals("2")) == false);
    }
}
