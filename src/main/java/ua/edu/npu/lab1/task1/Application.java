package ua.edu.npu.lab1.task1;

public class Application {
    public static void main(String[] args) {
        String[] Strr;
        int n;
        StringArr Arr = new StringArr();
        FindShort Find = new FindShort();
        n = Arr.ArrQuantity();
        Strr = Arr.StrInput(n);
        Arr.StrOutput(Strr, n);
        Find.FindShortString(Strr, n);
    }
}
