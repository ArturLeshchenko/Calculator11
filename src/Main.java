import javax.management.InvalidAttributeValueException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String d = sc.nextLine();
        String dd = d.replace(" ", "");
        int znak5 = dd.indexOf('*');
        int znak6 = dd.indexOf('/');
        int znak7 = dd.indexOf('+');
        int znak8 = dd.indexOf('-');
        String z = dd.substring(0, znak5);
        String y = dd.substring(znak5 + 1);
        String w = dd.substring(0, znak6);
        String q = dd.substring(znak6 + 1);
        String e = dd.substring(0, znak7);
        String o = dd.substring(znak7 + 1);
        String i = dd.substring(0, znak8);
        String u = dd.substring(znak8 + 1);


        if ((z == "1" || z == "2" || z == "3" || z == "4" || z == "5" || z == "6" || z == "7" || z ==  "8" || z == "9" || z == "10") && (y == "1" || y == "2" || y == "3" || y == "4" || y == "5" || y == "6" || y == "7" || y ==  "8" || y == "9" || y == "10")) {
                String f = ArabNumbers.arabnumbers(String.valueOf(dd));
            }
        if ((w == "1" || w == "2" || w == "3" || w == "4" || w == "5" || w == "6" || w == "7" || w ==  "8" || w == "9" || w == "10") && (q == "1" || q == "2" || q == "3" || q == "4" || q == "5" || q == "6" || q == "7" || q ==  "8" || q == "9" || q == "10")) {
            String f = ArabNumbers.arabnumbers(String.valueOf(dd));
        }
        if ((e == "1" || e == "2" || e == "3" || e == "4" || e == "5" || e == "6" || e == "7" || e ==  "8" || e == "9" || e == "10") && (o == "1" || o == "2" || o == "3" || o == "4" || o == "5" || o == "6" || o == "7" || o ==  "8" || o == "9" || o == "10")) {
            String f = ArabNumbers.arabnumbers(String.valueOf(dd));
        }
        if ((i == "1" || i == "2" || i == "3" || i == "4" || i == "5" || i == "6" || i == "7" || i ==  "8" || i == "9" || i == "10") && (u == "1" || u == "2" || u == "3" || u == "4" || u == "5" || u == "6" || u == "7" || u ==  "8" || u == "9" || u == "10")) {
            String f = ArabNumbers.arabnumbers(String.valueOf(dd));
        }
        if ((z == "I" || z == "II" || z == "III" || z == "IV" || z == "V" || z == "VI" || z == "VII" || z ==  "VIII" || z == "IX" || z == "X") && (y == "I" || y == "II" || y == "III" || y == "IV" || y == "V" || y == "VI" || y == "VII" || y ==  "VIII" || y == "IX" || y == "X")) {
            String c = RomeNumbers.romenumbers(String.valueOf(dd));
        }
        if ((w == "I" || w == "II" || w == "III" || w == "IV" || w == "V" || w == "VI" || w == "VII" || w ==  "VIII" || w == "IX" || w == "X") && (q == "I" || q == "II" || q == "III" || q == "IV" || q == "V" || q == "VI" || q == "VII" || q ==  "VIII" || q == "IX" || q == "X")) {
            String c = RomeNumbers.romenumbers(String.valueOf(dd));
        }
        if ((e == "I" || e == "II" || e == "III" || e == "IV" || e == "V" || e == "VI" || e == "VII" || e ==  "VIII" || e == "IX" || e == "X") && (o == "I" || o == "II" || o == "III" || o == "IV" || o == "V" || o == "VI" || o == "VII" || o ==  "VIII" || o == "IX" || o == "X")) {
            String c = RomeNumbers.romenumbers(String.valueOf(dd));
        }
        if ((i == "I" || i == "II" || i == "III" || i == "IV" || i == "V" || i == "VI" || i == "VII" || i ==  "VIII" || i == "IX" || i == "X") && (u == "I" || u == "II" || u == "III" || u == "IV" || u == "V" || u == "VI" || u == "VII" || u ==  "VIII" || u == "IX" || u == "X")) {
            String c = RomeNumbers.romenumbers(String.valueOf(dd));
        }
    }
}


