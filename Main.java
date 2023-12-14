//Marcus Vinicius Ferraz Teixeira de Mendonça - 01545162 - Sistemas da informação
//João Gabriel Matias Souza - 01603557 - Engenharia da computação

package atividade_java;

import javax.swing.*;

public class Main {

        // Classe main
        public static void main(String[] args) {

        // Criando instâncias
        Funcionario funcionario = new Funcionario();
        Horista horista = new Horista();
        Mensalista mensalista = new Mensalista();

        // Chamando o método para o menu
        menu(funcionario, horista, mensalista);
        }

        public static void menu(Funcionario funcionario, Horista horista, Mensalista mensalista) {

        int tipoFuncionario = Integer.parseInt(JOptionPane.showInputDialog(
         null,
         "   *******     Menu     ******* " +
         "\n\n1 - Horista " +
         "\n2 - Mensalista" +
         "\n\nEscolha uma opção: ",
         "Menu do Funcionário",
         3));

        switch (tipoFuncionario) {
                        
        // Menu do Horista
        case 1:
                        
        funcionario.setNome(JOptionPane.showInputDialog(
         null,
         "Digite seu Nome: ",
         "Menu do Horista",
         2));

        funcionario.setIdade(Integer.parseInt(JOptionPane.showInputDialog(
         null,
         "Digite sua idade: ",
         "Menu do Horista",
         2)));

        horista.setSalario(Double.parseDouble(JOptionPane.showInputDialog(
         null,
         "Digite o valor total de horas: " +
         "\nA hora está: R$6,82",
         "Menu do Horista",
         2)));

        JOptionPane.showMessageDialog(
         null,
         "Nome: " + funcionario.getNome()
         + "\nIdade: " + funcionario.getIdade()
         + "\nSalario: " + horista.getSalario(),
         "Menu do Horista",
          1);

        horista.realizarTarefa();

        break;

         // Menu do Mensalista
        case 2:
                        
        funcionario.setNome(JOptionPane.showInputDialog(
         null,
         "Digite seu Nome: ",
         "Menu do Mensalista",
         2));

        funcionario.setIdade(Integer.parseInt(JOptionPane.showInputDialog(
         null,
         "Digite sua Idade: ",
         "Menu do Mensalista",
         2)));

        JOptionPane.showMessageDialog(
         null,
         "O seu salario é pré-fixado em: " +
         mensalista.getSalario(),
         "Menu do Mensalista",
         2);

        JOptionPane.showMessageDialog(
         null,
         "Nome: " + funcionario.getNome()
         + "\nIdade: " + funcionario.getIdade()
         + "\nSalario: " + mensalista.getSalario(),
         "Menu do Mensalista",
         1);

        mensalista.realizarTarefa();

         break;

        default:

        JOptionPane.showMessageDialog(null,
         "Opição invalida",
         "Sistema de Gerenciamento de Tarefas",
         0);

        menu(funcionario, horista, mensalista);

   break;

  }
  
 }

}