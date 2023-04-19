package oop.add_tasks.task3;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        this.fullName = "Sanych";
        this.age = 40;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void talk() {
        System.out.println("Person говорит");
    }
}
