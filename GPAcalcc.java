import java.util.Scanner;
import java.io.*;

public class GPACalcc {
    public static void main(String [] args) throws FileNotFoundException{
        //adding file for future reference
        File myFile = new File("/Users/noahshelby/Desktop/Java Programs/gpa.txt");
        // adding scanner
        Scanner gpa = new Scanner(myFile);
        Scanner input = new Scanner(System.in);
        int userinput;
        //tells user to type 1 to create a student or -1 to terminate
        do{
            System.out.println("Enter 1 to create a student or -1 to terminate the program");
    
        userinput = input.nextInt();
        input.nextLine();
        if(userinput == 1){
            // asks the user to enter their name and grade
            System.out.println("Please type your name");
            String name = input.nextLine();
            System.out.println("Please enter your grade");
            String year = input.nextLine();
            // establishes the variables
            double mathgrade = 0;
        double englishgrade = 0;
        double historygrade = 0;
        double sciencegrade = 0;
        double foreignlanguagegrade = 0;
        double fineartgrade = 0;
        // collectgrade
        mathgrade = collectgrade("Math");
        englishgrade = collectgrade("English");
        historygrade = collectgrade("History");
        sciencegrade = collectgrade("Science");
        foreignlanguagegrade = collectgrade("Foreign Language");
        fineartgrade = collectgrade("Fine Art");
        GPAcalcstudent Student1 = new GPAcalcstudent(name, year, mathgrade, englishgrade, historygrade, sciencegrade, foreignlanguagegrade, fineartgrade);
        do{
            // calculates the average if the user types 1
            // prints grades into a seperate file if the user types 2
            // print strengths and weaknesses into a seperate file if the user types 3
            System.out.println("Enter 1 for average, Enter 2 for a report, and 3 for strengths and weaknesses or -1 to stop looking at this student");
            userinput = input.nextInt();
            input.nextLine();
            if(userinput == 1){
                System.out.println(Student1.getAverage());
            }
            else if(userinput == 2){
                Student1.generateReport();
            }
            else if(userinput == 3){
                Student1.strengthweak();
            }
        }
        while(userinput != -1);
        }
    }
    // if user types -1 it terminates the program
    while(userinput != -1);
        System.out.println("Thanks for using this program");

        }
        // A while loop that asks the user to enter their grades for each class
        // If user enters unacceptable number it will tell them to try again
        public static double collectgrade(String word){
            int check = 0;
            Scanner input = new Scanner(System.in);
            double examplegrade;
            do{
                System.out.println(" Please enter your "+ word +" grade ");
                examplegrade = input.nextDouble();
            if(examplegrade == 4.33 || examplegrade == 4.0 || examplegrade == 3.67 || examplegrade == 3.33 || examplegrade == 3.0 || examplegrade == 2.67 || examplegrade == 2.33 || examplegrade == 2.0 || examplegrade == 1.67 || examplegrade == 1.33 || examplegrade == 1.0 || examplegrade == 0.67 || examplegrade == 0.0){
                check = 1;
                
            }
                else{
                    System.out.println("That value is not acceptable, try again please ");
                }
            }
            while(check == 0);
            
            return examplegrade;}                

            
            }

