package i1.aula01junho;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, maiorN = 0, menorN = 0, i = 0;
        while(i<10) {
            System.out.println("Insira um número");
            num = sc.nextInt();
            if (i == 0) {
                maiorN = num;
                menorN = num;
            } else {
                if (num > maiorN) {
                maiorN = num;
                }
                if (num < menorN) {
                menorN = num;
                }
            }
            i++;
        }
        System.out.printf("Maior numero: %d %n Menor numero: %d", maiorN, menorN);
    }
}
