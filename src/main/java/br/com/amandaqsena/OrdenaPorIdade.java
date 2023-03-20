package br.com.amandaqsena;

import java.util.Comparator;

/**
 * Classe que implementa a interface Comparator
 * usando como critério de comparação a idade de funcionários
 */
public class OrdenaPorIdade implements Comparator<Funcionario>{

    @Override
    public int compare(Funcionario funcionario, Funcionario outroFuncionario) {
        return funcionario.getIdade() - outroFuncionario.getIdade();
    }
}
