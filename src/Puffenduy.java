public class Puffenduy extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Puffenduy(String firstName, String lastName, int witchcraft, int transgression, int industriousness, int loyalty, int honesty) {
        super(firstName, lastName, witchcraft, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void comparePuffenduy(Puffenduy puffenduy) {
        if (industriousness + loyalty + honesty > puffenduy.industriousness + puffenduy.loyalty + puffenduy.honesty) {
            System.out.println(getFirstName() + " лучший Пуффендуйец, чем " + puffenduy.getFirstName());
        } else if (industriousness + loyalty + honesty < puffenduy.industriousness + puffenduy.loyalty + puffenduy.honesty) {
            System.out.println(puffenduy.getFirstName() + " лучший Пуффендуйец, чем " + getFirstName());
        } else {
            System.out.println(puffenduy.getFirstName() + " и " + getFirstName() + " это один и тот же студент");
        }
    }

    @Override
    public String toString() {
        toString(getFirstName(), getLastName(), getWitchcraft(), getTransgression());
        return ", industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty;
    }
}
