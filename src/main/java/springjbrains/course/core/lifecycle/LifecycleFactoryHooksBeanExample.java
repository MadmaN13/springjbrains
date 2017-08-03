package springjbrains.course.core.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by NM.Rabotaev on 19.07.2017.
 */
public class LifecycleFactoryHooksBeanExample implements InitializingBean, DisposableBean {

    private final static Logger logger = LoggerFactory.getLogger(LifecycleFactoryHooksBeanExample.class);

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("afterPropertiesSet() invoked for instance of " +
                getClass().getName());
    }

    @Override
    public void destroy() throws Exception {
        logger.info("destroy() invoked for instance of " +
                getClass().getName());
    }
}
