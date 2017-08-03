package springjbrains.course.core.model.triangle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import springjbrains.course.core.model.DrawableShape;

/**
 * Created by NM.Rabotaev on 12.07.2017.
 */
public class ProceduralTriangle implements DrawableShape {

    private final static Logger logger = LoggerFactory.getLogger(ProceduralTriangle.class);

    private String type;
    private int height;

    private ProceduralTriangle() {
        super();
    }
    private ProceduralTriangle(String type) {
        this.type = type;
    }

    private ProceduralTriangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void draw() {
        logger.info("ProceduralTriangle drawn: " + toString());
    }

    @Override
    public String toString() {
        return "ProceduralTriangle{" +
                "type='" + type + '\'' +
                ", height=" + height +
                '}';
    }
}
