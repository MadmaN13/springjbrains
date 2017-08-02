package springjbrains.course.core.model.circle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import springjbrains.course.core.MessageIds;
import springjbrains.course.core.message.EnglishLocaleMessageSourceSupporter;
import springjbrains.course.core.model.DrawableForm;
import springjbrains.course.core.model.Point;

/**
 * Created by NM.Rabotaev on 01.08.2017.
 */
public abstract class AbstractCircle extends EnglishLocaleMessageSourceSupporter implements DrawableForm {

    private final static Logger logger = LoggerFactory.getLogger(CenterAutowiredCircle.class);
    protected int diameter;
    protected Point center;

    public AbstractCircle(MessageSource messageSource) {
        super(messageSource);
    }

    @Override
    public void draw() {
        getLogger().info(new StringBuilder(getMessage(MessageIds.DRAWING_ABSTRACT_CIRCLE)).append(toString()).toString());
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
