 package home.work;

import java.util.Scanner;

public class ModulInputStream implements MyInputStream {
    private Scanner in;

    public ModulInputStream(Scanner in) {
        this.in = in;
    }

    public ModulInputStream() {
        this.in = new Scanner(System.in);
    }

    @Override
    public Double myInputDouble(String str) {
        System.out.print("Enter " + str + " =\t");
        return in.nextDouble();
    }
}