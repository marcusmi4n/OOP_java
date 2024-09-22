
import java.util.Scanner;

public class PaSSWOrD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "Marcus";
        int attempts = 3;

        while (attempts > 0) {
            System.out.println("ENTER PASSWORD: ");
            String input = sc.nextLine();

            if (input.equals(correctPassword)) {
                System.out.println("SUCCESS!");
            } else {
                attempts--;
                System.out.println("Incorrect Password. Attempts remaining: " + attempts);

            }
            if (attempts == 0) {
                System.out.println("Account  blocked.");
            }
        }
        sc.close();
    }
}
