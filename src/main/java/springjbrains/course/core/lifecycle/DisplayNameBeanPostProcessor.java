package springjbrains.course.core.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by NM.Rabotaev on 21.07.2017.
 */
public class DisplayNameBeanPostProcessor implements BeanPostProcessor {
    private final static Logger logger = LoggerFactory.getLogger(DisplayNameBeanPostProcessor.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        logger.info("In postProcessBeforeInitialization() bean name: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        logger.info("In postProcessAfterInitialization() bean name: " + beanName);
        return bean;
    }
}
