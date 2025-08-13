package webinar5;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal1 = new Animal("tiger", 7,
                134.0, true);

        System.out.println(animal1);
        printAnimal(animal1);
        System.out.println("====================");
        System.out.println(animal1.getName());
        animal1.setName("");
        System.out.println(animal1);
        animal1.setAge(150);
        System.out.println(animal1);
        animal1.setWeight(200000.);
        System.out.println(animal1);
        System.out.println("=================");
        Lion lion1 = new Lion("Pushok", 13,
                199., true, "savanna");
        lion1.makeVoice();
        Dog dog1 = new Dog("Sharik", 3, 14.,
                false, "Owner1");
        dog1.makeVoice();

        Animal[] animals = {lion1, dog1, animal1};
        for (Animal a: animals){
            System.out.println(a.toString());
        }

    }

    public static void printAnimal(Animal animal) {
        System.out.println("Name animal: " + animal.getName() + ", age: " +
                animal.getAge() + ", weight: " + animal.getWeight());
    }
}
