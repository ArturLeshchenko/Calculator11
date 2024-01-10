public class ArabNumbers {
    static String arabnumbers(String dd) {

        if (dd.contains("*")) {
            int znak1 = dd.indexOf('*');
            String z = dd.substring(0, znak1);
            String y = dd.substring(znak1 + 1);
            int a = Integer.parseInt(z);
            int b = Integer.parseInt(y);
            int[] result = {a, b};
            int result1 = Multiply.multiplication(result);
            System.out.println(result1);
        }

        if (dd.contains("/")) {
            int znak1 = dd.indexOf('/');
            String z = dd.substring(0, znak1);
            String y = dd.substring(znak1 + 1);
            int a = Integer.parseInt(z);
            int b = Integer.parseInt(y);
            int[] result = {a, b};
            int result1 = Division.division(result);
            System.out.println(result1);
        }

        if (dd.contains("+")) {
            int znak1 = dd.indexOf('+');
            String z = dd.substring(0, znak1);
            String y = dd.substring(znak1 + 1);
            int a = Integer.parseInt(z);
            int b = Integer.parseInt(y);
            int[] result = {a, b};
            int result1 = Plus.plus(result);
            System.out.println(result1);
        }

        if (dd.contains("-")) {
            int znak1 = dd.indexOf('-');
            String z = dd.substring(0, znak1);
            String y = dd.substring(znak1 + 1);
            int a = Integer.parseInt(z);
            int b = Integer.parseInt(y);
            int[] result = {a, b};
            int result1 = Minus.minus(result);
            System.out.println(result1);
        }
        return dd;
    }
}
