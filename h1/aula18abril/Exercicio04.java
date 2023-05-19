package h1.aula18abril;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0, media;
        int acimaMedia = 0, abaixoMedia = 0;
        for(int i = 0; i<5; i++) {
            System.out.print("Insira a primeira nota: ");
            nota += sc.nextInt();
            System.out.print("Insira a segunda nota: ");
            nota += sc.nextInt();
            
            media = nota/2;
            System.out.printf("A média do aluno é %.2f", media);
            if(media>=7) {
                acimaMedia++;
            } else {
                abaixoMedia++;
            }
            nota = 0;
        }
        System.out.println("Alunos acima da média: " + acimaMedia);
        System.out.println("Alunos abaixo da média: " + abaixoMedia);
    }
}
