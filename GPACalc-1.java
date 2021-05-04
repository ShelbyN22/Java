import java.util.Scanner;
import java.io.*;

public class GPACalc {
    public static void main(String [] args) throws FileNotFoundException{
        File myFile = new File("/Users/noahshelby/Java-2/gpa.txt");
        Scanner gpa = new Scanner(myFile);
        Scanner input = new Scanner(System.in);
        //double historygrade = input.nextDouble();
        //double sciencegrade = input.nextDouble();
        //double foreignlanguagegrade = input.nextDouble();
        //double fineartgrade = input.nextDouble();
        int check = 0;
        double mathgrade = 0;
        double englishgrade = 0;
        double historygrade = 0;
        double sciencegrade = 0;
        double foreignlanguagegrade = 0;
        double fineartgrade = 0;
        mathgrade = collectgrade("Math");
        englishgrade = collectgrade("English");
        historygrade = collectgrade("History");
        sciencegrade = collectgrade("Science");
        foreignlanguagegrade = collectgrade("Foreign Language");
        fineartgrade = collectgrade("Fine Art");

        }
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
            
            return examplegrade;
        }
    }


