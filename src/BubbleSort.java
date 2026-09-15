
import java.util.Random;


/**
 * Class BubbleSort in role Service to process algorithm and generate random number of array.
 * 
 * Version 16/09/2026
 *
 * @author VinhHQHE194318
 */
public class BubbleSort {
    private int arr[];
    /**
     * Method bubblesort process algorithm bubblesort to sort by increasing order.
     */
    public void bubblesort(){
        int temp;
        //Loop 1: Interate through the each element.
        for (int i = 0; i < arr.length; i++) {
            //Loop 2: Move all elements bigger to the end and swap all elements smaller to ahead. 
            for (int j = 0; j < arr.length -1 -i; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    /**
     * Method generateRandomNumber to random each elements in array.
     * @param size 
     */
    public void generateRandomNumber(int size){
        arr = new int [size];
          Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10);
        }
    }
    
    /**
     * Method to display array.
     */
    public void display(){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length -1) {
                System.out.print(", ");
            }
        }   
        System.out.println("]");
    }
}
