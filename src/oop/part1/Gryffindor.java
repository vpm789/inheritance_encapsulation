package oop.part1;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String firstName, String lastName, int witchcraft, int transgression, int nobility, int honor, int bravery) {
        super(firstName, lastName, witchcraft, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void compareGryffindor(Gryffindor gryffindor) {
        if (nobility + honor + bravery > gryffindor.nobility + gryffindor.honor + gryffindor.bravery) {
            System.out.println(getFirstName() + " лучший Гриффиндорец, чем " + gryffindor.getFirstName());
        } else if (nobility + honor + bravery < gryffindor.nobility + gryffindor.honor + gryffindor.bravery) {
            System.out.println(gryffindor.getFirstName() + " лучший Гриффиндорец, чем " + getFirstName());
        } else {
            System.out.println(gryffindor.getFirstName() + " и " + getFirstName() + " это один и тот же студент");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }
}
