import java.util.Scanner;

public class revisao_prova {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int notas100, notas50, notas20, notas10, notas5;
        while(true) {
            System.out.print("Informe o valor que quer sacar (deve ser múltiplo de 5):");
            int vSacar = entrada.nextInt();
            if(vSacar > 0 && vSacar % 5 == 0) {
                notas100 = vSacar / 100;
                notas50 = (vSacar % 100) / 50;
                notas20 = (vSacar % 100 % 50) / 20;
                notas10 = (vSacar % 100 % 50 % 20) / 10;
                notas5 = (vSacar % 100 % 50 % 20 % 10) / 5;
                System.out.printf("%d notas de R$100, %d notas de R$50, %d notas de R$20, %d notas de R$10 e %d notas de R$5", notas100, notas50, notas20, notas10, notas5);
            }
            else {
                System.out.println("Insira um valor válido!");
            }
            System.out.println("\n ");
        }
    }
}