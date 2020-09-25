import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyAspect {
    
    @Around("execution (@MyAnnotation * *.*(..))")
    public Object timedMethod(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("This is the aspect talking before executing the method:)");
        Object result = pjp.proceed();
        System.out.println("This is the aspect talking after executing the method:)");
        return result;
    }
}
