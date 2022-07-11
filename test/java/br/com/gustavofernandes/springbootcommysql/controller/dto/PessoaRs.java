package br.com.gustavofernandes.springbootcommysql.controller.dto;

import br.com.gustavofernandes.springbootcommysql.model.Pessoa;

public class PessoaRs {
    private Long id;
    private String nome;
    private String sobrenome;

    public static  PessoaRs converter(Pessoa p) {
        var pessoa = new PessoaRs();
        pessoa.setId(pessoa.getId());
        pessoa.setNome(p.getNome());
        pessoa.setsobrenome(p.getSobrenome());
        return pessoa;
    }

    }
public Long getId() {
    return id;
}

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
