package springjbrains.course.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by NM.Rabotaev on 03.08.2017.
 */
@Aspect
public class LoggingAspect {

    private final static Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(void draw())")
    public void LoggingAdvice() {
        logger.info("Logging advice is run before draw() invocation!");
    }
}
