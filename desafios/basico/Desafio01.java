package dio.bootcampJava.orangeTech.basico;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //System.out.println("Digite a quantidade de meses desejado");
        int entrada = leitor.nextInt();
        int mesada = 50;
        int total= 50 * entrada;

        System.out.println(total);


    }
}
