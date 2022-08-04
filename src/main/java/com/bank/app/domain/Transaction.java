package com.bank.app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

//    Create a Transaction class with the fields:
//    type, date, accountNumber, currency, amount, merchantName, and merchantLogo.

    private String type ;

    private LocalDateTime date ;

    private BigDecimal currency ;

    private String accountNumber;

    private BigDecimal amount ;

    private String merchantName ;

    private String merchantLogo ;

}
