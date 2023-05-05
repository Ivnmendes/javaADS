package aula_30_03;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        double media;
        System.out.print("Insira o valor de x:");
        int x = entrada.nextInt();
        System.out.print("Insira o valor de y:");
        int y = entrada.nextInt();
        System.out.print("Insira o valor de z:");
        int z = entrada.nextInt();
        media = (x+y+z)/3;
        System.out.println("A media dos valores inseridos e: " + media);
    }
}
