package controller;

public class SomaRecursiva {

    // Construtor da classe
    public SomaRecursiva() {
        // Utilizado apenas para instanciar o objeto
    }

    // Metodo recursivo que soma dois números naturais sem usar a operação de soma direta
    public int somar(int a, int b) {

        /*
         * CONDIÇÃO DE PARADA:
         * Quando o segundo número (b) for igual a zero,
         * a soma está completa e o valor de a é retornado.
         */
        if (b == 0) {
            return a;
        }

        /*
         * RELAÇÃO DE CHAMADA DOS PASSOS:
         * A soma de a e b é realizada incrementando a em 1
         * e decrementando b em 1 a cada chamada recursiva.
         * O processo continua até que b chegue a zero.
         */
        return somar(a + 1, b - 1);
    }
}
