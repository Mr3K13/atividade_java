//Marcus Vinicius Ferraz Teixeira de Mendonça - 01545162 - Sistemas da informação
//João Gabriel Matias Souza - 01603557 - Engenharia da computação

package atividade_java;

import javax.swing.JOptionPane;

// Classe derivada Horista
public class Horista extends Funcionario {

    private Double salarioHora;

    public Double getSalario() {

     return this.salarioHora;

    }

    // Método para calcular salário total do Horista
    public void setSalario(Double salariohora) {

     this.salarioHora = 100 + (salariohora * 6.82);

    }

    public void realizarTarefa() {

     JOptionPane.showMessageDialog(null,
     "Realizando tarefa genérica para o Horista.",
     "Realizando tarefa genérica.",
     1);

    }
}
