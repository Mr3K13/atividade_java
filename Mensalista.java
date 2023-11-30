package atividade_java;

import javax.swing.JOptionPane;

// Classe derivada Horista
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