package com.bank.app.domain;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class Transaction {

//    Create a Transaction class with the fields:
//    type, date, accountNumber, currency, amount, merchantName, and merchantLogo.

    private String type ;

    private LocalDateTime date ;

    private String currency ;

    private Long accountNumber;

    private BigDecimal amount ;

    private String merchantName ;

    private String merchantLogo ;

}
