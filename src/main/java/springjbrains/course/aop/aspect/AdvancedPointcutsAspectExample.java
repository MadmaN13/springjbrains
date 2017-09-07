package springjbrains.course.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import springjbrains.course.core.model.DrawableShape;

/**
 * Created by NM.Rabotaev on 03.08.2017.
 */
@Aspect
public class AdvancedPointcutsAspectExample {

    private final static Logger logger = LoggerFactory.getLogger(AdvancedPointcutsAspectExample.class);

//    @Pointcut ("execution(* *springjbrains.course.core.model.circle.SimpleCircle.* (..))")
//    public void anyMethodOfSimpleCircle() {}
//
//    // same as previous
//    @Pointcut("within(springjbrains.course.core.model.circle.SimpleCircle)")
//    public void anyMethodWithinSimpleCircle() {}
//
//    @Pointcut("within(springjbrains.course.core.model.circle.*)")
//    public void anyMethodOfAnyClassInCirclePackage() {}

//    @Pointcut("within(springjbrains.course.core.model..)")
//    public void anyMethodOfAnyClassInModelPackageAndSubpackages() {}

//    @Before("anyMethodOfAnyClassInCirclePackage() && anyMethodOfSimpleCircle()")
//    public void combinedAdvice() {}

    @Before("execution(* draw())")
    public void anyMethodWithinDrawableShapeWithJoinPoint(JoinPoint joinPoint) {
        logger.info("Join point: " + joinPoint);
        DrawableShape shape = (DrawableShape) joinPoint.getTarget();
        logger.info("Target object: " + joinPoint.getTarget());
    }

    @Before("args(center)")
    public void centerArgsMethods(Object center) {
        logger.info("A method with center args has been called. Center is: " + center);
    }

}
