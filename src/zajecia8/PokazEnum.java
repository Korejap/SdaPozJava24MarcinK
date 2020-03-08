package zajecia8;

public class PokazEnum {
    public static void main(String[] args) {


        PetType type1 = PetType.DOG;
        PetType type2 = PetType.CAT;
        PetType type3 = PetType.DOG;
        System.out.println(type1 == type2);
        System.out.println(type1 == type3);

        type1.giveSound();;
        type2.giveSound();;
        type3.giveSound();;


        PetType[] pet = PetType.values();

        for(PetType s: pet){
s.giveSound();
        }

PetType pett = PetType.valueOf("COW");


        PetType petThatGiveMuu = PetType.find("Muu");
        System.out.println(petThatGiveMuu.name()); // .name zeby bylo  w stringu
        System.out.println(petThatGiveMuu.ordinal()); // ktore zwierze w kolejnosci

    }
}
