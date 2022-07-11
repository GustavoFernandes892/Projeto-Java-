package br.com.gustavofernandes.springbootcommysql.repository;

import br.com.gustavofernandes.springbootcommysql.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface PessoaRepository  extends JpaRepository<Pessoa, Long> {
}
