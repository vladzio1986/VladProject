package ua.edu.npu.lab1.task9;

public class Counting {
    int vowels = 0;
    int consonants = 0;
    Character temp;
    public void Count (String s) {
        for(int i=0; i<s.length(); i++) {
            temp = s.charAt(i);
            if (temp.isLetter(temp)) {
                if ("AEIOUaeiou".indexOf(temp) != -1) {
                    vowels++;
                }
                else {
                    consonants++;
                }
            }
        }
    }

    public void PrintInfo () {
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
