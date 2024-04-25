package tn.esprit.emnamahfoudhi4infini2.Aspects;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j

public class LoggingAspect {
    //@Before("execution(* tn.esprit.emnamahfoudhi4infini2.services.*.*(..))")
   // public void methodEntry(JoinPoint joinPoint)
    /*{
        log.info(("In Method : "+ joinPoint.getSignature().getName()));
    }*/
}
