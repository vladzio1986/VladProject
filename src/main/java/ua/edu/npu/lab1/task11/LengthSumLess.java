package ua.edu.npu.lab1.task11;

public class LengthSumLess {
    int i = 0;
    double lSum = 0;
    double lessSum;
    double lengthSum (PointArr Arr) {
        for (int j = 0; j < Arr.pArr.length; j++) {
            lSum += Length.findLength(Arr.pArr[i], Arr.pArr[j]);
        }
        i++;
        return lSum;
    }

    public double lengthSumLess (PointArr Arr) {
        lessSum = lengthSum(Arr);
        for (int k = 1; k < Arr.pArr.length; k++) {
            if (lessSum < lengthSum(Arr)) {
                lessSum = lSum;
            }
            lSum = 0;
        }
        return lessSum;
    }
}
