package br.com.dio.desafio.abstraindo.bootcamp;

import java.time.LocalDate;

import br.com.dio.desafio.abstraindo.bootcamp.br.com.dio.desafio.abstraindo.Conteudo;
import br.com.dio.desafio.abstraindo.bootcamp.br.com.dio.desafio.abstraindo.Curso;
import br.com.dio.desafio.abstraindo.bootcamp.br.com.dio.desafio.abstraindo.Dev;
import br.com.dio.desafio.abstraindo.bootcamp.br.com.dio.desafio.abstraindo.Mentoria;

/**
 * Bootcamp
 */
public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);

    private Mentoria mentoria;
    private Conteudo conteudo;
    private Curso curso;
    private Dev dev;
    
}