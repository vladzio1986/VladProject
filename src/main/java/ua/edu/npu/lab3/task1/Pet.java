package ua.edu.npu.lab3.task1;

public abstract class Pet {
    String petName = new String();
    String petOwner = new String();
    int age;

    abstract public String getType();

    public Pet(String owner, String name, int age) {
        this.petName = name;
        this.petOwner = owner;
        this.age = age;
    }

    public Pet() {
        petName = "No name";
        petOwner = "No owner";
        age = 0;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return petName;
    }

    public String getPetOwner() {
        return petOwner;
    }
}
