package com.alpashaev.executor;

import com.alpashaev.model.Auto;
import org.springframework.stereotype.Component;

@Component
public class Executor {
    private Auto auto;

    public Executor(Auto auto) {
        this.auto = auto;
    }
    public void startApp(){
        System.out.println(auto.getUserName());
        System.out.println(auto.getModel());
    }
}
