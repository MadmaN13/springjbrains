package springjbrains.course.service;

import org.junit.Test;
import springjbrains.course.TestConstants;
import springjbrains.course.context.AbstractClassPathXmlApplicationContextTest;
import springjbrains.course.core.model.circle.SimpleCircle;

import static org.junit.Assert.*;

/**
 * Created by NM.Rabotaev on 02.08.2017.
 */
public class ShapeServiceTest extends AbstractClassPathXmlApplicationContextTest {

    private final String shapeServiceName = "shapeService";
    private final String simpleCircleAName = "simpleCircleA";

    public ShapeServiceTest(String contextFileName) {
        super(contextFileName);
    }

    @Test
    public void getShapesTest() throws Exception {
        getContext().getBean(shapeServiceName, ShapeService.class).getShapes().get(0).draw();
        getContext().getBean(shapeServiceName, ShapeService.class).getShapes().get(1).draw();
        getContext().getBean(shapeServiceName, ShapeService.class).getShapes().get(2).draw();
    }

    public static void main(String [] args) throws Exception {
        ShapeServiceTest test = new ShapeServiceTest(TestConstants.AOP_CONTEXT);
        test.getShapesTest();
    }

}