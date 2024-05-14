package Quizz;

public class EasyMode {
    public static void easyMode() {

        DisCheck.validCheck(QuizLogic.quizzLogic("\n\nКакая из перечисленных операционных систем является наиболее распространённой?:\n1) Windows\n2) MacOS\n3) Linux\n4) iOS\n", "1"), false);
        DisCheck.validCheck(QuizLogic.quizzLogic("\n\nКакой тип данных используется для хранения целых чисел в программировании?:\n1) float\n2) char\n3) int\n4) string\n", "3"), false);
        DisCheck.validCheck(QuizLogic.quizzLogic("\n\nКакая функция используется для чтения ввода пользователя в Python?:\n1) input()\n2) read()\n3) scan()\n4) get_input()\n", "1"), false);


        System.out.println("Easy мод пройден. Неверные ответы не учитывались, зато теперь вы понимаете логику игры.\nВнимание! Активирован Hard режим: при вводе как минимум одного неверного ответа игрок дисквалифицируется!");

    }
}
