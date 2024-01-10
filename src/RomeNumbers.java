public class RomeNumbers {

    static String romenumbers(String dd) {

        if (dd.contains("*")) {
            int znak1 = dd.indexOf('*');
            int[] result = Map2.map2(dd.substring(0, znak1), dd.substring(znak1 + 1));
            int result1 = Multiply.multiplication(result);
            String c = Map1.map1(String.valueOf(result1));
            System.out.println(c);
        }

        if (dd.contains("/")) {
            int znak1 = dd.indexOf('/');
            int[] result = Map2.map2(dd.substring(0, znak1), dd.substring(znak1 + 1));
            int result1 = Division.division(result);
            String c = Map1.map1(String.valueOf(result1));
            System.out.println(c);
        }

        if (dd.contains("+")) {
            int znak1 = dd.indexOf('+');
            int[] result = Map2.map2(dd.substring(0, znak1), dd.substring(znak1 + 1));
            int result1 = Plus.plus(result);
            String c = Map1.map1(String.valueOf(result1));
            System.out.println(c);
        }

        if (dd.contains("-")) {
            int znak1 = dd.indexOf('-');
            int[] result = Map2.map2(dd.substring(0, znak1), dd.substring(znak1 + 1));
            int result1 = Minus.minus(result);
            String c = Map1.map1(String.valueOf(result1));
            System.out.println(c);
        }
        return dd;
    }
}