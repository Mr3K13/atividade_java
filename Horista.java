package atividade_java;

import javax.swing.JOptionPane;

// Classe derivada Mensalista
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
