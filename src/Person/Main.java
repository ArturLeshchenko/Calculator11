package Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {

        Car car1 = new Car("Woltvagen", "Polo", "А205БВ", "Черный", "Артем");
        Car car2 = new Car("Лада", "Vesta", "Г307ТТ", "Белый", "Богдан");
        Car car3 = new Car("Kia", "Rio", "R023НГ", "Металик", "Влад");
        Car car4 = new Car("Tesla", "Y", "Г307ТТ", "Желтый", "Дима");
        Car car5 = new Car("Woltvagen", "Polo", "А205БВ", "Черный", "Павел");
        Car car6 = new Car("Лада", "Vesta", "Г307ТТ", "Белый", "Лев");
        Car car7 = new Car("Kia", "Rio", "R023НГ", "Металик", "Алиса");
        Car car8 = new Car("Tesla", "Y", "Г307ТТ", "Желтый", "Екатерина");
        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);


//        for (Car r : carList){
//            r.presentationCar();
//        }

        Passport passport1 = new Passport("Артем", "01.01.1980", "Москва");
        Passport passport2 = new Passport("Богдан", "02.02.1992", "Ростов");
        Passport passport3 = new Passport("Влад", "03.03.1995", "Волгоград");
        Passport passport4 = new Passport("Дима", "04.04.1999", "Владивосток");
        Passport passport5 = new Passport("Павел", "05.05.2002", "Краснодар");
        Passport passport6 = new Passport("Лев", "06.06.1978", "Вологда");
        Passport passport7 = new Passport("Алиса", "07.07.1980", "Иркутск");
        Passport passport8 = new Passport("Екатерина", "08.08.1962", "Москва");
        List<Passport> passportList = new ArrayList<>();
        passportList.add(passport1);
        passportList.add(passport2);
        passportList.add(passport3);
        passportList.add(passport4);
        passportList.add(passport5);
        passportList.add(passport6);
        passportList.add(passport7);
        passportList.add(passport8);
//        for (Passport a : passportList){
//           a.getCity();
//      }




        Person person1 = new Person("Артем", "Иванов", 20, "Архитектор", 75000, car1, passport1);
        Person person2 = new Person("Богдан", "Ткаченко", 31, "Инженер", 40000, car2, passport2);
        Person person3 = new Person("Влад", "Антипов", 46, "Юрист", 55000, car3, passport3);
        Person person4 = new Person("Дима", "Ященко", 24, "Програмист", 150000, car4, passport4);
        Person person5 = new Person("Павел", "Васильев", 20, "Повар", 65000, car5, passport5);
        Person person6 = new Person("Лев", "Лещенко", 31, "Управляющий", 60000, car6, passport6);
        Person person7 = new Person("Алиса", "Антипов", 46, "Адвокат", 55000, car7, passport7);
        Person person8 = new Person("Екатерина", "Ященко", 24, "Судья", 250000, car8, passport8);
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);
        personList.add(person8);

        for (Passport a : passportList){
            String b = a.getCity();
            Passport.presentationPassport(personList, b);
        }


        //Passport.presentationPassport(personList, b);



        System.out.println(personList);

//        person3.setJob("Уборщик");
//        System.out.println(person3.getJob());
//
//       for (Person p : personList){
//           p.presentationPassport();
//       }
//
    }
}

