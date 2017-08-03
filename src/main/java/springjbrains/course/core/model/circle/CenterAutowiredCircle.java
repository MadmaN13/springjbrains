package springjbrains.course.core.model.circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;
import springjbrains.course.core.model.DrawableShape;
import springjbrains.course.core.model.Point;

/**
 * Created by NM.Rabotaev on 31.07.2017.
 */
public class CenterAutowiredCircle extends AbstractCircle implements DrawableShape {

    public CenterAutowiredCircle(MessageSource messageSource) {
        super(messageSource);
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
