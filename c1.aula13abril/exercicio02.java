import java.util.Scanner;

public class exercicio02 {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o primeiro número inteiro: ");
        int num1 = entrada.nextInt();
        System.out.print("\nInsira o segundo número inteiro: ");
        int num2 = entrada.nextInt();
        if (num1 == num2) {
            System.out.println("Os números são iguais!");
        }
        else {
            System.out.println("Os números são diferentes!");
        }
    }
}
