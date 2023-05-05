package b_aula_20_04;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while(true){
            System.out.print("Insira sua idade: ");
            int idade = entrada.nextInt();
            if(idade < 16) {
                System.out.println("Não pode votar e nem dirigir!");
            }
            else if (idade >= 16 && idade < 18) {
                System.out.println("Pode votar, mas não pode dirigir!");
            }
            else {
                System.out.println("Pode votar e dirigir!");
            }
            System.out.println("\n ");
        }
    }
}
