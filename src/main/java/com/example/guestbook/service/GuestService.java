package com.example.guestbook.service;

import com.example.guestbook.domain.Guest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GuestService {
    //CRUD - create, remove, update, del
  //  private JdbcTemplate template;
    //two type of dependency injection -
    //setter injection or constructor


  public Guest createGuest(Guest guest){
      System.out.println(" "+ guest);
      return null;
  }
    public Guest updateGuest(Guest guest){
        return null;
    }
    public Guest delGuest(int id){
        return null;
    }
    public Guest getGuest(int id){
        return null;
    }
    public List<Guest> getGuest(){
        return null;
    }

}
