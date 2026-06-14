public class QuizHistory {
    int num1;
    int num2;
    char op;
    int userAnswer;
    boolean isCorrect;

    public QuizHistory(int num1, int num2, char op, int userAnswer, Boolean isCorrect) {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
        this.userAnswer = userAnswer;
        this.isCorrect = isCorrect;
    }
}