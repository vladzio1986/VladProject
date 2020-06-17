package ua.edu.npu.lab1.task7;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        Redaction Red = new Redaction();
        StringSplit Split = new StringSplit();
        System.out.println("Enter String");
        str = input.nextLine();
        Split.Split(str);
        String[] StrArr = Split.getStringArr();
        Red.Redact(StrArr);
        Split.out(StrArr);
    }
}
