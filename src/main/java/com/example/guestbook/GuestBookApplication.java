package com.example.guestbook;

import com.example.guestbook.conf.ApplicationConfig;
import com.example.guestbook.domain.Guest;
import com.example.guestbook.service.GuestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class GuestBookApplication {

    public static void main(String[] args) {
     //   SpringApplication.run(GuestBookApplication.class, args);
        ApplicationContext context=
                new AnnotationConfigApplicationContext("com.example.guestbook.conf");
        GuestService guestService = context.getBean("guestService", GuestService.class);
        guestService.createGuest(context.getBean("guest", Guest.class));

    }

}
