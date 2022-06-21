package pet;

public class PetMaster {
    public static void main(String[] args) {
        Pet myPet1 = new Pet("John");
        Pet myPet2 = new Pet("henry");

        myPet1.isCheckSameName(myPet2);
    }
}
