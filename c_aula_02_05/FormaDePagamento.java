package c_aula_02_05;

import java.util.Scanner;


public class FormaDePagamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("A nossa loja oferece 30% de desconto em compras pagas com dinheiro, 25% em compras pagas no débito e 20% no crédito!");
            System.out.print("Insira o valor a ser pago: ");
            double valor = sc.nextDouble();
            System.out.print("Agora insira o meio de pagamento, 1 para dinheiro vivo, 2 para débito e 3 para crédito: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    valor -= valor * 0.3;
                    System.out.printf("O valor a ser pago é de R$%.2f", valor);
                    break;
                case 2:
                    valor -= valor * 0.25;
                    System.out.printf("O valor a ser pago é de R$%.2f", valor);
                    break;
                case 3:
                    valor -= valor * 0.2;
                    System.out.printf("O valor a ser pago é de R$%.2f", valor);
                    break;
                default:
                    System.out.println("Valor Inválido!");
                    break;
            }
            System.out.println("\n");
        }
    }
}
