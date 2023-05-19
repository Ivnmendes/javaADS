package h1.aula18abril;

import java.util.Scanner;

public class ExercicioExtra02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero inteiro");
        int num = sc.nextInt();
        int total = 1;
        for(int i = num; 1<=i;i--) {
            total *= i;
        }
        System.out.printf("%d! = %d",num,total);
    }
}
