package Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {
        Person person1 = new Person("Артем", "Иванов", 20, "Архитектор", 75000);
        Person person2 = new Person("Богдан", "Ткаченко", 31, "Инженер", 40000);
        Person person3 = new Person("Влад", "Антипов", 46, "Юрист", 55000);
        Person person4 = new Person("Дима", "Ященко", 24, "Програмист", 150000);

//        ArrayList<Person> personList = new ArrayList<>();
//        personList.add(person1);
//        personList.add(person2);
//        personList.add(person3);
//        personList.add(person4);
//        System.out.println(personList);
    }
}

class Person {
    private String name;
    private String surname;
    private int age;
    private String job;
    private int salary;

    public Person(String name, String surname, int age, String job, int salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.job = job;
        this.salary = salary;
        System.out.println("Меня зовут " + name + " " + surname + "мне " + age + " лет" + " моя работа - " + job
                + " моя запралата " + salary );
    }
}
