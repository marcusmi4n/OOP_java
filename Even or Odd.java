import java.util.Scanner;

public class Numbers{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        //Number input line
        System.out.println("Enter a number:");
        int nmb = n.nextInt();
        
        //Number Identifier
        if(nmb%2 == 0){
            System.out.println("NUMBER: "+nmb);
            System.out.println("STATUS: EVEN");
        }else{
            System.out.println("NUMBER: "+nmb);
            System.out.println("STATUS: ODD");
        }
        
        n.close();
    }
}
