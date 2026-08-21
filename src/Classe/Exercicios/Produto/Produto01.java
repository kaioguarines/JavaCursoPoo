package Classe.Exercicios.Produto;

public class Produto01 {
    private String nome;
    private float preco;
    private int quantidade;
    private boolean disponivel;

    public Produto01(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = 0;
        this.disponivel = false;
    }

    public void status() {
        System.out.println("=== PRODUTO ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Preco: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Disponivel: " + getDisponivel());
        System.out.println("Valor em Estoque: " + calcularValorEstoque());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade >= 1) {
            setQuantidade(quantidade + getQuantidade());
            setDisponivel(true);
        } else System.out.println("quantidade invalida");
    }

    public void removerEstoque(int quantidade) {
        if (quantidade >= 1) {
            if (quantidade > getQuantidade()) {
                System.out.println("Quantidade maior que o estoque");
            } else {
                int quantidadeRemovida = getQuantidade() - quantidade;
                setQuantidade(quantidadeRemovida);
                if (getQuantidade() == 0) {
                    setDisponivel(false);
                }
            }
        } else {
            System.out.println("Quantidade invalida");
        }
    }

    public float calcularValorEstoque() {
        return (getQuantidade() * getPreco());
    }
}