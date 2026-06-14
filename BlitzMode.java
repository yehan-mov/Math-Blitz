import java.util.Random;
import java.util.Scanner;

public class BlitzMode {
    public static void runBlitz(char operator, Scanner scanner, Random random) {

        System.out.println("This is a beta feature, meaning it's still in progress.");
        System.out.println("You may experience bugs. Do you wish to proceed?");

        System.out.println("\n[1] Sure, what's wrong in exploring a beta feature");
        System.out.println("[2] Nah Man, I like to stay away from these things");

        System.out.println(" ");
        
        System.out.print("> ");
        Utils.checkInt(scanner);
        int choice = scanner.nextInt();

        if (choice == 2) {
            return;
        }

        else {
            int correct = 0;
            int totalQuestion = 0;

            final int[] timeLeft = {60};
            final boolean[] timeUp = {false};

            Thread timer = new Thread(() -> {
                while (timeLeft[0] >0) {
                    try {
                        Thread.sleep(1000);
                    }
                    catch (InterruptedException e) {
                        return;
                    }
                    timeLeft[0]--;
                }
                timeUp[0] = true;
            });

            timer.start();

            while (!timeUp[0]) {

                Utils.clearTerminal();

                System.out.println("Time Left: " + timeLeft[0] + "s");
                System.out.println("Score: " + correct);

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

                System.out.println(" ");

                System.out.print("> ");
                Utils.checkInt(scanner);
                int user_input = scanner.nextInt();

                if (user_input == answer) {
                    System.out.println("Correct! Moving onto the next question");
                    correct ++;
                }
                
                else {
                    System.out.println("Wrong! The correct answer was " + answer);
                }

                totalQuestion ++;
            }

            double accuracy = (double) correct / totalQuestion * 100;

            System.out.println("\nTIME'S UP");
            System.out.println("Correct " + correct);
            System.out.println("Total Question: " + totalQuestion);
            System.out.printf("Accuracy: %.1f%%\n", accuracy);
        }
    }   
}