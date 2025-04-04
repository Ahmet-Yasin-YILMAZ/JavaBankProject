package com.example.java_bank_project.repository;

import com.example.java_bank_project.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
