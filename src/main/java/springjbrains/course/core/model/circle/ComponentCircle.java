package springjbrains.course.core.model.circle;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import springjbrains.course.core.model.Point;

/**
 * Created by NM.Rabotaev on 01.08.2017.
 */
@Component
public class ComponentCircle extends AbstractCircle {

    public ComponentCircle(Point center, MessageSource messageSource) {
        super(messageSource);
        this.center = center;
    }
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
