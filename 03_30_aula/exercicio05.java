package aula_30_03;

public class exercicio05 {
    public static void main(String args[]){
        int hectares = 65, tCadaFilho, tLuiz, filhos = 4;
        tLuiz = hectares% filhos;
        tCadaFilho = hectares / filhos;
        System.out.println("Cada filho ficou com : " + tCadaFilho + " hectares.\n Luiz ficou com o resto, que sao " + tLuiz + " hectares");      
    }
}
