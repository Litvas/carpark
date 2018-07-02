package com.litvas.carpark.service.impl;


import com.litvas.carpark.domain.Bus;
import com.litvas.carpark.repository.BusRepository;
import com.litvas.carpark.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static java.util.stream.StreamSupport.stream;

@Service
public class BusServiceImpl implements BusService {

    @Autowired
    private BusRepository busRepository;

    public List<Bus> getAllBuses(){
        return stream(busRepository.findAll().spliterator(), false).collect(toList());
    }
}
