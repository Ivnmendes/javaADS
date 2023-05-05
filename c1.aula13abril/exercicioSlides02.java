import java.util.Scanner;

public class exercicioSlides02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while(true) {
            System.out.print("Insira a idade da primeira pessoa: ");
            int idade1 = entrada.nextInt();
            System.out.print("Insira a idade da segunda pessoa: ");
            int idade2 = entrada.nextInt();
            if(idade1 % 2 == 0 && idade2 % 2 == 0) {
                System.out.println("O valor ficou em R$30.00, R$15.00 por pessoa");
            }
            else{
                System.out.println("O valor ficou em R$60.00, R$30.00 por pessoa");
            }
            System.out.println("\n");
        }
    }
}
