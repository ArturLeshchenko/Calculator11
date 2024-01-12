public class ArabNumbers {
    static String arabNumbers(String dd) {
        String z;
        String y;
        int znak;
        if (dd.contains("*")) {
            int result1 = Multiply.multiplication(Integer.parseInt(dd.substring(0, dd.indexOf('*'))),
                    Integer.parseInt(dd.substring(dd.indexOf('*') + 1)));
            System.out.println(result1);
        }

        if (dd.contains("/")) {
            int result1 = Division.division(Integer.parseInt(dd.substring(0, dd.indexOf('/'))),
                    Integer.parseInt(dd.substring(dd.indexOf('/') + 1)));
            System.out.println(result1);
        }

        if (dd.contains("+")) {
            int result1 = Plus.plus(Integer.parseInt(dd.substring(0, dd.indexOf('+'))),
                    Integer.parseInt(dd.substring(dd.indexOf('+') + 1)));
            System.out.println(result1);
        }

        if (dd.contains("-")) {
            int result1 = Minus.minus(Integer.parseInt(dd.substring(0, dd.indexOf('+'))),
                    Integer.parseInt(dd.substring(dd.indexOf('+') + 1)));
            System.out.println(result1);
        }
        return dd;
    }
}
