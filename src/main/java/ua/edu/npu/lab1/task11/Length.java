package ua.edu.npu.lab1.task11;

import java.lang.Math;

public class Length {
    public static double findLength (Point i, Point j) {
        return Math.sqrt(Math.pow(j.getX() - i.getX(), 2) + Math.pow(j.getY() - i.getY(), 2));
    }
}
