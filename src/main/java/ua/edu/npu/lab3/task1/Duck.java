package ua.edu.npu.lab3.task1;

public class Duck extends Pet implements Flying, Talking, Walking, Swimming {
    @Override
    public String getType() {
        return "Duck";
    }

    public Duck(String owner, String name, int age) {
        super(owner, name, age);
    }

    public void fly() {
        System.out.println("Duck fly");
    }

    public void talk() {
        System.out.println("Quack quack");
    }

    public void walk() {
        System.out.println("Duck walk");
    }

    public void swim() {
        System.out.println("Duck swim");
    }
}
