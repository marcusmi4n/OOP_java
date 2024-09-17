import java.util.Scanner;
public class PaSSWOrD{
  public static void main(String[] args){
    Scanner pwd = new Scanner(System.in);
  System.out.println("ENTER PASSWORD:");
    String paswd = pwd.nextLine();
    if(paswd == "Marcus"){
      System.out.println("Welcome");
    }else{
      int m = 0;
      while(m < 3){
        System.out.println("ENTER PASSWORD:");
    String paswd = pwd.nextLine();
      m++;
      }
    }
      pwd.close();
    }
}
    
      
    
