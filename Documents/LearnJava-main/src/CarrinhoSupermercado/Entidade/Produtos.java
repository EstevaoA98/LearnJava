package CarrinhoSupermercado.Entidade;

public class Produtos {

    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalCarrinho() {
        return preco * quantidade;
    }

    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }
}
