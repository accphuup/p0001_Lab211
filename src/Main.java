
/**
 * Class Main in role controller thread code to run program.
 * 
 * Version 16/09/2026
 * 
 * @author VinhHQHE194318
 */
public class Main {
    public static void main(String[] args) {
        // init object
        Unitity unitity = new Unitity();
        BubbleSort bubblesort = new BubbleSort();
        
        // Step 1: display message require user enter number of array and validate input users.
       int size = unitity.checkInputUsers("Enter number of array: ");
        
        // Step 2: call method generateRandomNumber and inject size. 
        bubblesort.generateRandomNumber(size);
        
        // Step 3: display Unsorted array.
        System.out.print("Unsorted array: ");
        bubblesort.display();
        
        // Step 4: call method bubblesort to sort by order.
        bubblesort.bubblesort();
        
        //Step 5: display Sorted array.
        System.out.print("Sorted array: ");
        bubblesort.display();
    }
}
