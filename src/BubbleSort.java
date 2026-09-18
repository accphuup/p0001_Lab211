
import java.util.Random;

/**
 * Class BubbleSort in role service to process algorithm and generate random
 * number. 
 * 
 * Version 16/9/2026
 * @author VinhHQHE194318
 */
public class BubbleSort {

    private static int arrayOfElements[];

    /**
     * Method generate random number in array with length of array is input
     * users.
     *
     * @param size to stored length of array from input users.
     */
    public static void generateRandomNumber(int size) {
        arrayOfElements = new int[size];
        Random random = new Random();
        for (int i = 0; i < arrayOfElements.length; i++) {
            arrayOfElements[i] = random.nextInt(10);
        }
    }

    /**
     * Method bubblesort process algorithm bubblesort to sort by increasing
     * order.
     */
    public static void bubbleSort() {
        int temp;

        //Loop 1: iterate all elements in array. 
        for (int i = 0; i < arrayOfElements.length; i++) {
                //Loop 2: Each element pass will comparing and move biggest number to the end.
            for (int j = 0; j < arrayOfElements.length - 1 - i; j++) {
                if (arrayOfElements[j] > arrayOfElements[j + 1]) {
                    temp = arrayOfElements[j];
                    arrayOfElements[j] = arrayOfElements[j + 1];
                    arrayOfElements[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Method display array
     */
    public static void display() {
        System.out.print("[");
        for (int i = 0; i < arrayOfElements.length; i++) {
            System.out.print(arrayOfElements[i]);
            if (i < arrayOfElements.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
