import java.util.Scanner;
import java.util.Random;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public static int getDifficulty(Scanner scanner) {
        Utils.clearTerminal();

        while (true) {
            Utils.clearTerminal();
            System.out.println("\nPlease select the perfered difficulty level");
            System.out.println("--".repeat(30));

            System.out.println("[0] Return");
            System.out.println("[1] Easy");
            System.out.println("[2] Medium");
            System.out.println("[3] Hard");
            System.out.println("[4] Exterme");

            System.out.println();

            System.out.print("> ");
            Utils.checkInt(scanner);
            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    Utils.clearTerminal();
                    return -1;

                case 1:
                    return 10;

                case 2:
                    return 25;

                case 3:
                    return 100;

                case 4:
                    return 1000;
            
                default:
                    System.out.println("ERR: Invalid option selected. Please try again.");
                    continue;
            }
        }
    }

    public static int getNum(Scanner scanner) {
        Utils.clearTerminal();

        while (true) {
            System.out.println("\nSelect the perfered number of questions");
            System.out.println("--".repeat(30));

            System.out.println("[0] Return");
            System.out.println("[1] 10 questions");
            System.out.println("[2] 25 questions");
            System.out.println("[3] 50 questions");
            System.out.println("[4] 100 questions");
            System.out.println("[5] Custom");

            System.out.println();

            System.out.print("> ");
            Utils.checkInt(scanner);
            int user_input = scanner.nextInt();

            switch (user_input) {
                case 0:
                    Utils.clearTerminal();
                    return -1;
 
                case 1:
                    return 10;

                case 2:
                    return 25;

                case 3:
                    return 50;

                case 4:
                    return 100;

                case 5:
                    System.out.println("Enter the amount of questions");

                    System.out.println();

                    System.out.print("> ");
                    Utils.checkInt(scanner);
                    int num = scanner.nextInt();

                    if (num > 0) {
                        return num;
                    }
                    else {
                        System.out.println("ERR: The number of can't be less than 0 or 0");
                        continue;
                    }

                default:
                    System.out.println("ERR: Invalid option selected. Please try again.");
                    continue;
            }
        }
    }

    public static int opSelector(Scanner scanner, Random random) {
        Utils.clearTerminal();

        while (true) {
            System.out.println("Please select an operator");
            System.out.println("--".repeat(30));

            System.out.println("[0] Return");
            System.out.println("[1] Addition");
            System.out.println("[2] Subtraction");
            System.out.println("[3] Multiplication");
            System.out.println("[4] Divsion");

            System.out.println(" ");

            System.out.print("> ");
            Utils.checkInt(scanner);
            int user_input = scanner.nextInt();

            switch (user_input) {
                case 0:
                    Utils.clearTerminal();
                    return -1;

                case 1:
                    return 1;

                case 2:
                    return 2;

                case 3:
                    return 3;

                case 4:
                    return 4;

                default:
                    System.out.println("ERR: Invalid option selected! Please try again.");
                    continue;
            }
        }
    }

    public static void moreMenu(Scanner scanner, Random random) {
        Utils.clearTerminal();
        int num, max;

        while (true) {
            System.out.println("[0]...");
            System.out.println("[1] Mixed Operation");
            System.out.println("[2] Negative Numbers");
            System.out.println("[3] Settings");

            System.out.println("\nSelect an option:");

            System.out.println(" ");

            System.out.print("> ");
            Utils.checkInt(scanner);
            int user_input = scanner.nextInt();

            switch (user_input) {
                case 0:
                    Utils.clearTerminal();
                    return;
                
                case 1:
                    max = Menu.getDifficulty(scanner);

                    if (max == -1) {
                        continue;
                    }

                    num = Menu.getNum(scanner);

                    if (num == -1) {
                        continue;
                    }

                    uniqueMode.mixedOperation(scanner, random, max, num);
                    continue;

                case 2:
                    int op = opSelector(scanner, random);
                    char operator = ' ';

                    switch (op) {
                        case 0: return;
                        case 1: op = '+'; break;
                        case 2: op = '-'; break;
                        case 3: op = '*'; break;
                        case 4: op = '/'; break;
                        default: System.out.println("ERR: Invalid operator selected! Please try again."); continue;
                    }

                    num = getNum(scanner);

                    if (num == - 1) {
                        continue;
                    }

                    uniqueMode.negativeNum(operator, scanner, random, num);
                    continue;

                case 3:
                    Settings.settingsMenu(scanner);
                    continue;

                default:
                    System.out.println("ERR: Invalid option selected. Please try again.");
                    continue;
            }
        }
    }

        public static void blitz(Scanner scanner, Random random) {
        Utils.clearTerminal();

        boolean sub_running = true;

        while (sub_running) {
            System.out.println("[0]...");
            System.out.println("[1] Addition");
            System.out.println("[2] Subtraction");
            System.out.println("[3] Multiplication");
            System.out.println("[4] Divison");

            System.out.println("\nPlease select an operator");

            System.out.println(" ");
            
            System.out.print("> ");
            Utils.checkInt(scanner);
            int user_choice = scanner.nextInt();

            switch (user_choice) {
                case 0:
                    Utils.clearTerminal();
                    return;

                case 1:
                    Utils.clearTerminal();
                    BlitzMode.runBlitz('+', scanner, random);
                    continue;

                case 2:
                    Utils.clearTerminal();
                    BlitzMode.runBlitz('-', scanner, random);
                    continue;

                case 3:
                    Utils.clearTerminal();
                    BlitzMode.runBlitz('*', scanner, random);
                    continue;
                        
                default:
                    System.out.println("ERR: Invalid option selected! Please trt again");
                    continue;
            }
        }
    }
}