package ua.edu.npu.lab1.task5;

public class Output {
    public void DoubleSpace (String s) {
        for(int i=0; i<s.length(); i++) {
            System.out.print(s.charAt(i) + "  ");
        }
        System.out.println();
    }

    public void NumberStyle (String s) {
        for (int i = 0; i < s.length(); i++ ) {
            if (Character.isUpperCase(s.charAt(i)) == true) {
                System.out.print((s.charAt(i) - 64) + " ");
            }
            else if(s.charAt(i) == ' ') {
                System.out.print("  ");
            }
            else if(Character.isLowerCase(s.charAt(i)) == true) {
                System.out.print((s.charAt(i) - 96) + " ");
            }
            else {
                System.out.print(" _ ");
            }
        }
    }
}
