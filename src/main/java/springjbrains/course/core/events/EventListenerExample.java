package springjbrains.course.core.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by NM.Rabotaev on 02.08.2017.
 */
@Component
public class EventListenerExample implements ApplicationListener{

    private final static Logger logger = LoggerFactory.getLogger(EventListenerExample.class);

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        logger.info(event.toString());
    }
}
