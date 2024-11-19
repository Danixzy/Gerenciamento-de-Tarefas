package org.example;

import java.util.List;
import java.util.Scanner;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade = 0;


    public void adicionarProduto(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Digite o nome do produto: ");
        nome = scanner.nextLine();

        System.out.println("Digite o preço do produto: ");
        preco = scanner.nextDouble();
        quantidade++;
    }


    public void mostrarProduto() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }


    public static void removerProduto(List<Produto> listaDeProdutos, Scanner scanner) {
        scanner.nextLine();
        System.out.println("Digite o nome do produto que deseja remover:");
        String nomeRemover = scanner.nextLine();

        boolean removido = false;
        for (int i = 0; i < listaDeProdutos.size(); i++) {
            Produto produtoAtual = listaDeProdutos.get(i);
            if (produtoAtual.nome.equals(nomeRemover)) {
                listaDeProdutos.remove(i);
                System.out.println("Produto removido com sucesso!");
                removido = true;
                break;
            }
        }

        if (!removido) {
            System.out.println("Produto não encontrado.");
        }
    }
}
