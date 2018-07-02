package com.litvas.carpark.service;

import com.litvas.carpark.domain.Bus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BusService {

    public List<Bus> getAllBuses();

}
