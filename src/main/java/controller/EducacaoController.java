package com.seu_projeto.controller;

import entity.Educacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.EducacaoService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/educacoes")
public class EducacaoController {
    @Autowired
    private EducacaoService educacaoService;

    @GetMapping
    public List<Educacao> getAllEducacoes() {
        return educacaoService.getAllEducacoes();
    }

    @GetMapping("/{id}")
    public Optional<Educacao> getEducacaoById(@PathVariable Long id) {
        return educacaoService.getEducacaoById(id);
    }

    @PostMapping
    public Educacao createEducacao(@RequestBody Educacao educacao) {
        return educacaoService.createEducacao(educacao);
    }

    @DeleteMapping("/{id}")
    public void deleteEducacao(@PathVariable Long id) {
        educacaoService.deleteEducacao(id);
    }
}
