package Classe.Exercicios.Produto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Produto01 produto = new Produto01("Tela", 50);
        produto.status();
        produto.adicionarEstoque(10);
        produto.status();
        produto.removerEstoque(3);
        produto.status();
        produto.removerEstoque(10);
        produto.status();
        produto.adicionarEstoque(0);
        produto.status();
        produto.removerEstoque(7);
        produto.status();
        produto.adicionarEstoque(5);
        produto.status();
        produto.removerEstoque(-1);
        produto.status();
    }
}
