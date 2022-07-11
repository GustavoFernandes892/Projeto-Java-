package br.com.gustavofernandes.springbootcommysql.model;

import javax.persistence.*;

@Entity
@Table(= "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "cd pessoa")
    private Long id;
    @Column(name="nome")
    private String nome;
    @Column(name="sobrenome")
    private String sobrenome;

    public Long getId() {
        return id;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}


