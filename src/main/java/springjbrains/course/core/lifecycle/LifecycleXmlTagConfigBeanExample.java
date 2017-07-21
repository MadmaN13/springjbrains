package springjbrains.course.core.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by NM.Rabotaev on 21.07.2017.
 */
public class LifecycleXmlTagConfigBeanExample {

    private final static Logger logger = LoggerFactory.getLogger(LifecycleXmlTagConfigBeanExample.class);

    public void init() {
        logger.info(new StringBuilder("init() invoked for instance of ")
                .append(getClass().getName()).toString());
    }
    public void cleanUp() {
        logger.info(new StringBuilder("cleanUp() invoked for instance of ")
                .append(getClass().getName()).toString());
    }

}
