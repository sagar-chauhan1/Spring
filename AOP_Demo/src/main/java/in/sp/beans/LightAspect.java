package in.sp.beans;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LightAspect {
    
    @Before("execution(public void perform())")
    public void turnOnLights() {
        System.out.println("--------- Lights on ----------");
    }
    
    @After("execution(public void perform())")
    public void turnOffLights() {
        System.out.println("---------- Lights Off -----------");
    }
}

