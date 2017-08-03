package springjbrains.course.core.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by NM.Rabotaev on 21.07.2017.
 */
public class LifecycleXmlTagConfigBeanExample {

    private final static Logger logger = LoggerFactory.getLogger(LifecycleXmlTagConfigBeanExample.class);

    public void init() {
        logger.info("init() invoked for instance of " +
                getClass().getName());
    }
    public void cleanUp() {
        logger.info("cleanUp() invoked for instance of " +
                getClass().getName());
    }

}
