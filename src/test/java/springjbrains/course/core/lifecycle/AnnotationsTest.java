package springjbrains.course.core.lifecycle;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import springjbrains.course.context.AbstractClassPathXmlApplicationContextTest;
import springjbrains.course.core.model.circle.CenterAutowiredCircle;
import springjbrains.course.core.model.circle.JsrAnnotationsCircle;

/**
 * Created by NM.Rabotaev on 21.07.2017.
 */
public class AnnotationsTest extends AbstractClassPathXmlApplicationContextTest {

    private final static Logger logger = LoggerFactory.getLogger(AnnotationsTest.class);
    private final static String centerAutoWiredCircleBeanName = "centerAutoWiredCircle";
    private final static String jsrAnnotationsCircleBeanName= "jsrAnnotationsCircle";

    @Test
    public void testRequiredAndAutowireByNameAnnotations() {
        getContext().getBean(centerAutoWiredCircleBeanName, CenterAutowiredCircle.class).draw();
    }

    @Test
    public void testQualifierAnnotation() {
        getContext().getBean(centerAutoWiredCircleBeanName, CenterAutowiredCircle.class).draw();
    }

    @Test
    public void testJsrAnnotations () {
        getContext().getBean(jsrAnnotationsCircleBeanName, JsrAnnotationsCircle.class).draw();
    }

}
