package springjbrains.course.core.model;

/**
 * Created by NM.Rabotaev on 13.07.2017.
 */
public class Point {

    private int x;
    private int y;

    //ACCESSORS
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
