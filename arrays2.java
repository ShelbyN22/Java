import java.util.*;

public class arrays2{
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
        System.out.println("How many days of temperature do you want");
        int days = input.nextInt();
        int temperatures[]= new int[days];
        int sum = 0;
        int daysabove = 0;
        double average;
        for(int i=0; i<days; i++){
            System.out.println("What is the temperature");
            temperatures[i]= input.nextInt();
            sum += temperatures[i];
        }
        average = (double)sum/days;
        System.out.printf("Average temp = %.1f %n", average);
        for(int j=0; j<days; j++){
            if(temperatures[j]>average){
                daysabove++;
            }
        }
        System.out.printf("%d days were above average", daysabove);
        System.out.println("Temperatures: "+Arrays.toString(temperatures));
}
    }