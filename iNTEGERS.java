import java.util.Scanner;
public class iNTEGERS{
  public static void main(String[] args){
    Scanner ger = new Scanner(System.in);

  System.out.println("ENTER INTEGER:");
    int nmb = ger.nextInt();

  if(nmb > 0){
        System.out.println("NUMBER :" +nmb);
        System.out.println("STATUS : POSTIVE");
  } else if (nmb < 0){
         System.out.println("NUMBER :" +nmb);
        System.out.println("STATUS : NEGATIVE");
  }
    ger.close();
  }
}
