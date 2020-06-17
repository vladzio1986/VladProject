package ua.edu.npu.lab1.task10;

public class Application {
    public static void main(String[] args) {
        ComparingPerimeter Per = new ComparingPerimeter();
        Input Inp = new Input();
        PointArr PArr = new PointArr(Inp.getDotNumber());
        Inp.getCoordinates(PArr);
        Per.getBiggerPerimeter(PArr);
        Per.Output();
    }
}
