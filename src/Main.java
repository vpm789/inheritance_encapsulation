import java.util.Scanner;

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

        Gryffindor[] gryffindors = {
                new Gryffindor("Harry", "Potter", 7, 7, 5, 5, 6),
                new Gryffindor("Hermione", "Granger", 4, 5, 5, 6, 6),
                new Gryffindor("Ron", "Weasley", 4, 5, 3, 6, 5),
        };

        Puffenduy[] puffenduys = {
                new Puffenduy("Zacharias", "Smith", 3, 4, 5, 5, 7),
                new Puffenduy("Cedric", "Diggory", 3, 3, 5, 5, 4),
                new Puffenduy("Justin", "FinchFletchley", 4, 4, 4, 6, 5),
        };

        Kogtevran[] kogtevrans = {
                new Kogtevran("Zhou", "Chang", 4, 5, 5, 4, 6, 6),
                new Kogtevran("Padma", "Patil", 3, 6, 4, 5, 3, 5),
                new Kogtevran("Marcus", "Belby", 3, 4, 5, 5, 6, 7),
        };

        Slytherin[] slytherins = {
                new Slytherin("Draco", "Malfoy", 4, 3, 4, 6, 5, 6, 4),
                new Slytherin("Graham", "Montague", 2, 4, 6, 5, 3, 7, 5),
                new Slytherin("Gregory", "Goyle", 3, 5, 5, 4, 4, 4, 6),
        };

        int firstStudentFaculty = (int) (Math.random() * gryffindors.length);
        int secondStudentFaculty = (int) (Math.random() * gryffindors.length);
        gryffindors[firstStudentFaculty].compareGryffindor(gryffindors[secondStudentFaculty]);
        puffenduys[firstStudentFaculty].comparePuffenduy(puffenduys[secondStudentFaculty]);
        kogtevrans[firstStudentFaculty].compareKogtevran(kogtevrans[secondStudentFaculty]);
        slytherins[firstStudentFaculty].compareSlytherin(slytherins[secondStudentFaculty]);

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