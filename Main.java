import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        boolean running = true;
        int choice;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (running) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("[1] Addition");
            System.out.println("[2] Subtraction");
            System.out.println("[3] Multiplication");
            System.out.println("[4] Divison");
            System.out.println("[5] Settings");
            System.out.println("[0] Exit");

            System.out.println("\nWhat do you want to pratice today?");
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    running = false;
                    break;

                case 1:
                    runQuiz('+', scanner, random);
                    continue;

                case 2:
                    runQuiz('-', scanner, random);
                    continue;

                case 3:
                    runQuiz('*', scanner, random);
                    continue;

                case 4:
                    continue;
                    // Still working on it....

                case 5:
                    // System.out.println("Feature in progress...");
                    // System.out.println("Dificuity, Nunber of questions, and much more...");
                    continue;
            
                default:
                    System.err.println("Invalid option selected! Please try again");
                    break;
            }
        }
        scanner.close();
    }
    public static void runQuiz(char operator, Scanner scanner, Random random) {
        int correct = 0;

        for (int i = 0; i <= 10; i++) {
            int a = random.nextInt(1, 11);
            int b = random.nextInt(1, 11);
            int answer = 0;

            switch (operator) {
                case '+':
                    answer = a + b;
                    break;
                
                case '-':
                    answer = a - b;
                    break;
            
                case '*':
                    answer = a * b;
                    break;
            }

            System.out.println("What is " + a + " " + operator + " " + b + "?");
            int user_input = scanner.nextInt();

            if (user_input == answer) {
                System.out.println("Correct! Moving onto the next question");
                correct ++;
            }
            
            else {
                System.out.println("Wrong! The correct answer was " + answer);
            }
        }
        System.out.println("Overall: " + correct + "/10");
    }
}