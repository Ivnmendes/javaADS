import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while(true) {
            System.out.println("Insira três números inteiros diferentes");
            System.out.print("Insira um valor: ");
            int x = entrada.nextInt();
            System.out.print("Insira um valor: ");
            int y = entrada.nextInt();
            System.out.print("Insira um valor: ");
            int z = entrada.nextInt();
            if(x>y && y>z) {
                System.out.printf("%d é o maior número e %d é o menor número", x,z);
            }
            else if(x>y && y<z) {
                System.out.printf("%d é o maior número e %d é o menor número", x,y);
            }
            else if(y>x && x>z) {
                System.out.printf("%d é o maior número e %d é o menor número", y,z);
            }
            else if(y>z && x<z) {
                System.out.printf("%d é o maior número e %d é o menor número", y,x);
            }
            else if(z>x && x>y) {
                System.out.printf("%d é o maior número e %d é o menor número", z,y);
            }
            else{
                System.out.printf("%d é o maior número e %d é o menor número", z,x);
            }
            System.out.println("\n ");
        }
    }
}
