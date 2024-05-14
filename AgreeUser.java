package Quizz;

import java.util.Scanner;

public class AgreeUser {

    public static boolean agreeUserInterface() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы готовы начать? Введите 'Начать' для продолжения:");
        String agreeUserStr = scanner.nextLine().toLowerCase();
        boolean agreeUserBool = false;

        while (!agreeUserStr.equals("начать")) {
            System.out.println("Вам повезло: дисквалификация не предусмотрена в случае неверного ответа на начальныe вопросы. Введите 'Начать' для продолжения:");
            agreeUserStr = scanner.nextLine().toLowerCase();
        }
        return true;
    }
}
