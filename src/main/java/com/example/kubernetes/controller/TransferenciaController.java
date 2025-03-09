package com.example.kubernetes.controller;

import com.example.kubernetes.entity.Conta;
import com.example.kubernetes.service.ContaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transferencia")
public class TransferenciaController {

    private final ContaService contaService;

    public TransferenciaController(ContaService contaService) {
        this.contaService = contaService;
    }

    @GetMapping
    public List<Conta> get() {
        return contaService.listAll();
    }

    @PostMapping
    public ResponseEntity<Conta> add(@RequestBody Conta conta) {
        var entity = contaService.save(conta);
        return ResponseEntity.ok(entity);
    }
}
