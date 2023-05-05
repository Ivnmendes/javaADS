import java.util.Arrays;
import java.util.Scanner;

public class exercicioMaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z;
        while (true) {
            System.out.print("Insira o primeiro valor: ");
            x = sc.nextInt();
            System.out.print("Insira o segundo valor: ");
            y = sc.nextInt();
            System.out.print("Insira o terceiro valor: ");
            z = sc.nextInt();
            
            if (x==y && y==z) {
                System.out.println("Os valores são iguais");
            }
            else {
                int vetor[] = {x,y,z};
                Arrays.sort(vetor);
                for (int numero : vetor) {
                    System.out.print(numero + " ");
                }
            } 
            System.out.println("\n");
        }  
    }
}
