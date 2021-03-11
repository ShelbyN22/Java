import java.util.Scanner;

public class ProgrammingProjects1 {
    public static void main(String [] args){
        String answer = "";
        do{
        System.out.println("Please enter a number (1-100)");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        if(number == 100)
            System.out.println("C");
        else{
            int temp = number%10;
            number = number/10;
            switch (number){
                case 0:
                printnumber(temp);
                break;
                case 1:
                System.out.print("X");
                printnumber(temp);
                break;
                case 2:
                System.out.print("XX");
                printnumber(temp);
                break;
                case 3:
                System.out.print("XXX");
                printnumber(temp);
                break;
                case 4:
                System.out.print("IV");
                printnumber(temp);
                break;
                case 5:
                System.out.print("L");
                printnumber(temp);
                break;
                case 6:
                System.out.print("LX");
                printnumber(temp);
                break;
                case 7:
                System.out.print("LXX");
                printnumber(temp);
                break;
                case 8:
                System.out.print("LXXX");
                printnumber(temp);
                break;
                case 9:
                System.out.print("XC");
                printnumber(temp);
                break;

            }
            System.out.println(" Do you want to try another number ");
            answer = input.next();
        }
     } while(answer.contains("y"));
   }
   public static void printnumber(int noah){
        switch (noah){
            case 0:
            System.out.println();
            break;
            case 1:
            System.out.println("I");
            break;
            case 2:
            System.out.println("II");
            break;
            case 3:
            System.out.println("III");
            break;
            case 4:
            System.out.println("IV");
            break;
            case 5:
            System.out.println("V");
            break;
            case 6:
            System.out.println("VI");
            break;
            case 7:
            System.out.println("VII");
            break;
            case 8:
            System.out.println("VIII");
            break;
            case 9:
            System.out.println("IX");
            break;
        }
   }
}

