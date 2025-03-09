package com.example.kubernetes.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/transferencia")
public class TransferenciaController {

    private List<String> list = new ArrayList<>();

    @GetMapping
    public List<String> getTransferencia() {
        return list;
    }

    @PostMapping
    public String addClient(@RequestBody String client) {
        list.add(client);
        return "Client added new: " + client;
    }
}
