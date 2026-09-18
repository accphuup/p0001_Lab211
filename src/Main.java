
/**
 * Class Main in role controller to run program.
 * Version 16/9/2026
 *
 * @author VinhHQHE194318
 */
public class Main {

    public static void main(String[] args) {
        //init object of class
        BubbleSort bubble = new BubbleSort();
        Unitity unitity = new Unitity();

        // Step 1: require users enter number of array and check valid input of users.
        int size = unitity.checkValidInput("Enter number of aray: ");

        // Step 2: call method generateRandomNumber to random number in array.
        bubble.generateRandomNumber(size);

        // Step 3: display Unsorted number.
        System.out.print("Unsorted array: ");
        bubble.display();

        //Step 4: call method bubblesort to sort by increasing order
        bubble.bubbleSort();

        //Step 5: display sorted array
        System.out.print("Sorted array: ");
        bubble.display();

    }
}
