package springjbrains.course.core.model.circle;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import springjbrains.course.core.events.DrawEvent;

/**
 * Created by NM.Rabotaev on 02.08.2017.
 */
public class DrawEventPublishingCircle implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void draw() {
        publisher.publishEvent(new DrawEvent(this));
    }
}
