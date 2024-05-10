package repeticao;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        int quantidadeDoces = 0;
        while(mesada>0) {
            Double valorDoce = valorAleatorio();

            if(valorDoce > mesada)
                //desconto no doce para arredondar valor e não ficar negativo
                //valorDoce = mesada;
                break;

            quantidadeDoces++;
            System.out.println(quantidadeDoces + " - Valor do doce: " + valorDoce + " - Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho comprou " + quantidadeDoces + " doces e restou R$" + mesada + " de mesada");

        /*
         * Não se preocupe quanto a formatação de valores
         * Iremos explorar os recursos de formatação em breve !!
         */
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
