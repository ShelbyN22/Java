import java.util.*;

public class Projectnum1 {
    
    //Java’s type int has a limit on how large an integer it can store. This limit can be circumvented by representing an integer as an array of digits. 
    //Write an interactive program that adds two integers of up to 50 digits each.
    public static void main(String [] args){
        Random randy = new Random();
        int[] firstnum = new int[50];
        int[] secondnum = new int[50];
    for(int i=0; i<50; i++){
            firstnum[i]= randy.nextInt(10);
            secondnum[i]= randy.nextInt(10);
        }
        System.out.println(Arrays.toString(firstnum));
        System.out.println(Arrays.toString(secondnum));


        int [] sumArray = new int[51];
        int carryOn = 0;
        for(int i=49; i >=0; i--){
            int temp = firstnum[i]+ secondnum[i];                         //temp = 17
            sumArray[i+1]= temp%10;             //sumArray[49] = 7
            carryOn = temp/10;                                              //carryOn = 1
            System.out.println(Arrays.toString(sumArray));

    }
    }
    }

