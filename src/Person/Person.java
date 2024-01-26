package Person;

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
            Presentation.presentation(name, surname, age, job, salary);
        }
}
