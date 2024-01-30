package Person;

import java.util.List;

public class Person {

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
        }
    public void presentation(){

        System.out.println("Меня зовут " + name + " " + surname + "мне " + age + " лет" + " моя работа - " + job
                + " моя запралата " + salary);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }
}
