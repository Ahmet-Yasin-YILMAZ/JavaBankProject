package com.example.java_bank_project.service.impl;

import com.example.java_bank_project.dto.BankResponse;
import com.example.java_bank_project.dto.CreditDebitRequest;
import com.example.java_bank_project.dto.EnquiryRequest;
import com.example.java_bank_project.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creaditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
}
