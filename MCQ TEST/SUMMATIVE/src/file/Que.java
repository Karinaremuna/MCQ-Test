package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Que {
    public static void Opti(String excData ) throws FileNotFoundException {
        String line= "";
        String splitBy = ",";
        String answerAl, answer;
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        //Question and answer
        try {
            BufferedReader read = new BufferedReader(new FileReader(excData));

            while ((line = read.readLine())!=null) {
                String[] opt = line.split(splitBy);

                num++;

                do {
                    System.out.println("\n" + num + "." + opt[0]);
                    System.out.println("Options : ");

                    for (int i = 1; i < 5; i++) {
                        System.out.println("\t"+opt[i]);
                    }
                    System.out.println("Your answer : ");
                    answerAl = scanner.next();
                    System.out.print("\n");

                    if (answerAl.equalsIgnoreCase("a")){
                        answer = opt[1];
                    }else if (answerAl.equalsIgnoreCase("b")){
                        answer = opt[2];
                    }else if (answerAl.equalsIgnoreCase("c")) {
                        answer = opt[3];
                    } else if (answerAl.equalsIgnoreCase("d")){
                        answer = opt[4];
                    }else {
                        System.out.println("Choose between A-D!");
                        answer = "False";
                    }

                    // checker
                }while (!(answerAl.equalsIgnoreCase("a") || answerAl.equalsIgnoreCase("b") ||
                        answerAl.equalsIgnoreCase("c") || answerAl.equalsIgnoreCase("d")));

                System.out.println("Your answer is " + answerAl + ".");
                if (answer.equals(opt[5])) {
                    score+=1;
                    System.out.println("True");;
                } else if ((answer.equals(opt[5])) == false){
                    System.out.println("False! The correct answer is "+opt[5]+".");
                }
                System.out.println("\n");
                //end of answer checker
            }
            //Final score
            System.out.println(Name.name + " you answered " + score+ " questions right and " + (num-score)+" "+
                    "question wrong, out of "+ num+ " questions. Your total score is "+ ((score*100)/num)+"%");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
