package springjbrains.course.core.model.circle;

import springjbrains.course.core.model.Point;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by NM.Rabotaev on 01.08.2017.
 */
public class JsrAnnotationsCircle extends AbstractCircle {

    public JsrAnnotationsCircle(int diameter) {
        this.diameter = diameter;
    }

    @Resource
    public void setCenter(Point center) {
        this.center = center;
    }

    @PostConstruct
    public void init() {
        getLogger().info(new StringBuilder("@PostConstruct invoked for: ").append(getClass().getName()).toString());
    }

    @PreDestroy
    public void destroy() {
        getLogger().info(new StringBuilder("@PreDestroy invoked for: ").append(getClass().getName()).toString());
    }
}
