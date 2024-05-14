package Quizz;

import java.util.Scanner;

public class QuizLogic {
    public static boolean quizzLogic(String question, String answer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        System.out.println("\nВведите ответ:");
        String userAnswer = scanner.nextLine();
        while (!userAnswer.equals("1") && !userAnswer.equals("2") && !userAnswer.equals("3") && !userAnswer.equals("4")) {
            System.out.println("Введите один вариант ответа из предложенных выше:");
            userAnswer = scanner.nextLine();
        }
        if (!userAnswer.equals(answer)) {
            return false;
        }

        return true;
    }
}
