package com.bank.app.service;

import com.bank.app.domain.Transaction;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransactionService {

    public List<Transaction> findAllByAccountNumber(Long accountNumber){

        return List.of(
                Transaction
                        .builder()
                        .type("Credit")
                        .date(LocalDateTime.now())
                        .accountNumber(accountNumber)
                        .currency("EG")
                        .amount(BigDecimal.valueOf(100.00))
                        .merchantName("Kiwe")
                        .merchantLogo("images/kiwe-logo.png")
                        .build()
        );
    }
}
