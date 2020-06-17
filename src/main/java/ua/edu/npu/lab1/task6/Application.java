package ua.edu.npu.lab1.task6;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        StringRed Redact = new StringRed();
        System.out.println("Enter String");
        str = input.nextLine();
        Redact.Redact(str);
    }
}
