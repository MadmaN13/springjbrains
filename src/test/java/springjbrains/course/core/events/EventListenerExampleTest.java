package springjbrains.course.core.events;

import org.junit.BeforeClass;
import org.junit.Test;
import springjbrains.course.TestConstants;
import springjbrains.course.context.AbstractClassPathXmlApplicationContextTest;
import springjbrains.course.core.model.circle.DrawEventPublishingCircle;

/**
 * Created by NM.Rabotaev on 02.08.2017.
 */
public class EventListenerExampleTest extends AbstractClassPathXmlApplicationContextTest {
    private final String drawEventPublishingCircleName = "drawEventPublishingCircle";

    public EventListenerExampleTest(String contextFileName) {
        super(contextFileName);
    }

    @Test
    public void onApplicationEventTest() throws Exception {
        getContext().getBean(drawEventPublishingCircleName, DrawEventPublishingCircle.class).draw();
    }

    public static void main(String [] args) throws Exception {
        EventListenerExampleTest test = new EventListenerExampleTest(TestConstants.CORE_CONTEXT);
        test.onApplicationEventTest();
    }

}