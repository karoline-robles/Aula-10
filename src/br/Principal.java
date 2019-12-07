package br;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Alunos alunos1 = new Alunos("José", 01);
        Alunos aluno2 = new Alunos("Ana", 02);
        Alunos aluno3 = new Alunos("Karol", 03);
        Alunos aluno4 = new Alunos("Bianca", 04);

        List<Alunos> alunosSchool = new ArrayList<>();
        alunosSchool.add(alunos1);
        alunosSchool.add(aluno2);
        alunosSchool.add(aluno3);
        alunosSchool.add(aluno4);
        
        for (Alunos alunos : alunosSchool) {
            if (alunosSchool.contains(alunos)){
                System.out.println(alunos.toString());
            }

        }





    }

}
