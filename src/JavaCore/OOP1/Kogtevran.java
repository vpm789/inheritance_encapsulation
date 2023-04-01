package JavaCore.OOP1;

public class Kogtevran extends Hogwarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Kogtevran(String firstName, String lastName, int witchcraft, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(firstName, lastName, witchcraft, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }
    public void compareKogtevran(Kogtevran kogtevran) {
        if (mind + wisdom + wit + creativity > kogtevran.mind + kogtevran.wisdom + kogtevran.wit + kogtevran.creativity) {
            System.out.println(getFirstName() + " лучший Когтевранец, чем " + kogtevran.getFirstName());
        } else if (mind + wisdom + wit + creativity < kogtevran.mind + kogtevran.wisdom + kogtevran.wit + kogtevran.creativity) {
            System.out.println(kogtevran.getFirstName() + " лучший Когтевранец, чем " + getFirstName());
        } else {
            System.out.println(kogtevran.getFirstName() + " и " + getFirstName() + " это один и тот же студент");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity;
    }
}
