package springjbrains.course.core.model.circle;

import org.springframework.context.MessageSource;
import springjbrains.course.core.MessageIds;
import springjbrains.course.core.model.Point;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by NM.Rabotaev on 01.08.2017.
 */
public class JsrAnnotationsCircle extends AbstractCircle {

    public JsrAnnotationsCircle(int diameter, MessageSource messageSource) {
        super(messageSource);
        this.diameter = diameter;
    }

    @Override
    public void draw() {
        getLogger().info(new StringBuilder(getMessage(MessageIds.DRAWING_CONCRETE_CIRCLE,new Object[]{getClass().getName()}))
                .append(super.toString())
                .toString());
    }

    @Resource
    public void setCenter(Point center) {
        this.center = center;
    }

    @PostConstruct
    public void init() {
        getLogger().info(new StringBuilder(getMessage(MessageIds.LIFECYCLE_POSTCONSTRUCT))
                .append(getClass().getName())
                .toString());
    }

    @PreDestroy
    public void destroy() {
        getLogger().info(new StringBuilder(getMessage(MessageIds.LIFECYCLE_PREDESTROY)).append(getClass().getName()).toString());
    }
}
