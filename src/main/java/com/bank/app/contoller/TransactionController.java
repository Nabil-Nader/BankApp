package com.bank.app.contoller;


import com.bank.app.domain.Transaction;
import com.bank.app.service.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/transactions")

@AllArgsConstructor
public class TransactionController {

    private final TransactionService transactionService ;

    @PostMapping("/{accountNumber}")
    public List<Transaction> findTransactionByAccountNumber(@PathVariable Long accountNumber ){

        return transactionService.findAllByAccountNumber(accountNumber);

    }


}
