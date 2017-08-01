package springjbrains.course.core.model.circle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import springjbrains.course.core.model.DrawableForm;
import springjbrains.course.core.model.Point;

/**
 * Created by NM.Rabotaev on 01.08.2017.
 */
public abstract class AbstractCircle implements DrawableForm {

    private final static Logger logger = LoggerFactory.getLogger(CenterAutowiredCircle.class);
    protected int diameter;
    protected Point center;

    @Override
    public void draw() {
        getLogger().info(new StringBuilder("Circle drawn: ").append(toString()).toString());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "diameter=" + diameter +
                ", center=" + center +
                '}';
    }

    //ACCESSORS
    public static Logger getLogger() {
        return logger;
    }
}
