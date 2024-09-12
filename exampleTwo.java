import java.util.Scanner;

public class exampleTwo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //USER INPUT INFORMATION
        System.out.println("    USER INPUT INFO    ");
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        
        System.out.println("How old are you?");
        int age = sc.nextInt();
        
        System.out.println("What's your favourite Anime?");
        String anime = sc.next();
        
        System.out.println("Do you play video games, if so which game?");
        String game = sc.next();
        
        //USER OUTPUT INFORMATION
        System.out.println("     USER OUTPUT INFO     ");
        System.out.println("NAME: "+name);
        System.out.println("AGE: "+age);
        System.out.println("ANIME: "+anime);
        System.out.println("GAME: "+game);
        
        sc.close();
    }
}
