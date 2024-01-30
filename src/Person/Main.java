package Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {

        Car car1 = new Car("Woltvagen", "Polo", "А205БВ", "Черный", "Артем");
        Car car2 = new Car("Лада", "Vesta", "Г307ТТ", "Белый", "Богдан");
        Car car3 = new Car("Kia", "Rio", "R023НГ", "Металик", "Влад");
        Car car4 = new Car("Tesla", "Y", "Г307ТТ", "Желтый", "Дима");
        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
//        for (Car r : carList){
//            r.presentationCar();
//        }


        Person person1 = new Person("Артем", "Иванов", 20, "Архитектор", 75000);
        Person person2 = new Person("Богдан", "Ткаченко", 31, "Инженер", 40000);
        Person person3 = new Person("Влад", "Антипов", 46, "Юрист", 55000);
        Person person4 = new Person("Дима", "Ященко", 24, "Програмист", 150000);
        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);


       for (Person p : personList){
           p.presentation();
           for (Car r : carList){
               r.presentationCar();
           }
       }
    }
}

