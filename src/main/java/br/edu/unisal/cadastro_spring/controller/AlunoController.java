package br.edu.unisal.cadastro_spring.controller;

import java.util.List;

import br.edu.unisal.cadastro_spring.domain.Aluno;
import br.edu.unisal.cadastro_spring.repos.AlunoRepository;

public class AlunoController {

    private final AlunoRepository repo;

    public AlunoController(AlunoRepository repo) {
        this.repo = repo;
    }

    public List<Aluno> listar() {return repo.findAll();}

}
