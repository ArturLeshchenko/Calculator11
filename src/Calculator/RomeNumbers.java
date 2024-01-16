package Calculator;

public class RomeNumbers {

    static void romenumbers(String dd) {
        int znak;
        if (dd.contains("*")) {
            znak = dd.indexOf('*');
            int[] result = Map2.map2(dd.substring(0,znak), dd.substring(znak+1));
            int a = result [0];
            int b = result [1];
            int result1 = Multiply.multiplication(a, b);
            String c = Map1.map1(String.valueOf(result1));
            System.out.println(c);
        }

        if (dd.contains("/")) {
            znak = dd.indexOf('/');
            int[] result = Map2.map2(dd.substring(0,znak), dd.substring(znak+1));
            int a = result [0];
            int b = result [1];
            int result1 = Division.division(a, b);
            String c = Map1.map1(String.valueOf(result1));
            System.out.println(c);
        }

        if (dd.contains("+")) {
            znak = dd.indexOf('+');
            int[] result = Map2.map2(dd.substring(0,znak), dd.substring(znak+1));
            int a = result [0];
            int b = result [1];
            int result1 = Plus.plus(a, b);
            String c = Map1.map1(String.valueOf(result1));
            System.out.println(c);
        }

        if (dd.contains("-")) {
            znak = dd.indexOf('-');
            int[] result = Map2.map2(dd.substring(0,znak), dd.substring(znak+1));
            int a = result [0];
            int b = result [1];
            int result1 = Minus.minus(a, b);
            String c = Map1.map1(String.valueOf(result1));
            System.out.println(c);
        }
    }
}