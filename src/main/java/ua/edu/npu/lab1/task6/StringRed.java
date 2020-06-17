package ua.edu.npu.lab1.task6;

public class StringRed {
    public void Redact(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i)) == true) {
                System.out.print(s.charAt(i));
            }
            else if (s.charAt(i) == ' ') {
                System.out.print(s.charAt(i));
            }
            else {
                System.out.print(" ");
            }
        }
    }
}
