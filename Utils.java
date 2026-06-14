import java.io.IOException;
import java.util.Scanner;

public class Utils {

    Scanner scanner = new Scanner(System.in);

    public static void checkInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("ERRL This is not a valid number. Please try again!");
            scanner.next();
        }
    }

    public static void clearTerminal() {
        try {
            String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (IOException | InterruptedException e) {
            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
        }
    }
}