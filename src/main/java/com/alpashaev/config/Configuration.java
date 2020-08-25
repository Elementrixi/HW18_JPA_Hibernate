package com.alpashaev.config;

import com.alpashaev.model.Auto;
import com.alpashaev.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@org.springframework.context.annotation.Configuration
@ComponentScan("com.alpashaev")
public class Configuration {
    @Bean
    public User user(){
        return new User("Katia");
    }
    @Bean
    public Auto auto(User user){
        return new Auto(user(), "Tesla");
    }
}
