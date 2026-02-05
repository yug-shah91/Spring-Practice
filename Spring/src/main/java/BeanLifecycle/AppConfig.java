package BeanLifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean(initMethod = "start" , destroyMethod = "destroy")
    public Laptop laptop(){
        return new Laptop();
    }
}
