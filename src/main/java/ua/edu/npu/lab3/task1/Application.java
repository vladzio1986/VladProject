package ua.edu.npu.lab3.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<PetOwner> OwnersArr = new ArrayList<>();
        String ownersSwitch = "";
        String petSwich = "";
        String petType = "";
        String petName = "";
        int petAge = 0;
        boolean petLeave;
        while (true) {
            System.out.println("Enter name of pet owner, Add to add new pet owner, Info to see the list of owners or Stop to stop the program");
            ownersSwitch = input.next();
            switch (ownersSwitch){
                case "Add":
                    System.out.println("Enter name of pet owner: ");
                    OwnersArr.add(new PetOwner(input.next()));
                    break;
                case "Stop":
                    System.exit(0);
                case "Info":
                    for (PetOwner p: OwnersArr){
                        System.out.println("    " + p.ownerName);
                    }
                default:
                    for (int i=0; i<OwnersArr.size(); i++) {
                        if (OwnersArr.get(i).getOwnerName().equals(ownersSwitch)) {
                            petLeave = false;
                            while (petLeave == false) {
                                System.out.println("Enter Add to add pet to this owner, Remove to remove pet from this owner, Info to see the list of owned pets and Back to go to the owner menu");
                                petSwich = input.next();
                                switch (petSwich) {
                                    case "Add":
                                        System.out.println("Enter type of pet(Dog, Fish, Cat, Duck, Turtle, Eagle)");
                                        petType = input.next();
                                        if(petType.equals("Dog") || petType.equals("Fish") || petType.equals("Cat") || petType.equals("Duck") || petType.equals("Turtle") || petType.equals("Eagle")) {
                                            System.out.println("Enter name of the pet: ");
                                            petName = input.next();
                                            System.out.println("Enter age of the pet: ");
                                            petAge = input.nextInt();
                                            OwnersArr.get(i).addPet(petType, petName, petAge);
                                        }
                                        break;
                                    case "Remove":
                                        System.out.println("Enter name of the pet: ");
                                        petName = input.next();
                                        System.out.println("Enter age of the pet: ");
                                        petAge = input.nextInt();
                                        OwnersArr.get(i).removePet(petName, petAge);
                                        break;
                                    case "Info":
                                        OwnersArr.get(i).showOwnedPets();
                                    case "Back":
                                        petLeave = true;
                                        break;
                                    default:
                                }
                            }
                        }
                    }
                    break;
            }
        }

    }
}
