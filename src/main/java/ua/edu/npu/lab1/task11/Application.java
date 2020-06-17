package ua.edu.npu.lab1.task11;

public class Application {
    public static void main(String[] args) {
        PointArr Array = new PointArr(3);
        LengthSumLess LessSum = new LengthSumLess();
        for (int p = 0; p < Array.pArr.length; p++) {
            System.out.println("Point " + p + "  X:" + Array.pArr[p].getX() + "   Y:" + Array.pArr[p].getY());
        }
        System.out.println("Less sum of lengths: " + LessSum.lengthSumLess(Array));
    }
}
