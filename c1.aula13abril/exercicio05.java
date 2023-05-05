import java.util.Scanner;

public class exercicio05 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int z;
        System.out.print("Insira o primeiro valor: ");
        int x = entrada.nextInt();
        System.out.print("Insira o segundo valor: ");
        int y = entrada.nextInt();
        z = x;
        x = y;
        y = z;
        System.out.println("Valor de x: " + x + ", valor de y: " + y);
    }
    
}
