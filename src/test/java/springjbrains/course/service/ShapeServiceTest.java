package springjbrains.course.service;

import org.junit.Test;
import springjbrains.course.TestConstants;
import springjbrains.course.context.AbstractClassPathXmlApplicationContextTest;
import springjbrains.course.core.model.Point;
import springjbrains.course.core.model.circle.SimpleCircle;
import springjbrains.course.service.impl.ShapeServiceImpl;

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
        getContext().getBean(shapeServiceName, ShapeServiceImpl.class).getShapes().get(0).draw();
        getContext().getBean(shapeServiceName, ShapeServiceImpl.class).getShapes().get(1).draw();
        getContext().getBean(shapeServiceName, ShapeServiceImpl.class).getShapes().get(2).draw();
    }

    @Test
    public void testSetCenter() {
        SimpleCircle simpleCircle= (SimpleCircle) getContext().getBean(shapeServiceName, ShapeServiceImpl.class).getShapes().get(0);
        Point center = new Point(); center.setX(99); center.setY(99);
        simpleCircle.setCenter(center);
    }

    public static void main(String [] args) throws Exception {
        ShapeServiceTest test = new ShapeServiceTest(TestConstants.AOP_CONTEXT);
//        test.getShapesTest();
        test.testSetCenter();
    }

}