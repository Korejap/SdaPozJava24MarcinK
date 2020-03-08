package zajecia8;

public enum PetType {
    DOG("hau hau"), CAT("miał"), FiSH("?"), RABBIT("kwi kwi"), COW ("Muu");
private String sound;

  PetType(String sound){
this.sound = sound;
  }

  public void giveSound(){
      System.out.println(sound);
  }
  public  static PetType find(String input){
      for(PetType pet: values()){
          if(pet.sound.equals(input)){
              return pet;
          }
      }
      return null;
  }
}
