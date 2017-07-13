package springjbrains.course.core.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by NM.Rabotaev on 13.07.2017.
 */
public class ObjectTriangle implements DrawableForm {

    private final static Logger logger = LoggerFactory.getLogger(ObjectTriangle.class);

    private Point pointA;
    private Point pointB;
    private Point pointC;

    //ACCESSORS
    public Point getPointA() {
        return pointA;
    }
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }
    public Point getPointB() {
        return pointB;
    }
    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }
    public Point getPointC() {
        return pointC;
    }
    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public  void draw() {
        logger.info("Object triangle drawn: " + toString());
    }

    @Override
    public String toString() {
        return "ObjectTriangle{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                '}';
    }
}
