package exercicio.triangulos;

import java.util.Scanner;

public class DefinirTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            System.out.print("Insira o valor do lado \"a\": ");
            int a = entrada.nextInt();
            System.out.print("Insira o valor do lado \"b\": ");
            int b = entrada.nextInt();
            System.out.print("Insira o valor do lado \"c\": ");
            int c = entrada.nextInt();

            if (a < b + c && b < a + c && c < a + b) { //Verifica se os lados fornecidos formam um triângulo, utilizando a regra de que um lado não pode ser maior que a soma dos outros dois.
                if (a == b && b == c) {
                    System.out.println("Triângulo equilatero!");
                } else if (a != b && b != c && a != c) {
                    System.out.println("Triângulo escaleno!");
                } else {
                    System.out.println("Triângulo isóceles!");
                }
            } else {
                System.out.println("Não e um triângulo!");
            }
    }
}
