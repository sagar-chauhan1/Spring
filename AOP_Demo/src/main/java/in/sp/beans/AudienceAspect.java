package in.sp.beans;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AudienceAspect {
    
    @AfterReturning("execution(public void perform())")
    public void applaud() {
        System.out.println("Clap Clap");
    }
}