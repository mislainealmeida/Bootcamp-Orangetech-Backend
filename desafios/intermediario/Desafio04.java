package dio.bootcampJava.orangeTech.intermediario;

import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //System.out.println("Digite os ingredientes. Separando por ;");
        //System.out.println("Exemplo: Pão; presunto; queijo; pão");
        String frase = leitor.nextLine();
        String[] ingredientes = frase.split(";");


        for(int i=0; i<ingredientes.length; i++){
            System.out.println(ingredientes[i]);
        }
    }
}
