package g1.aula.extra06abril;

/**
 *
 * @author Ivan Mendes, Vinicios Ebling
 */

import java.util.Scanner;

public class ExercicioDuplas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int velocidade, pontosCarteira = 0;
        String diaSemana;
        while (true) {
            System.out.print("Insira a velocidade em que o carro passou o radar: ");
            velocidade = sc.nextInt();
            if (velocidade <= 0) {
                System.out.println("Insira um valor positivo de velocidade!");
                continue;
            }
            System.out.print("Insira o dia da semana: ");
            diaSemana = sc.next();
            switch (diaSemana) {
                case "Segunda":
                case "segunda":
                case "Terça":
                case "terça":
                case "Quarta":
                case "quarta":
                case "Quinta":
                case "quinta":
                case "Sexta":
                case "sexta":
                    if(velocidade <= 30) {
                        System.out.println("Está dentro do limite!");
                    } else if (velocidade <= 30 + (30 * 0.2)) {
                        System.out.println("Multa de R$85,13");
                        pontosCarteira += 4;
                    } else if (velocidade <= 30 + (30 * 0.5)) {
                        System.out.println("Multa de R$127,69");
                        pontosCarteira += 5;
                    } else {
                        System.out.println("Multa de R$321,45");
                        pontosCarteira += 8;
                    }
                break;
                case "Sábado":
                case "sábado":
                case "Sabado":
                case "sabado":
                case "Domingo":
                case "domingo":
                    if(velocidade <= 50) {
                        System.out.println("Está dentro do limite!");
                    } else if (velocidade <= 50 + (50 * 0.2)) {
                        System.out.println("Multa de R$85,13");
                        pontosCarteira += 4;
                    } else if (velocidade <= 50 + (50 * 0.5)) {
                        System.out.println("Multa de R$127,69");
                        pontosCarteira += 5;
                    } else {
                        System.out.println("Multa de R$321,45");
                        pontosCarteira += 8;
                    }
                break;
                default:
                    System.out.println("Insira um dia da semana válido!");
                    break;
            }
            System.out.printf("Você tem %d pontos na carteira \n", pontosCarteira);
            pontosCarteira = 0;
        }
    }
}
