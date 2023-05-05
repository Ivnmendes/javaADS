import java.util.Scanner;

public class exercicio04 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira o numero de segundos transcorridos:");
        int segundosInseridos = entrada.nextInt();
        int horF = segundosInseridos / 3600;
        int minF = segundosInseridos % 3600 / 60;
        int segF = segundosInseridos % 60;
        System.out.println("O tempo transcorrido foi de " + horF + " horas, " + minF + " minutos "+ segF + " segundos!");
    }
}
