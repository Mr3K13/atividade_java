//Marcus Vinicius Ferraz Teixeira de Mendonça - 01545162 - Sistemas da informação
//Gabriel César Ferreira Guimarães - 01589747 - Engenharia da computação
//David Tavares De Oliveira Simões - 01590461 - Ciência da computação

import java.util.Scanner;

class No {
    int valor;
    No esquerda;
    No direita;

    public No(int valor) {
        this.valor = valor;
        esquerda = null;
        direita = null;
    }
}

public class Prova2AVEstruturaDeDados {
    private static No raiz = null;

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opc = 0;

        while (opc != 5) {
            System.out.println("");
            System.out.println("## ÁRVORE BINÁRIA ##");
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("3 - Listar");
            System.out.println("4 - Pesquisar");
            System.out.println("5 - Sair");
            System.out.print("Informe a opção desejada: ");
            opc = leia.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Informe o valor a ser inserido: ");
                    int valorInserir = leia.nextInt();
                    IncluirNo(valorInserir);
                    break;
                case 2:
                    if (arvoreVazia()) {
                        System.out.println("A árvore está vazia. Não é possível remover.");
                    } else {
                        System.out.print("Informe o valor a ser removido: ");
                        int valorRemover = leia.nextInt();
                        Excluir(valorRemover);
                    }
                    break;
                case 3:
                    if (arvoreVazia()) {
                        System.out.println("A árvore está vazia. Não há elementos para listar.");
                    } else {
                        System.out.println("Listagem da árvore:");
                        ListarArvore(raiz);
                    }
                    break;
                case 4:
                    if (arvoreVazia()) {
                        System.out.println("A árvore está vazia. Não é possível pesquisar.");
                    } else {
                        System.out.print("Informe o valor a ser pesquisado: ");
                        int valorPesquisar = leia.nextInt();
                        if (PesquisarNo(raiz, valorPesquisar)) {
                            System.out.println(valorPesquisar + " está na árvore.");
                        } else {
                            System.out.println(valorPesquisar + " não está na árvore.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    private static void IncluirNo(int valor) {
        raiz = InserirRec(raiz, valor);
    }

    private static No InserirRec(No raiz, int valor) {
        if (raiz == null) {
            return new No(valor);
        }

        if (valor < raiz.valor) {
            raiz.esquerda = InserirRec(raiz.esquerda, valor);
        } else if (valor > raiz.valor) {
            raiz.direita = InserirRec(raiz.direita, valor);
        }

        return raiz;
    }

    private static void Excluir(int valor) {
        raiz = RemoverRec(raiz, valor);
    }

    private static No RemoverRec(No raiz, int valor) {
        if (raiz == null) {
            return raiz;
        }

        if (valor < raiz.valor) {
            raiz.esquerda = RemoverRec(raiz.esquerda, valor);
        } else if (valor > raiz.valor) {
            raiz.direita = RemoverRec(raiz.direita, valor);
        } else {
            if (raiz.esquerda == null) {
                return raiz.direita;
            } else if (raiz.direita == null) {
                return raiz.esquerda;
            }

            raiz.valor = MenorValor(raiz.direita);
            raiz.direita = RemoverRec(raiz.direita, raiz.valor);
        }

        return raiz;
    }

    private static int MenorValor(No raiz) {
        int valorMin = raiz.valor;
        while (raiz.esquerda != null) {
            valorMin = raiz.esquerda.valor;
            raiz = raiz.esquerda;
        }
        return valorMin;
    }

    private static void ListarArvore(No raiz) {
        if (raiz != null) {
            ListarArvore(raiz.esquerda);
            System.out.print(raiz.valor + " ");
            ListarArvore(raiz.direita);
        }
    }

    private static boolean PesquisarNo(No raiz, int valor) {
        if (raiz == null) {
            return false;
        }

        if (valor == raiz.valor) {
            return true;
        } else if (valor < raiz.valor) {
            return PesquisarNo(raiz.esquerda, valor);
        } else {
            return PesquisarNo(raiz.direita, valor);
        }
    }

    private static boolean arvoreVazia() {
        return raiz == null;
    }
}