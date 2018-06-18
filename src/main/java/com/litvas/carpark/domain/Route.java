package com.litvas.carpark.domain;

import javax.persistence.*;
import java.util.Date;

@Table
@Entity
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pointOfStart;

    private String pointOfFinish;

    private Date timeOfStart;

    private Date timeOfFinish;

    // todo halts on then route


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPointOfStart() {
        return pointOfStart;
    }

    public void setPointOfStart(String pointOfStart) {
        this.pointOfStart = pointOfStart;
    }

    public String getPointOfFinish() {
        return pointOfFinish;
    }

    public void setPointOfFinish(String pointOfFinish) {
        this.pointOfFinish = pointOfFinish;
    }

    public Date getTimeOfStart() {
        return timeOfStart;
    }

    public void setTimeOfStart(Date timeOfStart) {
        this.timeOfStart = timeOfStart;
    }

    public Date getTimeOfFinish() {
        return timeOfFinish;
    }

    public void setTimeOfFinish(Date timeOfFinish) {
        this.timeOfFinish = timeOfFinish;
    }
}