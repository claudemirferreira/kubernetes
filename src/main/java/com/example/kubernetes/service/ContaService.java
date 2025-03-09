package com.example.kubernetes.service;

import com.example.kubernetes.entity.Conta;
import com.example.kubernetes.repository.ContaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {

    private final ContaRepository contaRepository;

    public ContaService(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    public List<Conta> listAll(){
        return contaRepository.findAll();
    }

    public Conta save(Conta conta) {
        return contaRepository.save(conta);
    }

}
