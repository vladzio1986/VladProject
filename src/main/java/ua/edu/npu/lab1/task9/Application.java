package ua.edu.npu.lab1.task9;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        Counting Text = new Counting();
        System.out.println("Enter your String");
        str = input.nextLine();
        Text.Count(str);
        Text.PrintInfo();
    }
}
