package ua.edu.npu.lab1.task7;

public class StringSplit {
    String[] StringArr;
    public void Split (String s) {
        StringArr = s.split(" ");
    }

    public String[] getStringArr() {
        return StringArr;
    }

    public void out (String[] arr) {
        for (String a : arr)
            System.out.print(a + " ");
    }
}
