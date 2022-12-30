package dio.bootcampJava.orangeTech.basico;

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //System.out.println("Digite o número de páginas");
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        int dias= paginas/paginasLidas;

        System.out.println(dias+" dias");


    }
}
