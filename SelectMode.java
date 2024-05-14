package Quizz;

import java.util.Scanner;

public class SelectMode {
    public static void selectMode() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВыберите сложность режима:\n\n1) Easy\n2) Hard\n\nРежим Easy предполагает ознакомительный этап: в нем игрок не может быть дисквалифицирован, а тест состоит из 3-х предельно легких вопросов.\nРежим Hard предполагает основной этап: он состоит из 15 вопросов, а в случае неверного ответа хотя-бы на 1 вопрос игрок признается дисквалифицированным.");
        System.out.println("Выберите сложность (1/2):");
        String mode = scanner.nextLine();
        while (!mode.equals("1") && !mode.equals("2")) {
            System.out.println("Вам повезло: дисквалификация не предусмотрена в случае неверного ответа на начальные вопросы. Введите 1 или 2:");
            mode = scanner.nextLine();
        }
        if (mode.equals("1")) {
            EasyMode.easyMode();
            HardMode.hardMode();
        } else if (mode.equals("2")) {
            HardMode.hardMode();
        }
    }
}
