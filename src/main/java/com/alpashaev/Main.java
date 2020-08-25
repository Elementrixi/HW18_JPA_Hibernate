package com.alpashaev;

import com.alpashaev.config.Configuration;
import com.alpashaev.executor.Executor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Configuration.class);
        Executor exec = annotationConfigApplicationContext.getBean(Executor.class);
        exec.startApp();
        annotationConfigApplicationContext.close();
    }
}
