package com.adet.anomalydetection.models;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
public class Alert {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String alertType;
    
    private String description;
    
    private LocalDateTime timeStamp;
    
    private Long vehicleId;
    
    private String severity;
    
    @ManyToOne
    @JoinColumn(name = "anomaly_detection_id")
    private AnomalyDetection anomalyDetection;
    
    // Default constructor
    public Alert() {
    }
    
    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public AnomalyDetection getAnomalyDetection() {
        return anomalyDetection;
    }

    public void setAnomalyDetection(AnomalyDetection anomalyDetection) {
        this.anomalyDetection = anomalyDetection;
    }
}