package i1.aula01junho;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a base: ");
        int base = sc.nextInt();
        System.out.print("Insira o expoente: ");
        int expoente = sc.nextInt();
        int num = 1,i = 0;
        if (base>=2 && expoente > 1) {
            while (i<expoente) {
                num *= base;
                i++;
            }
        }
        System.out.println(num);
    }
}
