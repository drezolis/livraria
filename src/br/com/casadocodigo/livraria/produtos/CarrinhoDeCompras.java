package br.com.casadocodigo.livraria.produtos;

public class CarrinhoDeCompras {

    private double total;
    private Produto[] produtos = new Produto[10];
    private int contador = 0;

    public void adiciona(Produto produto){
        System.out.println("Adicionando: " + produto);
        this.produtos[contador] = produto;
        contador++;
        total += produto.getValor();

    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public double getTotal() {
        return total;
    }


}
