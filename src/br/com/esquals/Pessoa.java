package br.com.esquals;

//Clase concreta

public class Pessoa {
    private String nome;
    private int idade;
    private int rg;

    public Pessoa(String nome, int idade, int rg) {
        this.nome = nome;
        this.idade = idade;
        this.rg = rg;
    }

    //sobreescrevendo o metodo do equals
    @Override
    public boolean equals(Object novoObjeto) {
        if (this == novoObjeto) {
            return true;

        }

        if (!(novoObjeto instanceof Pessoa)) {
            return false;
        }

        Pessoa pessoa = (Pessoa) novoObjeto;

        return this.idade == pessoa.idade;


    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", rg=" + rg +
                '}';
    }
}
