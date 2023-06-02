package i1.aula01junho;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, num, soma = 0;
        double media;
        while(i<4) {
            System.out.print("Insira um número: ");
            num = sc.nextInt();
            soma += num;
            i++;
        }
        media = soma / 4.;
        System.out.println(media);
    }
}
