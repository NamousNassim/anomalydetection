package com.adet.anomalydetection.models;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String f_name;

    private String l_name; 

    private String  lisenceNumber;

    private String  driverStatus;
 
    
    @OneToOne(mappedBy = "driver")
    private Car car;
}
