package oop.part1;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstPower;

    public Slytherin(String firstName, String lastName, int witchcraft, int transgression, int cunning, int determination, int ambition, int resourcefulness, int thirstPower) {
        super(firstName, lastName, witchcraft, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstPower = thirstPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstPower() {
        return thirstPower;
    }

    public void compareSlytherin(Slytherin slytherin) {
        if (cunning + determination + ambition + resourcefulness + thirstPower > slytherin.cunning + slytherin.determination + slytherin.ambition + slytherin.resourcefulness + slytherin.thirstPower) {
            System.out.println(getFirstName() + " лучший Слизеринец, чем " + slytherin.getFirstName());
        } else if (cunning + determination + ambition + resourcefulness + thirstPower < slytherin.cunning + slytherin.determination + slytherin.ambition + slytherin.resourcefulness + slytherin.thirstPower) {
            System.out.println(slytherin.getFirstName() + " лучший Слизеринец, чем " + getFirstName());
        } else {
            System.out.println(slytherin.getFirstName() + " и " + getFirstName() + " это один и тот же студент");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstPower=" + thirstPower;
    }
}
