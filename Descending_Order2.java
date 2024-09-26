
import java.util.Arrays;
import java.util.Comparator;

public class Descending_Order2 {
    public static void main(String[] args) {
        int[] mian = {1, 2, 3, 4, 5};
        
        Arrays.sort(mian,Comparator.reverseOrder());
        System.out.println("DESCENDING ORDER: "+ Arrays.toString(mian));
    }
    
}
