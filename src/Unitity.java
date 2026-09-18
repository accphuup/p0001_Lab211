import java.util.Scanner;

/**
 * Class Unitity in role validate to check valid input users.
 * 
 * Version 16/9/2026
 * @author VinhHQHE194318
 */
public class Unitity {

    /**
     * init Scanner with field private ensure safely
     */
    private static final Scanner sc = new Scanner(System.in);

    /**
     * Method check valid input users.
     *
     * @param message
     * @return
     */
    public static int checkValidInput(String message) {
        String input;
        int number;
        while (true) {
            try {
                System.out.println(message);
                input = sc.nextLine().trim();
                number = Integer.parseInt(input);
                if (number > 0) {
                    return number;
                } else {
                    System.err.println("Input must be a positive number!");
                }
            } catch (Exception e) {
                System.err.println("Input must be an Integer!");
            }
        }
    }
}
