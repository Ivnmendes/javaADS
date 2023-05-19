package h1.aula18abril;

import java.util.Scanner;

public class ExercicioExtra01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0, num;
        System.out.print("Insira um numero inteiro: ");
        num = sc.nextInt();
        for(int i = 1; i<=num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }
        if(num < 0) {
            System.out.println("Não é primo");
        }
        else if(contador >= 3) {
            System.out.println("Não é primo");
        } else {
            System.out.println("É primo");
        }
    }
}
