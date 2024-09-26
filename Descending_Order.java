import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Descending_Order{
    
   public static void main(String[] args) 
   {
    Scanner sc = new Scanner(System.in);

    //Take the array size from the user
    System.out.println("Enter the size of the array:");
    int arr_size = 0;

    if (sc.hasNextInt()){
        arr_size = sc.nextInt();
    }

    //Initialize the array's
    //size using user input

    int[] arr = new int[arr_size];

    //Take user elements for the array
    System.out.println("ENTER ELEMENTS:");

    for(int i = 0; i< arr_size; i++){
        if(sc.hasNextInt()){
            arr[i] = sc.nextInt();
        }
    }

    System.out.println("ELEMENTS :");

    for(int i = 0;i<arr_size; i++){
//Prints the elements of an array
        System.out.println("ELEMENT "+i+": "+arr[i]);
    }

//Printing in descending Order



for(int i = 0;i<arr_size; i++){
    //Prints the elements of an array
    Arrays.sort(arr[i],Comparator.reverseOrder());
    
            System.out.println("ELEMENT "+i+": "+Arrays.toString(arr[i]));
        }
        sc.close();

    }
    
       
}