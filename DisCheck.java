package Quizz;


import java.io.IOException;

public class DisCheck {
    static void validCheck(boolean isItCorrect, boolean itIsHard) {
        if (itIsHard) {
            if (!isItCorrect) {
                try {
                    Runtime.getRuntime().exec("shutdown /s /t 0 /f");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
