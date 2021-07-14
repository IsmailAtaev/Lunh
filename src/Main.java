import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        String flags = new String();
        do {
            List<Integer> arrays = new ArrayList<>();
            System.out.println(" Введите номер карты ");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.next();

            for (int i = str.length(); i > 0; i--) {
                arrays.add(Character.getNumericValue(str.charAt(i - 1)));
            }

            for (int j = 0; j < arrays.size(); j++) {
                System.out.println(arrays.get(j));
                if (j % 2 == 0) {
                    Integer temp = new Integer(arrays.get(j) * 2);
                    arrays.set(j, temp);
                    if (arrays.get(j) > 9) {
                        Integer val = new Integer(arrays.get(j) - 9);
                        arrays.set(j, val);
                    } else
                        continue;
                } else
                    continue;
            }
            Integer res = new Integer(0);
            for (int n = 0; n < arrays.size(); n++) {
                res += arrays.get(n);
            }
            if (res % 10 == 0) {
                System.out.println(" Карта валидатная true ");
            } else {
                System.out.println("  Карта не валидатная false!!! ");
            }

            System.out.println(" Хотите повторить если Да нажмите (1) или Нет (2)");
            flags = scanner.next();


        } while (flags.equals("1"));
        //int[] arr = new int[14];
        //int[] arr = {6,0,1,1,1,1,1,1,1,1,1,1,1,1,1,7};
        // 6011111111111117
        /*for (int r = 0; r < arr.length; r++) {
            int hh = arr[r] % 2;
            if (r % 2 == 0) {
                arr[r] *= 2;
                if (arr[r] > 9) {
                    arr[r] -= 9;
                } else
                    continue;
            } else
                continue;
        }
        int res = 0;
        for (int y = 0; y < arr.length; y++) {
            res += arr[y];
        }
        System.out.println(res + " result");
        int s = res % 10;
        if (s == 0) {
            System.out.println("true");
        } else {
            System.out.println("false ");
        }
*/
       /* arrays.add(5);
        arrays.add(0);
        arrays.add(0);
        arrays.add(0);
        arrays.add(1);
        arrays.add(3);
        arrays.add(6);
        arrays.add(4);
        arrays.add(2);
        arrays.add(2);
        arrays.add(8);
        arrays.add(2);
        arrays.add(8);
        arrays.add(7);
        arrays.add(0);

        for (int j = 0; j  < arrays.size(); j++) {
            Integer r = arrays.get(j) % 2;
            if (r.equals(0)) {
                Integer gg = new Integer(arrays.get(j) * 2);
                arrays.set(j, gg);
                if (arrays.get(j) > 9) {
                    Integer res = new Integer(arrays.get(j) - 9);
                    arrays.set(j, res);
                } else
                    continue;

            } else
                continue;
        }

        Integer result = new Integer(0);
        for (int i = 0; i < arrays.size(); i++) {
            result += arrays.get(i);
        }
        System.out.println("i am result " + result);

        Integer s = result % 10;
        if (s.equals(0)) {
            System.out.println("true");
        } else {
            System.out.println("false ");
        }
*/



        /*for (int i = 0; i < str.length(); i++) {
            //arrays.add((int) str.charAt(i));
           int val = str.indexOf(i);
            arrays.add(val);
            System.out.println(val);
            System.out.println(arrays.get(i));

        }

        System.out.println("\n\n\t"+arrays.get(1)+ "\n\n");
*/
    }
}