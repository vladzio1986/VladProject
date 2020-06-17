package ua.edu.npu.lab1.task10;

import java.lang.Math;

public class ComparingPerimeter {
    double Perimeter = 0;
    double a = 0;
    double b = 0;
    double c = 0;
    public void getBiggerPerimeter(PointArr arr) {
        for(int i=0; i<arr.pArr.length; i++) {
            for(int j=i+1; j<arr.pArr.length; j++) {
                for(int k=j+1; k<arr.pArr.length; k++){
                    a = getLength(arr.pArr[i].getX(), arr.pArr[j].getX(), arr.pArr[i].getY(), arr.pArr[j].getY());
                    b = getLength(arr.pArr[i].getX(), arr.pArr[k].getX(), arr.pArr[i].getY(), arr.pArr[k].getY());
                    c = getLength(arr.pArr[j].getX(), arr.pArr[k].getX(), arr.pArr[j].getY(), arr.pArr[k].getY());
                    a *= 10;
                    a = Math.round(a);
                    a /= 10;
                    b *= 10;
                    b = Math.round(b);
                    b /= 10;
                    c *= 10;
                    c = Math.round(c);
                    c /= 10;
                    if((a+b+c) > Perimeter) {
                        Perimeter = a + b + c;
                    }
                }
            }
        }
    }

    public double getLength(int x1, int x2, int y1, int y2){
        double lengthPow = 0;
        double side;
        lengthPow = ((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2));
        side = Math.sqrt(lengthPow);
        return side;
    }

    public void Output() {
        System.out.println("The biggest perimeter is " + a + "+" + b + "+" + c + "=" + Perimeter);
    }
}