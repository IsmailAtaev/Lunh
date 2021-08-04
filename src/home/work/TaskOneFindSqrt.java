package home.work;

import java.util.Scanner;


public class TaskOneFindSqrt {
    public static void main(String[] args) {

        //Double result = new Double(0.0);
        //Double korenResult = new Double(0.0);
        /*Scanner in = new Scanner(System.in);

        System.out.print("enter a =\t");
        Double a = in.nextDouble();

        System.out.print("enter b =\t");
        Double b = in.nextDouble();

        System.out.print("enter c =\t");
        Double c = in.nextDouble();*/
        MyInputStream in = new ModulInputStream();
        SquareRoot squareRoot = new SquareRoot();

        squareRoot.squareRoot(in.myInputDouble("a"),in.myInputDouble("b"),in.myInputDouble("c"));
        System.out.println(squareRoot.getArrayKoren());

       /* if (a != 0) {
            result = Math.pow(b, 2) - 4 * (a * c);
             korenResult = Math.sqrt(result);

            if (korenResult < 0) {
                System.out.println("Do not korney minus number ");

            } else if (korenResult == 0) {
                //Double one = (-b  + korenResult) / (Math.pow(a, 2));
                //System.out.println("One koren = " + MyMathPow.Koren(b, korenResult, a));
                System.out.println((-b + korenResult) / (Math.pow(a, 2)));

            } else {
                // b *= -1;
                // Double one = ((Math.pow(b, 2) + korenResult) / (Math.pow(a, 2)));
                // Double one = (-b  + korenResult) / (Math.pow(a, 2));
                // Double two = (-b - korenResult ) / Math.pow(a, 2);
                Double one = (-b + korenResult) / (Math.pow(a, 2));
                Double two = (-b - korenResult) / (Math.pow(a, 2));
                System.out.println("One koren = " + one + "\nTwo koren = " + two);
            }
        }*/
    }
}