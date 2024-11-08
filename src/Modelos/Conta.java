package Modelos;

import java.util.ArrayList;
import java.util.List;

public class Conta{
    private double limite;
    private double saldo;
    private List<Compras> compras;

    public Conta(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();

    }

    public boolean lancaCompra (Compras compra){
        if (this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            compras.add(compra);
            return true;
        }

        return false;

    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public List<Compras> getCompras() {
        return compras;
    }
}
