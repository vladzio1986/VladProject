package ua.edu.npu.lab1.task8;

import java.util.ArrayList;

public class Count {
    ArrayList<String> CountingWords = new ArrayList<>();
    ArrayList<Integer> Counting = new ArrayList<>();
    public void Count (String[] arr) {
        int tempInd;
        int temp;
        int j = 0;
        while(j < arr.length) {
            if(CountingWords.contains(arr[j])){
                tempInd = CountingWords.indexOf(arr[j]);
                temp = Counting.get(tempInd);
                Counting.set(tempInd, temp+1);
            }
            else {
                CountingWords.add(arr[j]);
                Counting.add(1);
            }
            j++;
        }
    }

    public void Out () {
        for(int i=0; i<CountingWords.size(); i++) {
            System.out.println(CountingWords.get(i) + " = " + Counting.get(i));
        }
    }
}
