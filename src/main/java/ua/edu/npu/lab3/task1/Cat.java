package ua.edu.npu.lab3.task1;

public class Cat extends Pet implements Talking, Walking {
    @Override
    public String getType() {
        return "Cat";
    }

    public Cat(String owner, String name, int age) {
        super(owner, name, age);
    }

    public void walk() {
        System.out.println("Cat walk");
    }

    public void talk() {
        System.out.println("Meow meow");
    }
}
