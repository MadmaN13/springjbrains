package springjbrains.course.core.model.circle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;
import springjbrains.course.core.model.DrawableShape;
import springjbrains.course.core.model.Point;

/**
 * Created by NM.Rabotaev on 03.08.2017.
 */
public class SimpleCircle implements DrawableShape {

    private final static Logger logger = LoggerFactory.getLogger(SimpleCircle.class);

    private Point center;
    private int diameter;

    @Override
    public void draw() {
        logger.info("Draw simple circle: " + toString());
    }
    @Override
    public String toString() {
        return "SimpleCircle{" +
                "center=" + center +
                ", diameter=" + diameter +
                '}';
    }
    //ACCESSORS
    public Point getCenter() {
        return center;
    }
    @Required
    public void setCenter(Point center) {
        this.center = center;
    }
    public int getDiameter() {
        return diameter;
    }

    @Required
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
