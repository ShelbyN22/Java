import java.util.*;

//Write a game of Hangman using arrays. Allow the user to guess letters and represent which letters have been guessed in an array
public class Hangman {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Random person = new Random();
        String[] noah = {"Noah", "Shelby", "Java", "Computer", "Help", "Science", "Math", "History", "English", "Spanish"};
        int index = person.nextInt(noah.length);
        String word = noah[index];
        int life = word.length();
        char[] real = new char[life];
        char[] guess = new char[life];
        for(int i=0; i<index; i++){
                real[i] = word.charAt(i);
            }
        Arrays.fill(guess,'_');
        int count = 0;
        int total = life;
        while(life>0 && total!= 0){
            System.out.println(Arrays.toString(guess));
            System.out.println("Guess a letter please");
            String letter = input.next();
            char temp = letter.charAt(0);
            for(int i=0; i<word.length(); i++){
                if(real[i] == temp){
                    guess[i] = temp;
                    count ++;
                    total --;
                }
            }
            if(count == 0){
                life --;
            }
            else{
                count = 0;
            }
            System.out.println(Arrays.toString(guess));
            }
            if(total == 0){
                System.out.println("You guessed it!");
            }
            else{
                System.out.println("You lost");
            }
        }
    }

