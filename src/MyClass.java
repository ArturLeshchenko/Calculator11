import javax.management.InvalidAttributeValueException;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String d = sc.nextLine();
        String dd = d.replace(" ", "");

        if (d.contains("*")) {
            int znak1 = d.indexOf('*') ;
            int [] result = Map2.map2(d.substring(0, znak1), d.substring(znak1+1));
            int result1 = Multiply.multiplication(result);
            String c = Rome1.rome1(String.valueOf(result1));
            System.out.println(c);
        }

        if (d.contains("/")) {
            int znak1 = d.indexOf('/') ;
            String firstnumber = d.substring(0, znak1);
            String secondnumber = d.substring(znak1+1);
            Rome3 rome = new Rome3();
            rome.rome3(firstnumber, secondnumber);
        }

        if (d.contains("+")) {
            int znak1 = d.indexOf('+') ;
            String firstnumber = d.substring(0, znak1);
            String secondnumber = d.substring(znak1+1);
            Rome4 rome = new Rome4();
            rome.rome4(firstnumber, secondnumber);
        }

        if (d.contains("-")) {
            int znak1 = d.indexOf('-');
            String firstnumber = d.substring(0, znak1);
            String secondnumber = d.substring(znak1+1);
            Rome5 rome = new Rome5();
            rome.rome5(firstnumber, secondnumber);
        }
        
    }
}


