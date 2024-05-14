package Quizz;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logo.logoPrint();
        System.out.println("\n\nДобро пожаловать в Octopus Game!");
        System.out.println("Здесь вы можете побороться за звание человека с вменяемыми знаниями по углубленной информатике.");
        System.out.println("Правила игры просты: проходите тест, выбирая правильные ответы. В случае выбора неверного ответа игрок признается дисквалифицированным.\n\n");


        AgreeUser.agreeUserInterface();
        SelectMode.selectMode();
    }
}
