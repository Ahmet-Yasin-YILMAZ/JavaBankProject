package com.example.java_bank_project.service.impl;

import com.example.java_bank_project.dto.BankResponse;
import com.example.java_bank_project.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
}
