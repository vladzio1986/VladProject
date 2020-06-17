package ua.edu.npu.lab1.task8;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        Count Text = new Count();
        StringSplit Split = new StringSplit();
        System.out.println("Enter your String");
        str = input.nextLine();
        Split.Split(str);
        String[] StringArr = Split.getStringArr();
        Text.Count(StringArr);
        Text.Out();
    }
}
