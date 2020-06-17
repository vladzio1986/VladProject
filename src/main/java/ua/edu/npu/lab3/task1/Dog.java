package ua.edu.npu.lab3.task1;

public class Dog extends Pet implements Talking, Walking {
    @Override
    public String getType() {
        return "Dog";
    }

    public Dog(String owner, String name, int age) {
        super(owner, name, age);
    }

    public void talk() {
        for (int i=0; i<age; i++) {
            System.out.println("Bark ");
        }
    }

    public void walk() {
        System.out.println("Dog walk");
    }
}
