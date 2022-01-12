package com.te.springbean;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
        Pet pet = container.getBean(Pet.class);
        pet.doThings();
    }
}
