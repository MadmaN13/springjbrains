package springjbrains.course.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by NM.Rabotaev on 03.08.2017.
 */
@Aspect
public class LoggingAspect {

    private final static Logger logger = LoggerFactory.getLogger(LoggingAspect.class);


    @Pointcut("execution(void draw())")
    public void allZeroArgsVoidDraw(){}

    @Before("allZeroArgsVoidDraw()")
    public void FirstLoggingAdviceDrawMethodOfAnyClass() {
        logger.info("First logging advice is run before draw() invocation of any class!");
    }

    @Before("allZeroArgsVoidDraw()")
    public void SecondLoggingAdviceDrawMethodOfAnyClass() {
        logger.info("Second logging advice is run before draw() invocation of any class!");
    }

    @Before("execution(public void springjbrains.course.core.model.circle.SimpleCircle.draw())")
    public void LoggingAdviceDrawMethodOfSimpleCircleClass() {
        logger.info("Logging advice is run before draw() invocation of SimpleCircle class!");
    }

    @Before("execution(public void springjbrains.course.model.*.draw())")
    public void LoggingAdviceDrawMethodOfModelPackageClass() {
        logger.info("Logging advice is run before draw() invocation of springjbrains.course.model package class!");
    }

    @Before("execution(public * draw*())")
    public void LoggingAdviceDrawAnythingZeroArgs() {
        logger.info("Logging advice is run before any draw*() invocation!");
    }

    // .. - >=0 args
    // * - >=1 args
    @Before("execution(public * draw*(..))")
    public void LoggingAdviceDrawAnythingWithAnyNumberOfArgs() {
        logger.info("Logging advice is run before any draw*(..) invocation!");
    }
}
