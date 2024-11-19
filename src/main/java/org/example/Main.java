package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Produto> listaDeProdutos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.printf(" 1-Adicionar Produto %n 2-Excluir Produto %n 3-Mostrar Produtos %n 4-Sair %n");
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Produto Adicionado");
                    Produto novoProduto = new Produto();
                    novoProduto.adicionarProduto(scanner);
                    listaDeProdutos.add(novoProduto);
                    break;
                case 2:
                    System.out.println("Remover Produto");
                    Produto.removerProduto(listaDeProdutos, scanner);
                    break;
                case 3:
                    System.out.println("Mostrando Produtos");
                    for (int i = 0; i < listaDeProdutos.size(); i++) {
                        Produto produtoAtual = listaDeProdutos.get(i);
                        produtoAtual.mostrarProduto();
                        System.out.println("------------------");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 4);

        scanner.close();
    }
}
