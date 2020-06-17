package ua.edu.npu.lab1.task10;

import java.util.Scanner;

public class Input {
    Scanner input = new Scanner(System.in);
    int dots = 0;
    public int getDotNumber() {
        System.out.println("Enter number of dots: ");
        dots = input.nextInt();
        return dots;
    }

    public void getCoordinates(PointArr arr) {
        for(int i=0; i<arr.pArr.length; i++) {
            System.out.println("Enter x of " + i + " dot: ");
            arr.pArr[i].setX(input.nextInt());
            System.out.println("Enter y of " + i + " dot: ");
            arr.pArr[i].setY(input.nextInt());
        }
    }
}
