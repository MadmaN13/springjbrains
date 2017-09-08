package springjbrains.course.context;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by NM.Rabotaev on 19.07.2017.
 */
public class AbstractClassPathXmlApplicationContextTest {
    private static String contextFileName;
    private static AbstractApplicationContext context;
    private final static Logger logger = LoggerFactory.getLogger(AbstractClassPathXmlApplicationContextTest.class);

    public AbstractClassPathXmlApplicationContextTest(final String contextFileName) {
        this.contextFileName = contextFileName;
        setUp();
    }

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

    protected Logger getLogger() {
        return logger;
    }
}
