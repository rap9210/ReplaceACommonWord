import java.lang.reflect.Array;
import java.util.Scanner;

public class ReplaceACommonWord {
    public static void main(String[] args){
        /*
        Initiate variables for inputs for running program and taking in
        text.
        Split entered text and use a loop to find and replace every instance
        of the word the with be.
         */
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to BE replacement");
        System.out.println("Enter 'y' to initiate program, or 'q' to end: ");
        String user_answer = scn.nextLine();
        /*
        while loop so that user is forced to enter a correct answer to play or to end.
         */
        while ((!user_answer.equals("y"))&&(!user_answer.equals("q"))){
            System.out.println("Please input a valid entry.");
            System.out.println("Enter 'y' to initiate program, or 'q' to end: ");
            user_answer = scn.nextLine();
        }
        /*
        main loop: Display text communicating beginning of game.
        Prompts user for a sentence to be edited.
         */
        while(user_answer.equals("y")){
            System.out.println("Hiya! Welcome to BE replacement!");
            System.out.println("Now enter a sentence to see what happens!");
            String user_text = scn.nextLine();
            /*
            .split(" ") to split the String by its blank spaces
            into an array of Strings.
             */
            String u_text_array[] = user_text.split(" ");
            /*
            for loop that finds the strings that match the ones i want to replace and
            replace their value.
             */
            for (int i = 0; i < Array.getLength(u_text_array); i++){
                if ((u_text_array[i].equalsIgnoreCase("the"))){
                    u_text_array[i] = "BE";
                    System.out.print(u_text_array[i]+" ");
                }
                else{
                    System.out.print(u_text_array[i]+" ");
                }
            }
            System.out.println();
            System.out.println("Enter 'y' to initiate program again , or 'q' to end: ");
            user_answer = scn.nextLine();
        }
    }
}
