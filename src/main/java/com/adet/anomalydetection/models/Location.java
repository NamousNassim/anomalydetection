package com.adet.anomalydetection.models;

import java.time.LocalDateTime;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "location")
public class Location {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private double latitude;

    private double longitude;

    private LocalDateTime timestamp;

    // private Route route;
    
    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;
    
    private double speed;
    
}
