package h1.aula18abril;
public class ExercicioExtra04 {
    public static void main(String[] args) {
        int aux, numAtual = 1, ant = 0;
        int n = 1;
        for(int i = 1; i<=20;i++) {
            System.out.print(numAtual + " ");
            aux = numAtual;
            numAtual += ant;
            ant = aux;
        }
    }
}