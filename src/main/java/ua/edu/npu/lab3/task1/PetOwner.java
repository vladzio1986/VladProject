package ua.edu.npu.lab3.task1;


import java.util.ArrayList;

public class PetOwner {
    String ownerName = new String();

    public PetOwner(String name) {
        this.ownerName = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    private ArrayList<Pet> OwnedPets = new ArrayList<>();

    public void addPet(String petType, String name, int age) {
        for(int i=0; i<1; i++) {
            switch (petType) {
                case "Dog":
                    OwnedPets.add(new Dog(ownerName, name, age));
                    i++;
                    break;
                case "Fish":
                    OwnedPets.add(new Fish(ownerName, name, age));
                    i++;
                    break;
                case "Cat":
                    OwnedPets.add(new Cat(ownerName, name, age));
                    i++;
                    break;
                case "Duck":
                    OwnedPets.add(new Duck(ownerName, name, age));
                    i++;
                    break;
                case "Turtle":
                    OwnedPets.add(new Turtle(ownerName, name, age));
                    i++;
                    break;
                case "Eagle":
                    OwnedPets.add(new Eagle(ownerName, name, age));
                    i++;
                    break;
                default:
                    System.out.println("Incorrect type of pet");
                    break;
            }
        }
    }

    public void removePet(String name, int age) {
        OwnedPets.removeIf(pet -> pet.petName.equals(name) && pet.age == age);
    }

    public void showOwnedPets() {
        for (int i=0; i<OwnedPets.size(); i++) {
            System.out.println("Type: " + OwnedPets.get(i).getType() + "    Name: " + OwnedPets.get(i).getName() + "    Age: " + OwnedPets.get(i).getAge());
        }
    }
}
