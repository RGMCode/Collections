public class Main {

    public static void main(String[] args) {
        Pet wuffi = new Pet();
        wuffi.setName("Wuffi");
        wuffi.setType("Dog");

        Pet mutzi = new Pet();
        mutzi.setName("Mutzi");
        mutzi.setType("Cat");

        Pet tweety = new Pet();
        tweety.setName("Tweety");
        tweety.setType("Bird");

        Pet[] myPets = new Pet[2];
        myPets[0] = wuffi;
        myPets[1] = mutzi;

        for (Pet anyPet : myPets){
            System.out.println("Ich füttere " + anyPet);
        }

    }

}
