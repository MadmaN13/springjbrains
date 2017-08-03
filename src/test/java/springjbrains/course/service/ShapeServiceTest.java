package springjbrains.course.service;

import org.junit.Test;
import springjbrains.course.context.AbstractClassPathXmlApplicationContextTest;

import static org.junit.Assert.*;

/**
 * Created by NM.Rabotaev on 02.08.2017.
 */
public class ShapeServiceTest extends AbstractClassPathXmlApplicationContextTest {

    private final static String shapeServiceName = "shapeService";

    @Test
    public void getShapesTest() throws Exception {
        getContext().getBean(shapeServiceName, ShapeService.class).getShapes().get(1).draw();
    }

}