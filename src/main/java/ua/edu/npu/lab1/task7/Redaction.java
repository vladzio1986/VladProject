package ua.edu.npu.lab1.task7;

import java.util.Scanner;

public class Redaction {
    Scanner input = new Scanner(System.in);
    public void Redact (String[] arr) {
        int length;
        char letter;
        System.out.println("Enter length of word: ");
        length = input.nextInt();
        System.out.println("Enter first letter of word: ");
        letter = input.next().charAt(0);
        for(int i=0; i<arr.length; i++) {
            if(arr[i].charAt(0) == letter && arr[i].length() == length){
                arr[i] = "";
            }
        }
    }
}
