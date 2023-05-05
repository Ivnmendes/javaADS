package b_aula_20_04;

import java.util.Scanner;
public class exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while(true) {
            System.out.print("Insira a sua idade: ");
            int idade = entrada.nextInt();
            if(idade > 18 && idade < 67) {
                System.out.println("Pode doar sangue!");
            }
            else {
                System.out.println("Não pode doar sangue");
            }
            System.out.println("\n ");
        }
    }
}
