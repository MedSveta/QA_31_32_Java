package webinar5;

import java.util.Objects;

public class PetAnimal extends Animal{
  public String owner;

    public PetAnimal() {
    }

    public PetAnimal(String name, int age,
                     double weight, boolean isWild, String owner) {
        super(name, age, weight, isWild);
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "PetAnimal is {" +
                " owner='" + owner + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PetAnimal petAnimal = (PetAnimal) o;
        return Objects.equals(owner, petAnimal.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), owner);
    }

}
