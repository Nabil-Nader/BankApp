package com.bank.app.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class TransactionControllerIntegrationTest {


    //this will allow me to call URL , that will call the action of controller
    @Autowired
    private MockMvc mockMvc ;


    @Test
    public void  getTransactionByAccountTest() throws Exception {
        mockMvc.perform(
                get("transactions/{accountNumber}",1))
                .andExpect(status().isOk());


    }
}
