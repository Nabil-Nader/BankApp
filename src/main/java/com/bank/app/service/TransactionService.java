package com.bank.app.service;

import com.bank.app.domain.Transaction;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    public List<Transaction> findAllByAccountNumber(){
        Transaction t1 = new Transaction("Type1",
                LocalDateTime.now(),
                BigDecimal.valueOf(20),
                "12345",
                BigDecimal.valueOf(2),
                "m1",
                "log1");


        Transaction t2 = new Transaction("Type2",
                LocalDateTime.now(),
                BigDecimal.valueOf(30),
                "12345678",
                BigDecimal.valueOf(2),
                "m2",
                "log2");

        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(t1);
        transactionList.add(t2);


        return  transactionList ;
    }
}
