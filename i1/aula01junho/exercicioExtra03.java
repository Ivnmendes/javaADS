package i1.aula01junho;

import java.util.Scanner;

public class exercicioExtra03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int num = sc.nextInt();
        int raiz, resultado = 0, valor =  1;
        while(valor <= num) {
            raiz = num / valor;
            if(raiz*raiz == num) {
                resultado = raiz;
                break;
            }
            valor++;
        }
        if(resultado * resultado == num) {
            System.out.printf("%d é a raiz de %d", resultado, num);
        } else {
            System.out.printf("%d não tem raiz exata", num);
        }
    }
}
