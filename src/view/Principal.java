package view;

import java.util.Scanner;

import controller.Circulo;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        System.out.print("Informe o valor do raio: ");
        double raio = sc.nextDouble();
        Circulo c = new Circulo(raio);

        do {
            System.out.println("\nSelecione uma opção: ");
            System.out.println("01. Área do círculo");
            System.out.println("02. Perímetro do círculo");
            System.out.println("00. Finalizar");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            operacao(opcao, c);
        } while (opcao != 0);

        sc.close();
    }

    public static void operacao(int opcao, Circulo c) {
        switch (opcao) {
            case 0:
                System.out.println("Finalizado!");
                break;

            case 1:
                System.out.println(c.getArea());
                break;

            case 2:
                System.out.println(c.getPerimetro());
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
