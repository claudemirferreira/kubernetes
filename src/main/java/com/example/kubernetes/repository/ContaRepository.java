package com.example.kubernetes.repository;

import com.example.kubernetes.entity.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepository extends JpaRepository<Conta, Long> { }