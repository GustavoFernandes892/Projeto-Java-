package br.com.gustavofernandes.springbootcommysql.controller;

import br.com.gustavofernandes.springbootcommysql.controller.dto.PessoaRs;
import br.com.gustavofernandes.springbootcommysql.repository.PessoaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.awt.event.TextListener;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

private final PessoaRepository pessoaRepository;

    public PessoaController(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }


    public List<PessoaRs> findAll(){
        var pessoas = pessoaRepository.findAll();
        return pessoas.stream().map((p) ->PessoaRs.converter());
        

    }
}
