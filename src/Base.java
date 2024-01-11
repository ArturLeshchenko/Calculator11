public class Base {
    static String base(String dd) {

        if (dd.contains("*")) {
            int znak1 = dd.indexOf('*');
            String z = dd.substring(0, znak1);
            String y = dd.substring(znak1 + 1);
            if ((z.equals("1") || z.equals("2") || z.equals("3") || z.equals("4") || z.equals("5") || z.equals("6") || z.equals("7") || z.equals("8") || z.equals("9") || z.equals("10")) && (y.equals("1") || y.equals("2") || y.equals("3") || y.equals("4") || y.equals("5") || y.equals("6") || y.equals("7") || y.equals("8") || y.equals("9") || y.equals("10"))) {
                ArabNumbers.arabnumbers(String.valueOf(dd));
            }
            if ((z.equals("I") || z.equals("II") || z.equals("III") || z.equals("IV") || z.equals("V") || z.equals("VI") || z.equals("VII") || z.equals("VIII") || z.equals("IX") || z.equals("X")) && (y.equals("I") || y.equals("II") || y.equals("III") || y.equals("IV") || y.equals("V") || y.equals("VI") || y.equals("VII") || y.equals("VIII") || y.equals("IX") || y.equals("X"))) {
                RomeNumbers.romenumbers(String.valueOf(dd));
            }
            if ((z.equals("1") || z.equals("2") || z.equals("3") || z.equals("4") || z.equals("5") || z.equals("6") || z.equals("7") || z.equals("8") || z.equals("9") || z.equals("10")) && (y.equals("I") || y.equals("II") || y.equals("III") || y.equals("IV") || y.equals("V") || y.equals("VI") || y.equals("VII") || y.equals("VIII") || y.equals("IX") || y.equals("X"))) {
                System.out.println("Ошибка");
            }
            if ((z.equals("I") || z.equals("II") || z.equals("III") || z.equals("IV") || z.equals("V") || z.equals("VI") || z.equals("VII") || z.equals("VIII") || z.equals("IX") || z.equals("X")) && (y.equals("1") || y.equals("2") || y.equals("3") || y.equals("4") || y.equals("5") || y.equals("6") || y.equals("7") || y.equals("8") || y.equals("9") || y.equals("10"))) {
                System.out.println("Ошибка");
            }
        }
        if (dd.contains("/")) {
            int znak2 = dd.indexOf('/');
            String w = dd.substring(0, znak2);
            String q = dd.substring(znak2 + 1);
            if ((w.equals("1") || w.equals("2") || w.equals("3") || w.equals("4") || w.equals("5") || w.equals("6") || w.equals("7") || w.equals("8") || w.equals("9") || w.equals("10")) && (q.equals("1") || q.equals("2") || q.equals("3") || q.equals("4") || q.equals("5") || q.equals("6") || q.equals("7") || q.equals("8") || q.equals("9") || q.equals("10"))) {
                ArabNumbers.arabnumbers(String.valueOf(dd));
            }
            if ((w.equals("I") || w.equals("II") || w.equals("III") || w.equals("IV") || w.equals("V") || w.equals("VI") || w.equals("VII") || w.equals("VIII") || w.equals("IX") || w.equals("X")) && (q.equals("I") || q.equals("II") || q.equals("III") || q.equals("IV") || q.equals("V") || q.equals("VI") || q.equals("VII") || q.equals("VIII") || q.equals("IX") || q.equals("X"))) {
                RomeNumbers.romenumbers(String.valueOf(dd));
            }
            if ((w.equals("1") || w.equals("2") || w.equals("3") || w.equals("4") || w.equals("5") || w.equals("6") || w.equals("7") || w.equals("8") || w.equals("9") || w.equals("10")) && (q.equals("I") || q.equals("II") || q.equals("III") || q.equals("IV") || q.equals("V") || q.equals("VI") || q.equals("VII") || q.equals("VIII") || q.equals("IX") || q.equals("X"))) {
                System.out.println("Ошибка");
            }
            if ((w.equals("I") || w.equals("II") || w.equals("III") || w.equals("IV") || w.equals("V") || w.equals("VI") || w.equals("VII") || w.equals("VIII") || w.equals("IX") || w.equals("X")) && (q.equals("1") || q.equals("2") || q.equals("3") || q.equals("4") || q.equals("5") || q.equals("6") || q.equals("7") || q.equals("8") || q.equals("9") || q.equals("10"))) {
                System.out.println("Ошибка");
            }
        }
        if (dd.contains("+")) {
            int znak3 = dd.indexOf('+');
            String e = dd.substring(0, znak3);
            String o = dd.substring(znak3 + 1);
            if ((e.equals("1") || e.equals("2") || e.equals("3") || e.equals("4") || e.equals("5") || e.equals("6") || e.equals("7") || e.equals("8") || e.equals("9") || e.equals("10")) && (o.equals("1") || o.equals("2") || o.equals("3") || o.equals("4") || o.equals("5") || o.equals("6") || o.equals("7") || o.equals("8") || o.equals("9") || o.equals("10"))) {
                ArabNumbers.arabnumbers(String.valueOf(dd));
            }
            if ((e.equals("I") || e.equals("II") || e.equals("III") || e.equals("IV") || e.equals("V") || e.equals("VI") || e.equals("VII") || e.equals("VIII") || e.equals("IX") || e.equals("X")) && (o.equals("I") || o.equals("II") || o.equals("III") || o.equals("IV") || o.equals("V") || o.equals("VI") || o.equals("VII") || o.equals("VIII") || o.equals("IX") || o.equals("X"))) {
                RomeNumbers.romenumbers(String.valueOf(dd));
            }
            if ((e.equals("1") || e.equals("2") || e.equals("3") || e.equals("4") || e.equals("5") || e.equals("6") || e.equals("7") || e.equals("8") || e.equals("9") || e.equals("10")) && (o.equals("I") || o.equals("II") || o.equals("III") || o.equals("IV") || o.equals("V") || o.equals("VI") || o.equals("VII") || o.equals("VIII") || o.equals("IX") || o.equals("X"))) {
                System.out.println("Ошибка");
            }
            if ((e.equals("I") || e.equals("II") || e.equals("III") || e.equals("IV") || e.equals("V") || e.equals("VI") || e.equals("VII") || e.equals("VIII") || e.equals("IX") || e.equals("X")) && (o.equals("1") || o.equals("2") || o.equals("3") || o.equals("4") || o.equals("5") || o.equals("6") || o.equals("7") || o.equals("8") || o.equals("9") || o.equals("10"))) {
                System.out.println("Ошибка");
            }
        }
        if (dd.contains("-")) {
            int znak4 = dd.indexOf('-');
            String i = dd.substring(0, znak4);
            String u = dd.substring(znak4 + 1);
            if ((i.equals("1") || i.equals("2") || i.equals("3") || i.equals("4") || i.equals("5") || i.equals("6") || i.equals("7") || i.equals("8") || i.equals("9") || i.equals("10")) && (u.equals("1") || u.equals("2") || u.equals("3") || u.equals("4") || u.equals("5") || u.equals("6") || u.equals("7") || u.equals("8") || u.equals("9") || u.equals("10"))) {
                ArabNumbers.arabnumbers(String.valueOf(dd));
            }
            if ((i.equals("I") || i.equals("II") || i.equals("III") || i.equals("IV") || i.equals("V") || i.equals("VI") || i.equals("VII") || i.equals("VIII") || i.equals("IX") || i.equals("X")) && (u.equals("I") || u.equals("II") || u.equals("III") || u.equals("IV") || u.equals("V") || u.equals("VI") || u.equals("VII") || u.equals("VIII") || u.equals("IX") || u.equals("X"))) {
                RomeNumbers.romenumbers(String.valueOf(dd));
            }
            if ((i.equals("1") || i.equals("2") || i.equals("3") || i.equals("4") || i.equals("5") || i.equals("6") || i.equals("7") || i.equals("8") || i.equals("9") || i.equals("10")) && (u.equals("I") || u.equals("II") || u.equals("III") || u.equals("IV") || u.equals("V") || u.equals("VI") || u.equals("VII") || u.equals("VIII") || u.equals("IX") || u.equals("X"))) {
                System.out.println("Ошибка");
            }
            if ((i.equals("I") || i.equals("II") || i.equals("III") || i.equals("IV") || i.equals("V") || i.equals("VI") || i.equals("VII") || i.equals("VIII") || i.equals("IX") || i.equals("X")) && (u.equals("1") || u.equals("2") || u.equals("3") || u.equals("4") || u.equals("5") || u.equals("6") || u.equals("7") || u.equals("8") || u.equals("9") || u.equals("10"))) {
                System.out.println("Ошибка");
            }
        }
        return dd;
    }
}