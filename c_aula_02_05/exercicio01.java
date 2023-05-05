package c_aula_02_05;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
       Scanner entrada= new Scanner(System.in);
       int resultadoInteiro;
       float resultado;
        while (true) { 
            System.out.print("Informe o primeiro valor: ");
            int x = entrada.nextInt();
            System.out.print("Informe o segundo valor: ");
            int y = entrada.nextInt();
            System.out.print("Agora selecione a operação a ser realizada, 1 para somar, 2 para subtrair, 3 para divisão e 4 para multiplicação: ");
            int op = entrada.nextInt();
            switch (op) {
                case 1:
                    resultadoInteiro = x + y;
                    System.out.printf("%d + %d = %d", x,y,resultadoInteiro);
                    break;
                case 2:
                    resultadoInteiro = x - y;
                    System.out.printf("%d - %d = %d", x,y,resultadoInteiro);
                    break;
                case 3:
                    resultado = x / ((float) y);
                    System.out.printf("%d / %d = %.2f", x,y,resultado);
                    break;
                case 4:
                    resultadoInteiro = x * y;
                    System.out.printf("%d * %d = %d", x,y,resultadoInteiro);
                    break;
                default:
                    System.out.println("Insira um valor válido!");
                    break;
            }
            System.out.println("");
        }
    }
}
