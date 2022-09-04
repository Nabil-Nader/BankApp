package com.bank.app.service;

import com.bank.app.domain.Transaction;
import com.bank.app.repository.TransactionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public List<Transaction>findAllByAccountNumber(Long account){
        return transactionRepository.findAllByAccountNumber(account);
    }


}
