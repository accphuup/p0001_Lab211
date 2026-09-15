
import java.util.Scanner;


/**
 * Class Unitity in role Validator to check valid input of users.
 * 
 * Version 16/09/2026
 * 
 * @author VinhHQHE194318
 */
public class Unitity {
    /**
     * Create Scanner with field private 
     */
    private static final Scanner sc = new Scanner(System.in);
    /**
     * Method validate input users.
     * @return 
     */
    public static int checkInputUsers(String message){
        String input;
        int number;
        while (true) {            
            try {
                System.out.println(message);
                input = sc.nextLine();
                number = Integer.parseInt(input);
                if (number > 0) {
                    return number;
                }else{
                    System.err.println("Input must be a positive number!!");
                }
            } catch (Exception e) {
                System.err.println("Invalid. Input must be an Integer!!");
            }
        }
    }
}
