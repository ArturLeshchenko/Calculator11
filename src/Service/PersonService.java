package Service;

import Person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonService {
    public List <Person> filterByCity(List<Person> persons) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите город для фильтрации");
        String city = s.nextLine();
        List <Person> filtredList = new ArrayList<>();
        for (Person p : persons) {
            if (p.getPassport().getCity().equals(city)) {
                filtredList.add(p);
            }
        }
        if (filtredList.isEmpty()) {
            System.out.println("Персона из города " + city + " не найдена");
            return filtredList;
        }
        return filtredList;
    }

    public List <Person> filterByAge(List<Person> persons) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст для фильтрации");
        String age1 =  sc.nextLine();
       // int age = Integer.parseInt (age1);



        List <Person> filtredList1 = new ArrayList<>();

        if (age1.contains("-")) {
            int znak = age1.indexOf('-');
            String z = age1.substring(0, znak);
            int zz = Integer.parseInt(z);
            String y = age1.substring(znak + 1);
            int yy = Integer.parseInt(y);
            for (Person p : persons) {
                if ((p.getAge() > zz) && (p.getAge() < yy)) {
                    filtredList1.add(p);
                }
            }
        }
        else
                for (Person p : persons) {
                    int age = Integer.parseInt (age1);
                    if (p.getAge() == age) {
                        filtredList1.add(p);
                    }
                }


//        for (Person p : persons) {
//            if (p.getAge() == age) {
//                filtredList1.add(p);
//            }
//            if (age1.contains("-")) {
//                int znak;
//                znak = age1.indexOf('-');
//                String z;
//                z = age1.substring(0, znak);
//                int zz = Integer.parseInt(z);
//                String y;
//                y = age1.substring(znak + 1);
//                int yy = Integer.parseInt(y);
//                if ((p.getAge() > zz) && (p.getAge() < yy)) {
//                    filtredList1.add(p);
//                }
//            }

        if (filtredList1.isEmpty()) {
            System.out.println("Возраст персоны " + age1 + " не найден");
            return filtredList1;
        }

        return filtredList1;
    }
}

