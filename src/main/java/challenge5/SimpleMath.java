package challenge5;

public class SimpleMath {

    private int x;
    private int y;
    public SimpleMath(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public int getSum() {
        return x+y;
    }

    public int getDiff() {
        return x-y;
    }

    public int getMultiply() {
        return x*y;
    }

    public int getDivision() {
        return x/y;
    }
}
