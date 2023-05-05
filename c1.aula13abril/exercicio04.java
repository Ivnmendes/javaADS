import java.util.Scanner;

public class exercicio04 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int dezena = 0, centena, unidade;
        System.out.print("Insira um número inteiro menor que 1000: ");
        int num1 = entrada.nextInt();
        if (num1 < 0) {
            num1 *= -1;
        }
        if (num1 < 1000) {
            centena = num1 / 100;
            dezena = (num1 % 100) / 10;
            unidade = num1 % 10;
            
            System.out.println(num1 + " tem " + centena + " centenas, " + dezena + " dezenas e " + unidade + " unidades!");
        }
        else {
            System.out.println("Insira um valor válido!");
        }
    }
}
