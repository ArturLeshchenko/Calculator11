package Calculator;

public class Exception {
    static void exception (String z, String y, String dd) {
        if ((z.equals("1") || z.equals("2") || z.equals("3") || z.equals("4") || z.equals("5") || z.equals("6") ||
                z.equals("7") || z.equals("8") || z.equals("9") || z.equals("10")) && (y.equals("1") || y.equals("2")
                || y.equals("3") || y.equals("4") || y.equals("5") || y.equals("6") || y.equals("7") || y.equals("8")
                || y.equals("9") || y.equals("10"))) {
            ArabNumbers.arabNumbers(String.valueOf(dd));
        }
        if ((z.equals("I") || z.equals("II") || z.equals("III") || z.equals("IV") || z.equals("V") || z.equals("VI")
                || z.equals("VII") || z.equals("VIII") || z.equals("IX") || z.equals("X")) && (y.equals("I") || y.equals("II")
                || y.equals("III") || y.equals("IV") || y.equals("V") || y.equals("VI") || y.equals("VII") || y.equals("VIII")
                || y.equals("IX") || y.equals("X"))) {
            RomeNumbers.romenumbers(dd);
        }
        if ((z.equals("1") || z.equals("2") || z.equals("3") || z.equals("4") || z.equals("5") || z.equals("6") ||
                z.equals("7") || z.equals("8") || z.equals("9") || z.equals("10")) && (y.equals("I") || y.equals("II")
                || y.equals("III") || y.equals("IV") || y.equals("V") || y.equals("VI") || y.equals("VII") || y.equals("VIII")
                || y.equals("IX") || y.equals("X"))) {
            System.out.println("Ошибка");
        }
        if ((z.equals("I") || z.equals("II") || z.equals("III") || z.equals("IV") || z.equals("V") || z.equals("VI")
                || z.equals("VII") || z.equals("VIII") || z.equals("IX") || z.equals("X")) && (y.equals("1")
                || y.equals("2") || y.equals("3") || y.equals("4") || y.equals("5") || y.equals("6") || y.equals("7")
                || y.equals("8") || y.equals("9") || y.equals("10"))) {
            System.out.println("Ошибка");
        }
    }
}
