package h1.aula18abril;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maiorValor = 0, menorValor = 0, total = 0;
        for(int i = 0; i<10; i++) {
            System.out.println("Insira um número: ");
            int num = sc.nextInt();
            if (i==0) {
                maiorValor = num;
                menorValor = num;
            } else {
                if (num > maiorValor) {
                    maiorValor = num;
                }
                if (num < menorValor) {
                    menorValor = num;
                }
            }
            total += num;
        }
        double media = total / 10;
        System.out.printf("Maior valor: %d \nMenor valor: %d\nMedia: %.2f", maiorValor, menorValor, media);
    }
 
}
