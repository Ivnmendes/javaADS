package aula_30_03;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o ano de seu nascimento: ");
        int anoD = entrada.nextInt();
        int idade = 2023 - anoD;
        System.out.println("Sua idade é de " + idade+ " anos");
    }
}
