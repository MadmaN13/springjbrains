package springjbrains.course.context;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by NM.Rabotaev on 19.07.2017.
 */
public class AbstractClassPathXmlApplicationContextTest {
    private final static String contextFileName= "context.xml";
    private static AbstractApplicationContext context;

    @BeforeClass
    public static void setUp() {
        context = new ClassPathXmlApplicationContext(contextFileName);
    }

    @AfterClass
    public static void tearDown() {
        if (context!=null) context.close();
    }

    //ACCESSORS
    protected AbstractApplicationContext getContext() {
        return context;
    }
}
