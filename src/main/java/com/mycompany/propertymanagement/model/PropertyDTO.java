package com.mycompany.propertymanagement.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PropertyDTO {

    private String title;
    private String desc;
    private String ownerName;
    private String ownerEmail;
    private String address;
    private double price;
}
