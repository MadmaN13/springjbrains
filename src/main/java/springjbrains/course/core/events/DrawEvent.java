package springjbrains.course.core.events;

import org.springframework.context.ApplicationEvent;

/**
 * Created by NM.Rabotaev on 02.08.2017.
 */
public class DrawEvent extends ApplicationEvent{

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public DrawEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "Draw event occurred!";
    }
}
