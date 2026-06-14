import java.util.Scanner;

public class Settings {

    Scanner scanner = new Scanner(System.in);

    public static void settingsMenu(Scanner scanner) {
        Utils.clearTerminal();
        
        while (true) {
            System.out.println("\n--- Settings Menu ---");
            System.out.println("--".repeat(30));

            System.out.println("[1] Show Hints");
        }
    }
}