package b_aula_13_04;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira os gols do primeiro time: ");
        int golst1 = entrada.nextInt();
        System.out.print("\nInsira os gols do segundo time: ");
        int golst2 = entrada.nextInt();
        if (golst1 > golst2) {
            System.out.println("\nO time 1 ganhou de " + golst1 + " x " + golst2);
        }
        else if (golst1 == golst2) {
            System.out.println("\nO jogo terminou empatado em " + golst1 + " x " + golst2);
        }
        else {
            System.out.println("\nO time 2 ganhou de " + golst2 + " x " + golst1);
        }
    }
}
