package com.bank.app.contoller;


import com.bank.app.domain.Transaction;
import com.bank.app.service.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/transactions")
@AllArgsConstructor
public class TransactionController {

    private final TransactionService transactionService ;

    @GetMapping("/{accountNumber}")
    public List<Transaction> findTransactionByAccountNumber(@PathVariable Long accountNumber ){

        return transactionService.findAllByAccountNumber(accountNumber);

    }


}
