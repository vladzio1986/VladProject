package ua.edu.npu.lab2.task3;

public class Dog {
    int age;
    String name = "";

    public Dog(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Dog(){
        name = "Undefined";
        age = 0;
    }

    public void voice () {
        System.out.print(name + ": ");
        for(int i=0; i<age; i++){
            System.out.print("Bark ");
        }
        System.out.println("");
    }

    public void showDogData () {
        System.out.println("Name: " + name + "   Age: " + age);
    }
}
