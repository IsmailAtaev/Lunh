package HomeWork;

import java.util.Scanner;
import static java.lang.Math.*;


public class HomeWork1 {
    public static void main(String[] args) {

      /*  Double resultOfDiscriminant = new Double(0.0);
        Double resultOfSqrtDiscriminant = new Double(0.0);
        Double korenOne = new Double(0.0);
        Double korenTwo = new Double(0.0);

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите а: ");
        Double a = sc.nextDouble();

        System.out.println("Введите b: ");
        Double b = sc.nextDouble();

        System.out.println("Введите c: ");
        Double c = sc.nextDouble();

        if (a != 0) {

            resultOfDiscriminant = (Double) (pow(b, 2) - (4 * a * c));
            System.out.println("Discriminant: " + resultOfSqrtDiscriminant);

            if (resultOfDiscriminant > 0) {

                korenOne = (Double) (((-1 * (pow(b, 2))) - (resultOfDiscriminant)) / (2 * a));
                System.out.println("koren One: " + korenOne);
                korenTwo = (Double) (((-1 * (pow(b, 2))) + (resultOfDiscriminant)) / (2 * a));

            } else if (resultOfDiscriminant == 0) {

                korenOne = ((-1) * b) / (2 * a);
                System.out.println("koren two: " + korenTwo);

            } else {
                System.out.println("Дискриминант равень 0, корней нет!!!");
            }
        } else {
            System.out.println("a is 0!!!!");
        }*/

        Double result = new Double(0.0);
        Double korenResult = new Double(0.0);
        Scanner in = new Scanner(System.in);

        System.out.println("enter a = ");
        Double a = in.nextDouble();

        System.out.println("enter b =");
        Double b = in.nextDouble();

        System.out.println("enter c =");
        Double c = in.nextDouble();

        if (a != 0) {
            result = Math.pow(b, 2) - 4 * (a * c);
            korenResult = Math.sqrt(result);

            if (korenResult < 0) {
                System.out.println("Do not korney minus number ");
            } else if (korenResult == 0) {
                Double one = (Math.pow(b, 2) + korenResult) / (Math.pow(a, 2));
                System.out.println("One koren = " + one);
            } else {
                b *= -1;
                Double one = ((Math.pow(b, 2) + korenResult) / (Math.pow(a, 2)));
                Double two = Math.pow(b, 2) + korenResult / Math.pow(a, 2);
                System.out.println("One koren = " + one + "\n Two koren = " + two);
            }
        }
    }
}