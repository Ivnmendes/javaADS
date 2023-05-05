import java.util.Scanner;

public class exercicio02 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o consumo total de combustivel (em litros): ");
        double tGasto = entrada.nextDouble();
        System.out.print("Insira a distancia percorrida(em km): ");
        double dPercorrida = entrada.nextDouble();
        double cMedio = dPercorrida/tGasto;
        System.out.println("O consumo medio foi de: " + cMedio + " Quilometros por litro!");
    }
}
