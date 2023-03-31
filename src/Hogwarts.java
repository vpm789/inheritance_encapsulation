public abstract class Hogwarts {
    private String firstName;
    private String lastName;
    private int witchcraft;
    private int transgression;

    public Hogwarts(String firstName, String lastName, int witchcraft, int transgression) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public void compareStudent(Hogwarts student) {
        if (witchcraft + transgression > student.witchcraft + student.transgression) {
            System.out.println(getFirstName() + " " + getLastName() + " обладает большей мощностью магии, чем " + student.getFirstName() + " " + student.getLastName());
        } else if (witchcraft + transgression < student.witchcraft + student.transgression) {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " обладает большей мощностью магии, чем " + getFirstName() + " " + getLastName());
        } else {
            System.out.println(student.getFirstName() + " " + student.getLastName() + " и " + getFirstName() + " " + getLastName() + " это один и тот же студент");
        }
    }

    @Override
    public String toString() {
        return "firstName=" + firstName +
                ", lastName=" + lastName +
                ", witchcraft=" + witchcraft +
                ", transgression=" + transgression;
    }
}
