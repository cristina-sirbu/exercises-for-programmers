package challenge7;

public class AreaRectangularRoom {
    private int length;
    private int width;
    public AreaRectangularRoom(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public double getSquareMeterArea() {
        return Math.sqrt(getSquareFeetArea()*getSquareFeetArea()*0.09290304);
    }
    public int getSquareFeetArea() {
        return length*width;
    }
}
