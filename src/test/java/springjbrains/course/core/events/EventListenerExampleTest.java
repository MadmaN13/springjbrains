package springjbrains.course.core.events;

import org.junit.Test;
import springjbrains.course.context.AbstractClassPathXmlApplicationContextTest;
import springjbrains.course.core.model.circle.DrawEventPublishingCircle;

import static org.junit.Assert.*;

/**
 * Created by NM.Rabotaev on 02.08.2017.
 */
public class EventListenerExampleTest extends AbstractClassPathXmlApplicationContextTest {
    private final static String drawEventPublishingCircleName = "drawEventPublishingCircle";

    @Test
    public void onApplicationEventTest() throws Exception {
        getContext().getBean(drawEventPublishingCircleName, DrawEventPublishingCircle.class).draw();
    }

}