package springjbrains.course.core.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created by NM.Rabotaev on 24.07.2017.
 */
public class BeanFactoryPostProcessorExample implements BeanFactoryPostProcessor {

    private final static Logger logger = LoggerFactory.getLogger(BeanFactoryPostProcessorExample.class);

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        logger.info(new StringBuilder("postProcessBeanFactory() invoked in class: ").append(getClass().getName()).toString());
    }
}
