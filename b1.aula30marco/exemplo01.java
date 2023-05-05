import java.util.Scanner;

public class exemplo01 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira a base do triangulo: ");
        double base = entrada.nextDouble();
        System.out.print("Insira a altura do triangulo: ");
        double altura = entrada.nextDouble();
        double aTriangulo = base * altura / 2;
        System.out.println("A area do triangulo de base "+ base +" e altura "+ altura+ " e de: "+ aTriangulo);
    }
}
