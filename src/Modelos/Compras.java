package Modelos;

public class Compras {
    private String descricacao;
    private double valor;

    public Compras(String descricacao, double valor) {
        this.descricacao = descricacao;
        this.valor = valor;
    }




    public String getDescricacao() {
        return descricacao;
    }

    public double getValor() {
        return valor;
    }


    @Override
    public String toString() {
        return "Compra: " + descricacao + " valor = " + valor;
    }
}
