//Marcus Vinicius Ferraz Teixeira de Mendonça - 01545162 - Sistemas da informação
//João Gabriel Matias Souza - 01603557 - Engenharia da computação
//Gabriel César Ferreira Guimarães - 01589747 - Engenharia da computação

package atividade_java;

import javax.swing.JOptionPane;

// Classe derivada Mensalista
public class Mensalista extends Funcionario {

  private Double salarioMensal;

  public Double getSalario() {

  return this.salarioMensal;
  
  }

  // Método para resgatar salário total fixo
  public void setSalario(Double salariomensal) {

  this.salarioMensal = salariomensal + 2000;

  }

  public void realizarTarefa() {

  JOptionPane.showMessageDialog(null,
   "Realizando tarefa genérica para o Mensalista.",
   "Realizando tarefa genérica.",
   1);

  }
}