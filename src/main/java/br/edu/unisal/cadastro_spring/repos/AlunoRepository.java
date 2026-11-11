package br.edu.unisal.cadastro_spring.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unisal.cadastro_spring.domain.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno,Long> {

}
