package i1.aula01junho;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        int cont = 0, anacleto = 150, felisberto = 110;
        while (felisberto <= anacleto) {
            anacleto += 2;
            felisberto += 3;
            cont++;
        }
        System.out.printf("Levaram %d anos", cont);
    }
}
