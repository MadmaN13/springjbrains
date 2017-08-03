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
        getLogger().info(getMessage(MessageIds.DRAWING_CONCRETE_CIRCLE, new Object[]{getClass().getName()}) +
                super.toString());
    }

    @Resource
    public void setCenter(Point center) {
        this.center = center;
    }

    @PostConstruct
    public void init() {
        getLogger().info(getMessage(MessageIds.LIFECYCLE_POSTCONSTRUCT) +
                getClass().getName());
    }

    @PreDestroy
    public void destroy() {
        getLogger().info(getMessage(MessageIds.LIFECYCLE_PREDESTROY) + getClass().getName());
    }
}
