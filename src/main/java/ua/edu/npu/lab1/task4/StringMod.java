package ua.edu.npu.lab1.task4;

import java.util.Scanner;

public class StringMod {
    Scanner input = new Scanner(System.in);
    public void Replace (String[] s) {
        int letterNumber;
        char repLetter;
        System.out.println("Enter number of letter: ");
        letterNumber = input.nextInt();
        System.out.println("Enter letter to replace: ");
        repLetter = input.next().charAt(0);
        int Length = s.length;
        for (int i=0; i<Length; i++) {
            if (s[i].length() >= letterNumber) {
                s[i] = s[i].substring(0,letterNumber-1)
                        + repLetter
                        + s[i].substring(letterNumber);
            }
        }
    }

    public void out (String[] arr) {
        for (String a : arr)
            System.out.print(a + " ");
    }
}
