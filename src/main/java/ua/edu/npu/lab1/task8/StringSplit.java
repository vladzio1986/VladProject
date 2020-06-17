package ua.edu.npu.lab1.task8;

public class StringSplit {
    String[] StringArr;
    public void Split (String s) {
        StringArr = s.split(" ");
    }

    public String[] getStringArr() {
        return StringArr;
    }
}
