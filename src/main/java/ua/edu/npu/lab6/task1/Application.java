package ua.edu.npu.lab6.task1;

import java.time.LocalDate;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Interface inter;
        inter = () -> "Vlad";
        System.out.println(inter.method());
        inter = () -> String.valueOf(LocalDate.now().getDayOfWeek());
        System.out.println(inter.method());
        inter = () -> randomWord();
        System.out.println(inter.method());
    }

    public static String randomWord () {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        String word = new String();
        double a = Math.random()*10;
        for (int i = 0; i < a ;i++) {
            char tmp = (char) ('a' + r.nextInt('z' - 'a'));
            sb.append(tmp);
        }
        word = sb.toString();
        return word;
    }
}
