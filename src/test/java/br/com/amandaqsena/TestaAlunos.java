package br.com.amandaqsena;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Nico Steppat"); // outro Nico Steppat, exatamente igual ao anterior
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println(alunos); 
        System.out.println(alunos.size());
        
        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        System.out.println(pauloEstaMatriculado);

        Collection<String> alunosColection = new HashSet<>();

        // Para usar métodos que envolvam a ordem dos elementos: 
        List<String> alunosEmLista = new ArrayList<>(alunos);
        System.out.println(alunosEmLista.get(1));
    }
}
