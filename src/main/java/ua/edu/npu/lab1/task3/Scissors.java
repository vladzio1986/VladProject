package ua.edu.npu.lab1.task3;

public class Scissors {
    public float AvgLength (String[] tempArr, int N) {
        float averageLength = 0;
        for (int i=0; i<N; i++) {
            averageLength += tempArr[i].length();
        }
        averageLength /= N;
        System.out.println("Average length: " + averageLength);
        return averageLength;
    }
    public void StrOutput (String[] tempStr, int N, float Average) {
        System.out.println("Strings shorter than average length:");
        for (int i=0; i<N; i++) {
            if (tempStr[i].length() < Average) {
                System.out.println(tempStr[i]);
            }
        }
    }
}
