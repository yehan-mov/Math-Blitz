import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Quiz {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public static void runQuiz(char operator, Scanner scanner, Random random, int max, int num) {
        int correct = 0;

        List<QuizHistory> historyList = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            int a = random.nextInt(1, max + 1);
            int b = random.nextInt(1, max + 1);
            int answer = 0;

            switch (operator) {
                case '+': answer = a + b; break;
                case '-': answer = a - b; break;
                case '*': answer = a * b; break;
            }

            System.out.println("What is " + a + " " + operator + " " + b + "?");

            System.out.println(" ");

            System.out.print("> ");
            Utils.checkInt(scanner);
            int user_input = scanner.nextInt();

            boolean correctCheck = (user_input == answer);

            historyList.add(new QuizHistory(a, b, operator, user_input, correctCheck));

            if (correctCheck) {
                System.out.println("Correct! Moving onto the next question");
                correct ++;
            }
            else {
                System.out.println("Wrong! The correct answer was " + answer);
            }
        }
        Utils.clearTerminal();
        System.out.println("Overall " + correct + "/10");

        System.out.println("\n--- Summary ---");
        
        for (int i = 0; i < historyList.size(); i++) {
            QuizHistory q = historyList.get(i);
            String status = q.isCorrect ? "[CORRECT]" : "[WRONG]";

            System.out.println("Q" + (i + 1) + ": " + q.num1 + " " + q.op + " " + q.num2 + " | Your Answer: " + q.userAnswer + " " + status);
        }
    }
}