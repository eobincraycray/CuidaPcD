package com.poo.cuidapcd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poo.cuidapcd.entity.Profissional;
import com.poo.cuidapcd.service.ProfissionalService;

@RestController
@RequestMapping("/api/profissionais") // URL base da API
public class ProfissionalController {

    @Autowired
    private ProfissionalService profissionalService; // Serviço que gerencia a lógica dos profissionais

    // Endpoint para obter todos os profissionais
  //  @GetMapping
  //  public List<Profissional> getProfissionais() {
  //      return profissionalService.findAll(); // Chama o serviço para pegar todos os profissionais
  //  }
}
