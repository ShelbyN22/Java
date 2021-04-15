import java.io.*;
import java.util.*;

public class EmployeeHours {
    public static void main(String [] args) throws FileNotFoundException{
        File myFile = new File("/Users/noahshelby/Java-2/hours.txt");
        Scanner input = new Scanner(myFile);
        int id = 0;
        String name = " ";
        double hours = 0;
        int days = 0;
        Scanner line; 
        while(input.hasNextLine()){
            line = new Scanner(input.nextLine());
            while(line.hasNext()){
                id = line.nextInt();
                name = line.next();
                while(line.hasNext()){
                    hours = hours+line.nextDouble();
                    days++;
                }
                System.out.printf(name+" ID#"+ id + " worked "+ hours+" hours "+ "( "+ hours/days+ " hours/day) ");
            }
            days = 0;
        }
    }
}
