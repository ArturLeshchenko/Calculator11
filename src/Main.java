import javax.management.InvalidAttributeValueException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String d = sc.nextLine();
        String dd = d.replace(" ", "");
        Base.base(String.valueOf(dd));
    }
}

