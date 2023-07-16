package com.example.guestbook.conf;

import com.example.guestbook.domain.Guest;
import com.example.guestbook.service.GuestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:guestapp.properties")
public class ApplicationConfig {
    @Bean
    public GuestService guestService(){
        return new GuestService();
    }
    @Bean
    public Guest guest(@Value("${guest.id}") int id,
                       @Value("${guest.firstName}")String firstName,
                       @Value("${guest.lastName}")String lastName,
                       @Value("${guest.phoneNumber}")String phone){
        return Guest.builder().
        id(id).
                firstName(firstName).
                lastName(lastName).
                phoneNumber(phone).
                address(null)
                .build();
    }
}
