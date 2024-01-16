package Calculator;

public class Base {
    static void base(String dd) {
        String z;
        String y;
        int znak;
        if (dd.contains("*")) {
            znak = dd.indexOf('*');
            z = dd.substring(0, znak);
            y = dd.substring(znak + 1);
            Exception.exception(z, y, dd);
        }
        if (dd.contains("/")) {
            znak = dd.indexOf('/');
            z = dd.substring(0, znak);
            y = dd.substring(znak + 1);
            Exception.exception(z, y, dd);
        }
        if (dd.contains("+")) {
            znak = dd.indexOf('+');
            z = dd.substring(0, znak);
            y = dd.substring(znak + 1);
            Exception.exception(z, y, dd);
        }
        if (dd.contains("-")) {
            znak = dd.indexOf('-');
            z = dd.substring(0, znak);
            y = dd.substring(znak + 1);
            Exception.exception(z, y, dd);
        }
    }
}