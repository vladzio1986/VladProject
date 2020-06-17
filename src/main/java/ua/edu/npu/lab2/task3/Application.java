package ua.edu.npu.lab2.task3;

public class Application {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Jack", 4);
        Dog dog2 = new Dog();
        printDogData(dog1);
        dog1.voice();
        printDogData(dog2);
        dog2.voice();
    }
    
    private static void printDogData(Dog dog) {
        System.out.println("Name: " + dog.name + "   Age: " + dog.age);
    }
}
