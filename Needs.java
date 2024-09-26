public class Descending{

     public static void main(String []args){
        int[] numerals = {1, 67, 3, 34, 5};
        System.out.println("ELEMENTS: "+Arrays.toString(numerals));
        //Sorting the Arrays
        Arrays.sort(numerals);
        
        System.out.println("SORTED ELEMENTS:"+Arrays.toString(numerals));
        
        // Initializing the array
        Integer array[] = { 1, 2, 3, 4, 5 };

        // Sorting the array in descending order
        Arrays.sort(array, Collections.reverseOrder());

        // Printing the elements
        System.out.println(Arrays.toString(array));
    }
}
