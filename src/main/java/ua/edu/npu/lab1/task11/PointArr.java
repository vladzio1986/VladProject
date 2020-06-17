package ua.edu.npu.lab1.task11;

public class PointArr {

    protected Point[] pArr;

    public PointArr(int n) {
        pArr = new Point[n];
        for (int i = 0; i < n; ++i) {
            pArr[i] = new Point((int)(Math.random() * 9), (int)(Math.random() * 9));
        }
    }
}
