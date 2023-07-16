package com.example.guestbook.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Guest {
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    private Address address;


}
