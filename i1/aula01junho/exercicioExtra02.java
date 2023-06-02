package i1.aula01junho;

import java.util.Scanner;

public class exercicioExtra02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int soma1 = 0, soma2 = 0, cont1 = 1, cont2 = 1;
        
        System.out.print("Insira o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Insira o segundo número: ");
        int num2 = sc.nextInt();
        
        while(cont1<=num1 / 2) {
            if(num1 % cont1 == 0) {
                soma1 += cont1;
            }
            cont1++;
        }
        while(cont2<=num2 / 2) {
            if(num2 % cont2 == 0) {
                soma2 += cont2;
            }
            cont2++;
        }
        
        if(soma2 == num1 && soma1 == num2) {
            System.out.printf("%d e %d são numero amigaveis", num1, num2);
        } else {
            System.out.printf("%d e %d nao são numero amigaveis", num1, num2);
        }
    }
}
