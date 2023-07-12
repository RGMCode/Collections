import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Pet wuffi = new Pet();
        wuffi.setName("Wuffi");
        wuffi.setType("Dog");

        Pet mutzi = new Pet();
        mutzi.setName("Mutzi");
        mutzi.setType("Cat");

        Set<Pet> myPets = new HashSet<>();
        myPets.add(wuffi);
        myPets.add(mutzi);

        /*
        List<Pet> myPets = new ArrayList<>();
        myPets.add(wuffi);
        myPets.add(mutzi);
        */


        Pet tweety = new Pet();
        tweety.setName("Tweety");
        tweety.setType("Bird");
        myPets.add(tweety);

        for (Pet anyPet : myPets){
            System.out.println("Ich füttere " + anyPet);
        }

    }

}
