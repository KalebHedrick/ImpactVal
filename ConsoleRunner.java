import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String args[]) {
        System.out.print("Enter username: ");
        Scanner scan = new Scanner(System.in);
        String Username = scan.nextLine();
        System.out.print("Enter tag: ");
        String tag = scan.nextLine();
        CollectData k = new CollectData(Username, tag);
        k.printUserData();
    }
}