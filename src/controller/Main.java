package controller;

import java.util.Scanner;
import view.SomaRecursiva;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número natural: ");
        int a = sc.nextInt();

        System.out.print("Informe o segundo número natural: ");
        int b = sc.nextInt();

        if (a < 0 || b < 0) {
            System.out.println("Os números devem ser naturais (maiores ou iguais a zero).");
        } else {

            // Instanciando a classe recursiva
            SomaRecursiva soma = new SomaRecursiva();

            int resultado = soma.somar(a, b);

            System.out.println("Resultado da soma: " + resultado);
        }

        sc.close();
    }
}
