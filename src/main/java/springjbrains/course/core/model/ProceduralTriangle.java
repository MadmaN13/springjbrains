package springjbrains.course.core.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by NM.Rabotaev on 12.07.2017.
 */
public class ProceduralTriangle implements DrawableForm {

    private final static Logger logger = LoggerFactory.getLogger(ProceduralTriangle.class);

    private String type;
    private int height;

    public ProceduralTriangle() {
        super();
    }
    public ProceduralTriangle(String type) {
        this.type = type;
    }

    public ProceduralTriangle(String type, int height) {
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
