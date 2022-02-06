package com.urlshorter.site.audit;

import com.urlshorter.site.audit.workWithActiveMQ.ConsumerServiceActiveMQ;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActiveMqConsumerApplication {

    public static void main(String[] args) {
        ConsumerServiceActiveMQ.context = SpringApplication.run(ActiveMqConsumerApplication.class, args);
    }

}
