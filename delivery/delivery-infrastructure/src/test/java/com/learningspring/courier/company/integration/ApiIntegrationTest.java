package com.learningspring.courier.company.integration;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ApiIntegrationTest {
    private static final String CUSTOMERS_PATH = "/api/customers";

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void whenReadAll_thenStatusIsNotImplemented() throws Exception {
        this.mockMvc.perform(get(CUSTOMERS_PATH)).andExpect(status().isNotImplemented());
    }

    @Test
    public void whenReadOne_thenStatusIsNotImplemented() throws Exception {
        this.mockMvc.perform(get(CUSTOMERS_PATH + "/1")).andExpect(status().isNotImplemented());
    }
}
