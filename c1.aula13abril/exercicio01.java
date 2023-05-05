import java.util.Scanner;

public class exercicio01 {
    public static void main(String args[]) {
        System.out.print("Insira um número inteiro: ");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        if (num % 2 == 0) {
            System.out.println("O número é par!");
        }
        else {
            System.out.println("O número é impar!");
        }
    }
    
}
