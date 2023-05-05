package b_aula_13_04;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira um número inteiro: ");
        int num1 = entrada.nextInt();
        if (num1 > 0) {
            System.out.println(num1 + " é positivo!");
        }
        else if (num1 < 0) {
            System.out.println(num1 + " é negativo!");
        }
        else {
            System.out.println(num1 + " é 0!");
        }
    }
}
