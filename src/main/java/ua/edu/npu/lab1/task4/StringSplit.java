package ua.edu.npu.lab1.task4;

public class StringSplit {
    String[] StringArr;
    public void  Split (String s) {
        StringArr = s.split(" ");
    }

    public String[] getStringArr() {
        return StringArr;
    }
}
