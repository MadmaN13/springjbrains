package springjbrains.course.core.lifecycle;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import springjbrains.course.context.AbstractClassPathXmlApplicationContextTest;
import springjbrains.course.core.model.circle.CenterAutowiredCircle;

/**
 * Created by NM.Rabotaev on 21.07.2017.
 */
public class LifecycleTest extends AbstractClassPathXmlApplicationContextTest {

    private final static Logger logger = LoggerFactory.getLogger(LifecycleTest.class);
    private final static String circleBeanName = "circle";

    public LifecycleTest(String contextFileName) {
        super(contextFileName);
    }

    @Test
    public void testLifecycleTips() {
        logger.info("Started testing lifecycle beans...");
        getContext().getBean(circleBeanName, CenterAutowiredCircle.class).draw();
    }
}
