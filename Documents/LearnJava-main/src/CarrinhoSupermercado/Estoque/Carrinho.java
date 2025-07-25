package CarrinhoSupermercado.Estoque;

import java.util.Scanner;

import CarrinhoSupermercado.Entidade.Produtos;

public class Carrinho {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao Estoque do Supermercado!");

        Scanner sc = new Scanner(System.in);

        Produtos produto = new Produtos();

        System.out.println("Digite o nome do produto: ");
        produto.nome = sc.nextLine();

        System.out.println("Digite o preco do produto: ");
        produto.preco = sc.nextDouble();

        System.out.println("Digite a quantidade do produto: ");
        produto.quantidade = sc.nextInt();

        System.out.println("---------- Informações do produto no estoque ----------");
        System.out.println("Nome: " + produto.nome);
        System.out.println("Preço: " + produto.preco);
        System.out.println("Quantidade: " + produto.quantidade);

        System.out.println("Valor total de " + produto.nome + " no estoque: " + produto.valorTotalCarrinho());

        System.out.println("Deseja 1 - adicionar ou 2 - remover produtos?");
        int opcao = sc.nextInt();

        if (opcao != 1 && opcao != 2) {
            System.out.println("Opção inválida");
            return;
        }
        if (opcao == 1) {
            System.out.println("Digite a quantidade de produtos que deseja adicionar: ");
            produto.adicionarProdutos(sc.nextInt());

            System.out.println("---------- Informações do produto no estoque ----------");
            System.out.println("Nome: " + produto.nome);
            System.out.println("Preço: " + produto.preco);
            System.out.println("Quantidade: " + produto.quantidade);

            System.out.println("Valor total de " + produto.nome + " no estoque: " + produto.valorTotalCarrinho());
        }

        if (opcao == 2){
            System.out.println("Digite a quantidade de produtos que deseja remover: ");
            produto.removerProdutos(sc.nextInt());

            System.out.println("---------- Informações do produto no estoque ----------");
            System.out.println("Nome: " + produto.nome);
            System.out.println("Preço: " + produto.preco);
            System.out.println("Quantidade: " + produto.quantidade);

            System.out.println("Valor total de " + produto.nome + " no estoque: " + produto.valorTotalCarrinho());
        }
        sc.close();

    }
}
