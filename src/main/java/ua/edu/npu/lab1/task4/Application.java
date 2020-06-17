package ua.edu.npu.lab1.task4;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String MainString = "";
        StringSplit Split = new StringSplit();
        StringMod Mod = new StringMod();
        System.out.println("Enter your String");
        MainString = input.nextLine();
        Split.Split(MainString);
        String[] StrArr = Split.getStringArr();
        Mod.Replace(StrArr);
        Mod.out(StrArr);
    }
}
