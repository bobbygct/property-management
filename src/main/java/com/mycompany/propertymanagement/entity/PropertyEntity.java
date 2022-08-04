package com.mycompany.propertymanagement.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity @Table(name = "PROP_ENTITY")
@Getter @Setter @NoArgsConstructor
public class PropertyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "PROP_TITLE",nullable = false)
    private String title;
    private String desc;
    private String ownerName;
    private String ownerEmail;
    private String address;
    private double price;
}
