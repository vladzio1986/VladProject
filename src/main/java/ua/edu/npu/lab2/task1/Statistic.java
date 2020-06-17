package ua.edu.npu.lab2.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Statistic {
    private ArrayList<Integer> experimentResults = new ArrayList<>();

    public void addResult(int res) {
        experimentResults.add(res);
    }

    public int getMin() {
        int min = 0;
        int max = 0;
        if (experimentResults.isEmpty()) {
            System.out.println("Empty array");
        } else {
            min = experimentResults.get(0);
            for (int i = 1; i < experimentResults.size(); i++) {
                if (min > experimentResults.get(i)) {
                    min = experimentResults.get(i);
                }
            }
        }
        return min;
    }

    public int getMax() {
        int max = 0;
        if (experimentResults.isEmpty()) {
            System.out.println("Empty array");
        } else {
            max = experimentResults.get(0);
            for (int i = 1; i < experimentResults.size(); i++) {
                if (max < experimentResults.get(i)) {
                    max = experimentResults.get(i);
                }
            }
        }
        return max;
    }

    public double getAvg() {
        double avg = 0;
        if (experimentResults.isEmpty()) {
            System.out.println("Empty array");
        } else {
            for (int i = 0; i < experimentResults.size(); i++) {
                avg += experimentResults.get(i);
            }
            avg /= experimentResults.size();
        }
        return avg;
    }

    public void getMode() {
        if (experimentResults.isEmpty()) {
            System.out.println("Empty array");
        } else {
            HashMap<Integer, Integer> numbersAmmount = new HashMap<>();
            for (int i = 0; i < experimentResults.size(); i++) {
                if (numbersAmmount.containsKey(experimentResults.get(i))) {
                    numbersAmmount.replace(i, numbersAmmount.get(experimentResults.get(i)) + 1);
                } else numbersAmmount.put(experimentResults.get(i), 1);
            }
            int maxAmmount = 0;
            int resultElement = 0;
            for (Map.Entry<Integer, Integer> currentEntry : numbersAmmount.entrySet()) {
                if (currentEntry.getValue() > maxAmmount) {
                    maxAmmount = currentEntry.getValue();
                    resultElement = currentEntry.getKey();
                }
            }
            System.out.println("Element: " + resultElement + " repeated " + maxAmmount + " times");
        }
    }

    public void biggerThanAvg() {
        if (experimentResults.isEmpty()) {
            System.out.println("Empty array");
        } else {
            double avg = getAvg();
            System.out.print("Numbers bigger than average: ");
            for (int i = 0; i < experimentResults.size(); i++) {
                if (experimentResults.get(i) > avg) {
                    System.out.print(experimentResults.get(i) + "  ");
                }
            }
            System.out.println("");
        }
    }

    public void lesserThanAvg() {
        if (experimentResults.isEmpty()) {
            System.out.println("Empty array");
        } else {
            double avg = getAvg();
            System.out.print("Numbers lesser than average: ");
            for (int i = 0; i < experimentResults.size(); i++) {
                if (experimentResults.get(i) < avg) {
                    System.out.print(experimentResults.get(i) + "  ");
                }
            }
            System.out.println("");
        }
    }
}