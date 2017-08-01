package springjbrains.course.core.model.circle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import springjbrains.course.core.model.DrawableForm;
import springjbrains.course.core.model.Point;

/**
 * Created by NM.Rabotaev on 31.07.2017.
 */
public class CenterAutowiredCircle extends AbstractCircle implements DrawableForm {

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
