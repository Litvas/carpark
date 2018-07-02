package com.litvas.carpark.service;


import com.litvas.carpark.domain.Bus;
import com.litvas.carpark.repository.BusRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@WebMvcTest(value = BusService.class)
public class BusServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BusRepository busRepository;

    @MockBean
    private BusService busService;

    private Bus bus;
    private List<Bus> list = new ArrayList<>();


    @Test
    public void getAllBusesTest() throws Exception {
        bus = new Bus();
        bus.setModel("405");
        bus.setManufacturer("scania");
        bus.setNumber("aa505sd");
        bus.setQuantityOfSeats(150);

        list.add(bus);

        Mockito.when(busService.getAllBuses()).thenReturn(list);

        System.out.println(list.size());

    }

}