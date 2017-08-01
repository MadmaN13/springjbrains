package springjbrains.course.core.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by NM.Rabotaev on 31.07.2017.
 */
public class Circle implements DrawableForm {

    private final static Logger logger = LoggerFactory.getLogger(Circle.class);

    private int diameter;
    private Point center;

    @Override
    public void draw() {
        logger.info(new StringBuilder("Circle drawn: ").append(toString()).toString());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "diameter=" + diameter +
                ", center=" + center +
                '}';
    }
    //ACCESSORS
    public int getDiameter() {
        return diameter;
    }
    @Required
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
    public Point getCenter() {
        return center;
    }

    @Autowired
    @Qualifier("pointA")
    public void setCenter(Point center) {
        this.center = center;
    }
}
