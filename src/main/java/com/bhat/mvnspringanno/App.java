package com.bhat.mvnspringanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory = new AnnotationConfigApplicationContext(Annoconfig.class);
        Samsung sg = factory.getBean(Samsung.class);
        sg.config();
    }
}
