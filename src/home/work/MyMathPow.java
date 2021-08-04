package home.work;

public class MyMathPow {
    public static Double getKorenPlus(Double b, Double resultKoren, Double a) {
        System.out.println(b + " " + resultKoren + " " + a);
        return ((-b + resultKoren) / (Math.pow(a, 2)));
    }

    public static Double getKorenMinus(Double b, Double resultKoren, Double a) {
        return ((-b - resultKoren) / (Math.pow(a, 2)));
    }
}


class Serial{
    private String firstCode;
    private String firsrName;

    public String getFirstCode() {
        return firstCode;
    }

    public void setFirstCode(String firstCode) {
        this.firstCode = firstCode;
    }

    public String getFirsrName() {
        return firsrName;
    }

    public void setFirsrName(String firsrName) {
        this.firsrName = firsrName;
    }

    @Override
    public String toString() {
        return "Serial{" +
                "firstCode='" + firstCode + '\'' +
                ", firsrName='" + firsrName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}