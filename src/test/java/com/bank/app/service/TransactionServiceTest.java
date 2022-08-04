package com.bank.app.service;

import com.bank.app.domain.Transaction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.List;

@SpringBootTest
class TransactionServiceTest {


    @Autowired
    private  TransactionService transactionService;


    @Test
    void findAllByAccountNumber() {
        List<Transaction> allTransaction = transactionService.findAllByAccountNumber(1L);

        assertEquals(1,allTransaction.size());

    }
}