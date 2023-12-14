//Marcus Vinicius Ferraz Teixeira de Mendonça - 01545162 - Sistemas da informação
//Gabriel César Ferreira Guimarães - 01589747 - Engenharia da computação
//David Tavares De Oliveira Simões - 01590461 - Ciência da computação

package atividade_java;

import javax.swing.JOptionPane;

// Classe Funcionario
public class Funcionario {

    private String nome;
    private int idade;

    // Métodos de encapsulamento
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
