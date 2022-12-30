package dio.bootcampJava.orangeTech.basico;

import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int dinheiro = leitor.nextInt();
        int doce = dinheiro * 2;
        System.out.println("O cliente obteve "+ doce + " doces");


    }
}
