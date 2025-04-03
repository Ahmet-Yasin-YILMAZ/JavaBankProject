package com.example.java_bank_project.controller;

import com.example.java_bank_project.dto.BankResponse;
import com.example.java_bank_project.dto.CreditDebitRequest;
import com.example.java_bank_project.dto.EnquiryRequest;
import com.example.java_bank_project.dto.UserRequest;
import com.example.java_bank_project.service.impl.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;


    @PostMapping
    public BankResponse createAccount(@RequestBody UserRequest userRequest){
        return userService.createAccount((userRequest));
    }

    @GetMapping("/balanceEnquiry")
    public BankResponse balanceEnquiry(@RequestBody EnquiryRequest request){
        return userService.balanceEnquiry(request);
    }

    @GetMapping("/nameEnquiry")
    public String nameEnquiry(@RequestBody EnquiryRequest request){
        return userService.nameEnquiry(request);
    }

    @PostMapping("/credit")
    public BankResponse creditAccount(@RequestBody CreditDebitRequest request){
        return userService.creaditAccount(request);
    }

    @PostMapping("/debit")
    public BankResponse debitAccount(@RequestBody CreditDebitRequest request){
        return userService.debitAccount(request);
    }
}
