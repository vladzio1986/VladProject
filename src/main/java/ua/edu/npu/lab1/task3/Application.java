package ua.edu.npu.lab1.task3;

public class Application {
    public static void main(String[] args) {
        StringArr StrArr = new StringArr();
        Scissors StrLimit = new Scissors();
        String[] Str;
        int n;
        float avg;
        n = StrArr.ArrQuantity();
        Str = StrArr.StrInput(n);
        avg = StrLimit.AvgLength(Str, n);
        StrLimit.StrOutput(Str, n, avg);
    }
}
