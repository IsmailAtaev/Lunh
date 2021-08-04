package homeWork;

public class HomeWork3 {
    public static void main(String[] args) {
        Double x = new Double(5.3);
        Double y = new Double(8.3);

        Double resSin = Math.sin(x) + Math.cos(y);
        Double resCos = Math.cos(x) + Math.sin(y);
        resSin *= resCos;
        Double res = Math.tan(resSin);
        System.out.println("sin = " + resSin + "\ncos = " + resCos);
    }
}
