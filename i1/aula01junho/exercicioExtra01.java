package i1.aula01junho;

import java.util.Scanner;

public class exercicioExtra01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int soma = 0, num, i=1;
        
        System.out.print("Insira um valor:");
        num = sc.nextInt();
        
        while(i<num) {
            if(num % i == 0) {
                soma += i;
            }
            i++;
        }
        if(soma>num) {
            System.out.println(num + " é um numero abundante");
        } else {
            System.out.println(num + " nao é um numero abundante");
        }
    }
    
}
