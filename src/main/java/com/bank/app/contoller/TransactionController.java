package com.bank.app.contoller;


import com.bank.app.domain.Transaction;
import com.bank.app.service.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/transactions")

@AllArgsConstructor
public class TransactionController {

    private final TransactionService transactionService ;

    @PostMapping("/{accountNumber}")
    public ResponseEntity<Transaction> findTransactionByAccountNumber(@PathVariable String accountNumber ){

        return new ResponseEntity<>(new Transaction(), HttpStatus.OK);

    }


}
