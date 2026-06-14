import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        boolean running = true;
        int choice, max, num;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Utils.clearTerminal();

        while (running) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("--" .repeat(30));
            System.out.println("[1] Addition");
            System.out.println("[2] Subtraction");
            System.out.println("[3] Multiplication");
            System.out.println("[4] Divison");
            System.out.println("[5] Timed Blitz (60 seconds) (Beta)");
            System.out.println("[6] More...");
            System.out.println("[0] Exit");

            System.out.println("\nWhat do you want to pratice today?");
            
            System.out.print("> ");
            Utils.checkInt(scanner);
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    running = false;
                    break;

                case 1:
                    max = Menu.getDifficulty(scanner);

                    if (max == -1) {
                        continue;
                    }

                    num = Menu.getNum(scanner);

                    if (num == -1) {
                        continue;
                    }

                    Quiz.runQuiz('+', scanner, random, max, num);
                    continue;

                case 2:
                    max = Menu.getDifficulty(scanner);

                    if (max == -1) {
                        continue;
                    }

                    num = Menu.getNum(scanner);

                    if (num == -1) {
                        continue;
                    }

                    Quiz.runQuiz('-', scanner, random, max, num);
                    continue;

                case 3:
                    max = Menu.getDifficulty(scanner);

                    if (max == -1) {
                        continue;
                    }

                    num = Menu.getNum(scanner);

                    if (num == -1) {
                        continue;
                    }

                    Quiz.runQuiz('*', scanner, random, max, num);
                    continue;

                case 4:
                    int correct = 0;

                    List<QuizHistory> historyList = new ArrayList<>();

                    for (int i = 0; i <= 10; i++) {
                        int answer = random.nextInt(1, 11);
                        int b = random.nextInt(1, 11);
                        int a = b * answer;

                        System.out.println("What is " + a + " / " + b + "?");

                        System.out.println(" ");

                        System.out.print("> ");
                        Utils.checkInt(scanner);
                        int user_input = scanner.nextInt();

                        boolean correctCheck = (user_input == answer);

                        historyList.add(new QuizHistory(a, b, '/', user_input, correctCheck));

                        if (correctCheck) {
                            System.out.println("Correct! Moving onto the next question");
                            correct ++;
                        }
                        else {
                            System.out.println("Wrong! the correct answer was: " + answer);
                        }
                    }

                    Utils.clearTerminal();
                    System.out.println("Overall: " + correct + "/10");

                    System.out.println("\n--- Summary ---");
                    for (int i = 0; i < historyList.size(); i++) {
                        QuizHistory q = historyList.get(i);
                        String status = q.isCorrect ? "[Correct]": "[WRONG]";

                        System.out.println("Q" + (i + 1) + ": " + q.num1 + " " + q.op + " " + q.num2 + " | Your Answer: " + q.userAnswer + " " + status);
                    }
                    continue;

                case 5:
                    Menu.blitz(scanner, random);
                    continue;

                case 6:
                    Menu.moreMenu(scanner, random);
                    continue;
            
                default:
                    System.err.println("Invalid option selected! Please try again");
                    continue;
            }
        }
        scanner.close();
    }
}