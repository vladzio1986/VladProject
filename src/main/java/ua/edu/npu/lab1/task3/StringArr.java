package ua.edu.npu.lab1.task3;

import java.util.Scanner;

public class StringArr {
    Scanner input = new Scanner(System.in);
    public int ArrQuantity() {
        System.out.println("Enter number of strings: ");
        int N = input.nextInt();
        return N;
    }
    public String[] StrInput (int N) {
        String[] Text = new String[N];
        for (int i=0; i<N; i++) {
            System.out.println("Enter string number " + i);
            Text[i] = input.next();
        }
        return Text;
    }
}
