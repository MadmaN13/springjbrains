package springjbrains.course.core.model.triangle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import springjbrains.course.core.model.DrawableForm;
import springjbrains.course.core.model.Point;

import java.util.List;

/**
 * Created by NM.Rabotaev on 13.07.2017.
 */
public class ObjectPointListedTriangle implements DrawableForm {

    private final static Logger logger = LoggerFactory.getLogger(ObjectPointListedTriangle.class);

    private List<Point> points;

    @Override
    public void draw() {
            logger.info("ObjectPointListedTriangle drawn: " + toString());
    }

    @Override
    public String toString() {
        return "ObjectPointListedTriangle{" +
                "points=" + points +
                '}';
    }

    //ACCESSORS
    public List<Point> getPoints() {
        return points;
    }
    public void setPoints(List<Point> points) {
        this.points = points;
    }
}
