package i1.aula01junho;

import java.util.Scanner;

public class exercicio01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        int num = sc.nextInt();
        int i = 1, soma = 0;
        while(i<=num) {
            soma += i; //soma = soma + i;
            i++;
        }
        System.out.println(soma);
    }
    
}
