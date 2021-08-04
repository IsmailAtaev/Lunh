package home.work;

import java.util.Scanner;

public class HomeWorkNumber5 {
    public static void main(String[] args) {
        Double PI = 3.141592;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number =\t");
        Double a = in.nextDouble();
        System.out.println("Плошадь круга = " + a * a / (4 * PI));
    }
}
