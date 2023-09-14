package com.addressapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Address {
    @Id
    @Column(name = "")
    private int id;
    private String lane1;
    private String lane2;
    private String state;

}
