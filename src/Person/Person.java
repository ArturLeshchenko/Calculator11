package Person;

import java.util.List;
import java.util.Objects;

public class Person {

        private String name;
        private String surname;
        private int age;
        private String job;
        private int salary;

        private Car car;
        private Passport passport;

        public Person(String name, String surname, int age, String job, int salary, Car car, Passport passport) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.job = job;
            this.salary = salary;
            this.car = car;
            this.passport = passport;

        }







    public void presentation(){

        System.out.println("Меня зовут " + name + " " + surname + "мне " + age + " лет" + " моя работа - " + job
                + " моя запралата " + salary + " " + car.presentationCar());

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                ", car=" + car +
                ", passport=" + passport +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && salary == person.salary && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(job, person.job) && Objects.equals(car, person.car) && Objects.equals(passport, person.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, job, salary, car, passport);
    }

    public String getJob() {
        return this.job;
    }
    public Passport getPassport() {
        return this.passport;
    }
    public int getAge() {
        return this.age;
    }
    public void setJob(String job) {
        this.job = job;
    }

}
