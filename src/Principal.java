import Modelos.Compras;
import Modelos.Conta;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o limite do seu cartão");
        double limite = leitura.nextDouble();
        Conta cartao = new Conta(limite);

        int sair = 1;

        while (sair != 0){
            System.out.println("Digite a descrição da sua compra");
            String descricao = leitura.next();

            System.out.println("Digite o valor de sua compra");
            double valor = leitura.nextDouble();

            Compras compra = new Compras(descricao, valor);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada){
                System.out.println("Compra realizada!");
                System.out.println("Seu saldo atual é de: R$" + cartao.getSaldo());
                System.out.println("Para continuar digite 1, para sair digite 0");
                sair = leitura.nextInt();
            }else {
                System.out.println("Seu saldo é insuficiente.. " +
                        "Você tem: R$" + cartao.getSaldo() +
                        " Em sua conta.");
                sair = 0;
            }

            System.out.println("*---------------*");
            System.out.println("Compras realizadas");


            for (Compras c : cartao.getCompras()){
                System.out.println(c.getDescricacao() + " - " + "R$" + c.getValor() );
            }



        }

    }
}
