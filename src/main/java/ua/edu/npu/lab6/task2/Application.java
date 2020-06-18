package ua.edu.npu.lab6.task2;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Interface inter;
        inter = (int x) -> {
            String number;
            switch (x) {
                case 0:
                    number = "zero";
                case 1:
                    number = "one";
                case 2:
                    number = "two";
                case 3:
                    number = "three";
                case 4:
                    number = "four";
                case 5:
                    number = "five";
                case 6:
                    number = "six";
                case 7:
                    number = "seven";
                case 8:
                    number = "eight";
                case 9:
                    number = "nine";
                default:
                    number = "undefined";
            }
            return number;
        };
        System.out.println(inter.method(5));
        inter = (int x) -> {
            Random r = new Random();
            StringBuilder sb = new StringBuilder();
            String word;
            for (int i = 0; i < x ;i++) {
                char tmp = (char) ('a' + r.nextInt('z' - 'a'));
                sb.append(tmp);
            }
            word = sb.toString();
            return word;
        };
        System.out.println(inter.method(7));
        inter = (int x) -> {
            String sqr = "";
            if ((Math.sqrt(x) * Math.sqrt(x)) == x){
                sqr = "Square";
            }
            return sqr;
        };
        System.out.println(inter.method(16));
    }
}
