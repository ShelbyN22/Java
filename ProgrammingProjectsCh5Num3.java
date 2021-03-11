import java.util.Scanner;

public class ProgrammingProjectsCh5Num3{
    public static void main(String [] args){
        System.out.println("Please enter your GPA");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        if(number >= 0.0)
            System.out.println("Please enter your ACT score");
            Scanner keyboard = new Scanner(System.in);
            int noah = input.nextInt();

            if(noah >= 0.0)
                System.out.println("Please enter your SAT score");
                Scanner punch = new Scanner(System.in);
                int ned = input.nextInt();

                if(ned >=1200) if(noah >= 25) if(number >= 2.5)
                    System.out.println("Your grades are sufficient");
                    
        System.out.println("Student 2, Please enter your GPA");
            Scanner sprite = new Scanner(System.in);
            int lemon = input.nextInt();
                        
            if(lemon >= 0.0)
                System.out.println("Please enter your ACT score");
                    Scanner coke = new Scanner(System.in);
                    int cola = input.nextInt();
                
            if(cola >= 0.0)
                    System.out.println("Please enter your SAT score");
                        Scanner fanta = new Scanner(System.in);
                        int orange = input.nextInt();
                
            if(orange > ned) if(cola > noah) if(lemon > number)
                    System.out.println("Student 2 is more qualified");

            if(ned > orange) if(noah > cola) if(number > lemon)
                    System.out.println("Student 1 is more qualified");   
            
            if(orange == ned) if(noah == cola) if(number == lemon)
                    System.out.println("Both students are equally qualified");
    }
    
}