package h1.aula18abril;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<10; i++) {
            System.out.print("Insira um número: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.printf("%d é par\n", num);
            } else {
                System.out.printf("%d é ímpar\n", num);
            }
        }
    }
}
