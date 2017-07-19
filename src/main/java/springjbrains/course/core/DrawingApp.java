package springjbrains.course.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanIsAbstractException;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import springjbrains.course.core.model.DrawableForm;

/**
 * Created by NM.Rabotaev on 12.07.2017.
 */
public class DrawingApp {

    public static final String contextFileName = "src/main/resources/context.xml";
    public static final String classpathContextFileName = "context.xml";
    public static final String equilateralTriangleName = "equilateralTriangle";
    private static final String rightTriangleName = "rightTriangle";
    private static final String rightArgumentTypedTriangleName = "rightArgumentTypedTriangle";
    private static final String rightOrderedArgumentTriangleName = "rightOrderedArgumentTriangle";
    private static final String objectTriangleName = "objectTriangle";
    private static final String objectPointListedTriangleName = "objectPointListedTriangle";
    private static final String autowiredObjectTriangleName = "autowiredObjectTriangle";
    private static final String parentObjectPointSeparatedTriangleName = "parentObjectPointSeparatedTriangle";
    private static final String childObjectPointSeparatedTriangleName = "childObjectPointSeparatedTriangle";
    private static final String childObjectPointListedTriangleName = "childObjectPointListedTriangle";

    public static void main(String [] args) {
//        drawFormWithBeanFactory();
        drawFormWithClassPathApplicationContext(equilateralTriangleName);
        drawFormWithClassPathApplicationContext(rightTriangleName);
        drawFormWithClassPathApplicationContext(rightArgumentTypedTriangleName);
        drawFormWithClassPathApplicationContext(rightOrderedArgumentTriangleName);

        drawFormWithClassPathApplicationContext(objectTriangleName);
        drawFormWithClassPathApplicationContext(objectPointListedTriangleName);
        drawFormWithClassPathApplicationContext(autowiredObjectTriangleName);

        try{
            drawFormWithClassPathApplicationContext(parentObjectPointSeparatedTriangleName);
        }
        catch (BeanIsAbstractException e) {
            e.printStackTrace();
        }

        drawFormWithClassPathApplicationContext(childObjectPointSeparatedTriangleName);
        drawFormWithClassPathApplicationContext(childObjectPointListedTriangleName);
    }

    private static void drawFormWithClassPathApplicationContext(String formName) {
        ApplicationContext context = new ClassPathXmlApplicationContext(classpathContextFileName);
        context.getBean(formName, DrawableForm.class).draw();
    }

    @Deprecated
    private static void drawFormWithBeanFactory(String formName) {
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource((contextFileName)));
        DrawableForm form = (DrawableForm) factory.getBean(formName);
        form.draw();
    }

}
