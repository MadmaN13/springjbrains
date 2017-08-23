package springjbrains.course.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by NM.Rabotaev on 03.08.2017.
 */
@Aspect
public class AdvancedPointcutsAspectExample {

    @Pointcut ("execution(* * springjbrains.course.core.model.circle.SimpleCircle.* (..))")
    public void anyMethodOfSimpleCircle() {}

    // same as previous
    @Pointcut("within(springjbrains.course.core.model.circle.SimpleCircle)")
    public void anyMethodWithinSimpleCircle() {}

    @Pointcut("within(springjbrains.course.core.model.circle.*)")
    public void anyMethodOfAnyClassInCirclePackage() {}

    @Pointcut("within(springjbrains.course.core.model..)")
    public void anyMethodOfAnyClassInModelPackageAndSubpackages() {}

    @Before("anyMethodOfAnyClassInCirclePackage() && anyMethodOfSimpleCircle()")
    public void combinedAdvice() {}

}
