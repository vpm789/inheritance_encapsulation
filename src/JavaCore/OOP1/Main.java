package JavaCore.OOP1;

public class Main {
    public static void main(String[] args) {
        Hogwarts[] students = {
                new Gryffindor("Harry", "Potter", 7, 7, 5, 5, 6),
                new Gryffindor("Hermione", "Granger", 4, 5, 5, 6, 6),
                new Gryffindor("Ron", "Weasley", 4, 5, 3, 6, 5),
                new Puffenduy("Zacharias", "Smith", 3, 4, 5, 5, 7),
                new Puffenduy("Cedric", "Diggory", 3, 3, 5, 5, 4),
                new Puffenduy("Justin", "FinchFletchley", 4, 4, 4, 6, 5),
                new Kogtevran("Zhou", "Chang", 4, 5, 5, 4, 6, 6),
                new Kogtevran("Padma", "Patil", 3, 6, 4, 5, 3, 5),
                new Kogtevran("Marcus", "Belby", 3, 4, 5, 5, 6, 7),
                new Slytherin("Draco", "Malfoy", 4, 3, 4, 6, 5, 6, 4),
                new Slytherin("Graham", "Montague", 2, 4, 6, 5, 3, 7, 5),
                new Slytherin("Gregory", "Goyle", 3, 5, 5, 4, 4, 4, 6),

        };

        ((Gryffindor) students[0]).compareGryffindor((Gryffindor) students[1]);
        ((Puffenduy) students[3]).comparePuffenduy((Puffenduy) students[4]);
        ((Kogtevran) students[6]).compareKogtevran((Kogtevran) students[8]);
        ((Slytherin) students[9]).compareSlytherin((Slytherin) students[11]);

        System.out.println();
        int firstStudent = (int) (Math.random() * students.length);
        int secondStudent = (int) (Math.random() * students.length);
        students[firstStudent].compareStudent(students[secondStudent]);

        System.out.println();

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

    }

}