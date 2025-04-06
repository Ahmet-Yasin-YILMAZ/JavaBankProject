package com.example.java_bank_project.service.impl;

import com.example.java_bank_project.dto.*;

import java.util.List;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
    BankResponse transfer(TransferRequest request);
    public List<UserResponse> getAllUsers();
    void deleteUser(Long id);
}
