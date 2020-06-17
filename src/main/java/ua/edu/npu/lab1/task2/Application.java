package ua.edu.npu.lab1.task2;

public class Application {
    public static void main(String[] args) {
        int n;
        String[] Str;
        String[] Strr;
        StringArr StrArr = new StringArr();
        Sorting Sorts = new Sorting();
        n = StrArr.ArrQuantity();
        Str = StrArr.StrInput(n);
        Strr = Sorts.Sort(Str, n);
        StrArr.StrOutput(Strr, n);
    }
}
