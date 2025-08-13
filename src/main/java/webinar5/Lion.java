package webinar5;

public class Lion extends WildAnimal{
    public static final String HABITAT_LION = "savanna";

    public Lion(String name, int age, double weight,
                boolean isWild, String habitat) {
        super(name, age, weight, isWild, HABITAT_LION);
    }

    @Override
    public String toString() {
        return "Lion - " + getName()+ getHabitat();
    }

    @Override
    public void makeVoice() {
        System.out.println("Hrrrrr");
    }
}
