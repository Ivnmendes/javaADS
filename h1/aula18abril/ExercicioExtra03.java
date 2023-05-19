package h1.aula18abril;

import java.util.Scanner;

public class ExercicioExtra03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double total = 0; 
        int num = sc.nextInt();
        for(int i = num; i >= 1; i--) {
            total += (1/(double) i);
        }
        System.out.printf("final %.2f",total);
    }
}
