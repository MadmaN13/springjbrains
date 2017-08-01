package springjbrains.course.core.model.triangle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import springjbrains.course.core.model.DrawableForm;
import springjbrains.course.core.model.Point;

/**
 * Created by NM.Rabotaev on 13.07.2017.
 */
public class ObjectPointSeparatedTriangle implements DrawableForm {

    private final static Logger logger = LoggerFactory.getLogger(ObjectPointSeparatedTriangle.class);

    private Point pointA;
    private Point pointB;
    private Point pointC;

    //ACCESSORS
    public Point getPointA() {
        return pointA;
    }
    @Required
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }
    public Point getPointB() {
        return pointB;
    }
//    @Required
    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }
    public Point getPointC() {
        return pointC;
    }
//    @Required
    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public  void draw() {
        logger.info("Object triangle drawn: " + toString());
    }

    @Override
    public String toString() {
        return "ObjectPointSeparatedTriangle{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                '}';
    }
}
