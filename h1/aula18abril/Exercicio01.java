package h1.aula18abril;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número entre 1 a 10: ");
        int num = sc.nextInt();
        
        for(int i=1;i<=10;i++) {
            int resultado = num * i;
            System.out.printf("%d * %d = %d \n",num,i,resultado);
        }
    }
}
