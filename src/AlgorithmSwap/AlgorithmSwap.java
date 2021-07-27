package AlgorithmSwap;

public class AlgorithmSwap {
    public static void main(String[] args) {
        int a = 50;
        String b = new String("123ll");
        swapFunction(a, b);

    }

    public static void swapFunction(int a, String b) {
        System.out.println("After a = " + a + "\nAfter b " + b);
        //Integer temp = (Integer) a;
        String ss = chekString(b);
        System.out.println(ss);
        b = String.valueOf(a);

        a = Integer.parseInt(ss);
        //b = temp.toString();

        System.out.println("Befor a = " + a + "\nBefor b " + b);
    }

    public static String chekString(String str) {
        String a = "0";
        String b = "9";
        String result = new String();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > a.charAt(0) || str.charAt(i) < b.charAt(0)) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}
