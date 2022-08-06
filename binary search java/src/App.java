//jEREMY BARGY 8/5/2022
// BINARY SEARCH 
import java.util.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // INITIALIZE VARIABLES & OBJECTS
        Random rand = new Random();
        Scanner get= new Scanner(System.in); 
        int choice = 0;
        String line_sep = "-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-";

        // WELCOME TEXT
        System.out.println(line_sep + "\n");
        System.out.println("Hello, World!\nThis program is an implementation of the binary search utitizing the binary search method of the Arrays class.");
        System.out.println("We will use an array of 10000 numbers with values ranging from 0 to 30000");
        System.out.println("Enter any letter key to continue: ");
        get.next();

        do {
            System.out.println("\n" + line_sep + "\n");
            // CREATE ARRAY WITH ALLOCATED MEMORY OF 10000
            System.out.println("|- CREATING ARRAY - |");
            int[] arr = new int[10000];
            System.out.println("|- CREATING ARRAY FINISHED - |");

            // FILL ARRAY WITH RANDOM VALUES UP TO 30000
            System.out.println("|- FILLING ARRAY WITH VALUES - |");
            for ( int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt(30000);
            }
            // SORT ARRAY
            Arrays.sort(arr);

            //CREATE SEARCH KEY WITH RANDOM VALUE UP TO 30000
            int search_key = rand.nextInt(30000);
            System.out.println("|- SELECT RANDOMIZED SEARCH VALUE - |");
            System.out.println("|- SEARCH KEY -> " + search_key +" - |");
            System.out.println("\n" + line_sep + "\n");

            System.out.println("Begin binary search? | Enter any key to continue: ");
            get.next();
            
            // USE BINARY SEARCH METHOD TO FIND INDEX OF SEARCH KEY
            int result_index = Arrays.binarySearch(arr, search_key);

            System.out.println("\n-----------\n| Results |\n-----------");
            if (result_index >= 0)
            System.out.println("| " + search_key + " found @ index " + result_index + "|");
            else
                System.out.println("| " + search_key + " was not found in the list |");
            System.out.println("------------------------------");
            // ASK USER TO SEE CREATED ARRAY
            System.out.println("\n" + line_sep + "\n");
            System.out.println("Enter the 1 key to see array | 0 to continue: ");
            int see_arr = get.nextInt();
            System.out.println("----> USER ENTERED -> " + see_arr);

            // SHOW CREATED ARRAY
            if (see_arr == 1) {
                System.out.println("\n" + line_sep + "\n");
                System.out.println(Arrays.toString(arr));
                //System.out.println("\n" + line_sep + "\n");
            }

            // ASK USER TO RUN PROGRAM AGAIN
            System.out.println("\n" + line_sep + "\n");
            System.out.println("Enter the 0 key to run again | 1 to exit program ");
            choice = get.nextInt();
            System.out.println("----> USER ENTERED -> " + choice);
           
        } while (choice == 0);
    
        get.close();
        System.out.println("\n" + line_sep + "\n");
        System.out.println("Thanks for using this program");
        System.out.println("\n" + line_sep + "\n");

    }

}
