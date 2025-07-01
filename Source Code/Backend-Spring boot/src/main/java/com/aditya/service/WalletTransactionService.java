package com.aditya.service;

import com.aditya.domain.WalletTransactionType;
import com.aditya.model.Wallet;
import com.aditya.model.WalletTransaction;

import java.util.List;

public interface WalletTransactionService {
    WalletTransaction createTransaction(Wallet wallet,
                                        WalletTransactionType type,
                                        String transferId,
                                        String purpose,
                                        Long amount
    );

    List<WalletTransaction> getTransactions(Wallet wallet, WalletTransactionType type);

}
