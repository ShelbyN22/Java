import java.util.Scanner;
import java.io.*;

public class GPACalc {
    public static void main(String [] args) throws FileNotFoundException{
        File myFile = new File("/Users/noahshelby/Java-2/gpa.txt");
        Scanner gpa = new Scanner(myFile);
        System.out.println("Please enter your Math Grade");
        Scanner input = new Scanner(System.in);
        double mathgrade = input.nextDouble();
        double englishgrade = input.nextDouble();
        double historygrade = input.nextDouble();
        double sciencegrade = input.nextDouble();
        double foreignlanguagegrade = input.nextDouble();
        double fineartgrade = input.nextDouble();

        if(mathgrade == 4.33)
            System.out.println("Enter your English Grade");
                if(englishgrade == 4.33)
                    System.out.println("Enter your History Grade");

            if(mathgrade == 4.0)
            System.out.println("Enter your English Grade");

            if(mathgrade == 3.67)
            System.out.println("Enter your English Grade");

            if(mathgrade == 3.33)
            System.out.println("Enter your English Grade");

            if(mathgrade == 3.0)
            System.out.println("Enter your English Grade");

            if(mathgrade == 2.67)
            System.out.println("Enter your English Grade");

            if(mathgrade == 2.33)
            System.out.println("Enter your English Grade");

            if(mathgrade == 2.0)
            System.out.println("Enter your English Grade");

            if(mathgrade == 1.67)
            System.out.println("Enter your English Grade");

            if(mathgrade == 1.33)
            System.out.println("Enter your English Grade");

            if(mathgrade == 1.0)
            System.out.println("Enter your English Grade");

            if(mathgrade == 0.67)
            System.out.println("Enter your English Grade");

            if(mathgrade == 0.0)
            System.out.println("Enter your English Grade");



        }

    }

