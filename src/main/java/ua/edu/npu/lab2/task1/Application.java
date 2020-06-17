package ua.edu.npu.lab2.task1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Statistic Stats = new Statistic();
        String choose = "";
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Add to add new result, Statistics to see statistics and Stop to exit the program");
            choose = input.next();
            switch (choose){
                case "Add":
                    System.out.println("Enter number");
                    Stats.addResult(input.nextInt());
                    break;
                case "Statistics":
                    System.out.println("Min number: " + Stats.getMin());
                    System.out.println("Max number: " + Stats.getMax());
                    System.out.println("Average number: " + Stats.getAvg());
                    Stats.getMode();
                    Stats.biggerThanAvg();
                    Stats.lesserThanAvg();
                    break;
                case "Stop":
                    System.exit(0);
                default:
                    System.out.println("Wrong");
                    break;
            }
        }
    }
}
