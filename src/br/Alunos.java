package br;

public class Alunos {
    private String nome;
    private Integer numeroDeAluno;

    public Alunos(String nome, Integer numeroDeAlunouno) {
        this.nome = nome;
        this.numeroDeAluno = numeroDeAlunouno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroDeAluno() {
        return numeroDeAluno;
    }

    public void setNumeroDeAluno(Integer numeroDeAluno) {
        this.numeroDeAluno = numeroDeAluno;
    }

    @Override
    public String toString() {
        return "Nome " + nome;
    }
}
