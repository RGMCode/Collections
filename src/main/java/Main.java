import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*
        List<Pet> myPets = new ArrayList<>();
        myPets.add(wuffi);
        myPets.add(mutzi);
        */

        /*
        Set<Pet> myPets = new HashSet<>();
        myPets.add(wuffi);
        myPets.add(mutzi);
        */



        Pet wuffi = new Pet();
        wuffi.setName("Wuffi");
        wuffi.setType("Dog");

        Pet mutzi = new Pet();
        mutzi.setName("Mutzi");
        mutzi.setType("Cat");

        Map<String, Pet> myPets = new HashMap<>();
        myPets.put(wuffi.getName(), wuffi);
        myPets.put(mutzi.getName(), mutzi);


        Pet tweety = new Pet();
        tweety.setName("Tweety");
        tweety.setType("Bird");
        myPets.put(tweety.getName(), tweety);

        Pet fav = myPets.get("Mutzi");
        System.out.println("Ich mag " + fav);

        for (Pet anyPet : myPets.values()){             // myPets.values() nur bei HashMap verwendung
            System.out.println("Ich füttere " + anyPet);
        }

/*        for (Pet anyPet : myPets){                    // myPets verwendung bei Listen und HastSet
            System.out.println("Ich füttere " + anyPet);
        }*/

    }

}
