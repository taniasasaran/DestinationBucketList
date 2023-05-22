package com.example.destinationbucketlist.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Data
@AllArgsConstructor
public class User {
    private String userName;
    private String eMail;
    private String password;
    private UserType userType;

    private List<Destination> privateList;
}
