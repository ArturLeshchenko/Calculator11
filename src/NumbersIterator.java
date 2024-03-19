import Person.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class NumbersIterator {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList1 = new ArrayList<>();

        Integer i;
        for (i = 0; i <= 1000; i++) {
            arrayList1.add(i);
        }

        Iterator<Integer> iterator1 = arrayList1.iterator();
        while (iterator1.hasNext()) {
            Integer j = iterator1.next();
            if (j % 3 != 0) {
                iterator1.remove();
            }
        }

        ArrayList <Integer> arrayList2 = new ArrayList<>(arrayList1);
        Iterator<Integer> iterator2 = arrayList2.iterator();
        while (iterator2.hasNext()) {
            Integer p = iterator2.next();
            if (p % 5 == 0) {
                iterator2.remove();
            }
        }

        ArrayList <Integer> arrayList3 = new ArrayList<>(arrayList2);
        Iterator<Integer> iterator3 = arrayList3.iterator();
        while (iterator3.hasNext()) {
            Integer z = iterator3.next();
            int num = z;
            int sum = 0;
            while (num > 0) {
                sum = sum + num % 10;
                num = num / 10;
            }
            if (sum >= 10) {
                iterator3.remove();
            }
        }
        System.out.println(arrayList3);
    }
}
