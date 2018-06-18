package com.litvas.carpark.domain;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Driver extends ParkWorker {

    @OneToOne
    private Route routeForToday;

    @OneToOne
    private Bus bus;

    private boolean availability;

    public Route getRouteForToday() {
        return routeForToday;
    }

    public void setRouteForToday(Route routeForToday) {
        this.routeForToday = routeForToday;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }
}