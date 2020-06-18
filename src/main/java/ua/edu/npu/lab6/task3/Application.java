package ua.edu.npu.lab6.task3;

public class Application {
    public static void main(String[] args) {
        Interface inter;
        inter = (String str) -> {
            String reverse;
            StringBuilder sb = new StringBuilder();
            for (int i=(str.length()-1); i>=0; i--) {
                sb.append(str.charAt(i));
            }
            reverse = sb.toString();
            return reverse;
        };
        System.out.println(inter.method("My name is Vlad"));
        inter = (String str) -> {
            for (int i = 0; i < str.length(); i++) {
                if(!Character.isDigit(str.charAt(i))){
                    str = str.substring(0, i) + ' ' + str.substring(i+1);
                }
            }
            return str;
        };
        System.out.println(inter.method("25as3s231back2 s2j5"));
        inter = (String str) -> {
            str = str.toLowerCase();
            String reverse;
            StringBuilder sb = new StringBuilder();
            for (int i=(str.length()-1); i>=0; i--) {
                sb.append(str.charAt(i));
            }
            reverse = sb.toString();
            if (str.equals(reverse)){
                return "Palindrome";
            }
            else {
                return "";
            }
        };
        System.out.println(inter.method("Rotator"));
    }
}
