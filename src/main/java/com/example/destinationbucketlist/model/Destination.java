package com.example.destinationbucketlist.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;


@Data
@AllArgsConstructor
public class Destination {


    private Integer id;
    private String title;
    private String description;
    private Date arrivalDate;
    private Date leaveDate;
    private String image;
    private Boolean isPublic;

}
