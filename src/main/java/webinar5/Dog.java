package webinar5;

public class Dog extends PetAnimal {
    public Dog() {
    }

    public Dog(String name, int age,
               double weight, boolean isWild, String owner) {
        super(name, age, weight, isWild, owner);
    }

    @Override
    public String toString() {
        return "Dog - " + getName() + ", Owner --> " + getOwner();
    }

    @Override
    public void makeVoice() {
        System.out.println("Gav-gav");
    }
}
