package ua.edu.npu.lab1.task1;

public class FindShort {
    public void FindShortString (String[] tempStr, int N) {
        int length = tempStr[0].length();
        int num = 0;
        for (int i=1; i<N; i++) {
            if (length > tempStr[i].length()) {
                length = tempStr[i].length();
                num = i;
            }
        }
        System.out.println("The shortest string is:");
        System.out.println(tempStr[num]);
        System.out.println("Length:" + length);
    }
}
