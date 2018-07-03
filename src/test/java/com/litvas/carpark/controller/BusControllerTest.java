package com.litvas.carpark.controller;

import com.litvas.carpark.domain.Bus;
import com.litvas.carpark.service.BusService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = BusController.class)
public class BusControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BusController busController;

    @MockBean
    private BusService busService;

    private Bus bus;
    private List<Bus> list = new ArrayList<>();

    @Before
    public void initTestData() {
        bus = new Bus();
        bus.setModel("405");
        bus.setManufacturer("scania");
        bus.setNumber("aa505sd");
        bus.setQuantityOfSeats(150);

        list.add(0, bus);
    }


    @Test
    public void getAllBusesTest() throws Exception {

        Mockito.when(busService.getAllBuses()).thenReturn(list);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/carpark/bus"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.jsonPath("[0].manufacturer").value("scania"))
                .andExpect(MockMvcResultMatchers.jsonPath("[0].model").value("405"))
                .andExpect(MockMvcResultMatchers.jsonPath("[0].number").value("aa505sd"))
                .andExpect(MockMvcResultMatchers.jsonPath("[0].quantityOfSeats").value(150));
    }
}
