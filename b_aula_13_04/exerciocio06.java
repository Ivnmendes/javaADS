package b_aula_13_04;

import java.util.Scanner;

public class exerciocio06 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int num1 = entrada.nextInt();
        if (num1 % 5 == 0) {
            System.out.println(num1 + " é múltiplo de 5!");
        }
        else {
            System.out.println(num1 + " não é múltiplo de 5!");
        }
    }
}
