package dio.bootcampJava.orangeTech.basico;

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //System.out.println("Digite a velocidade");
        int velocidadeAtual = leitor.nextInt();

        System.out.println(velocidadeAtual <= 60 ? "Nao foi multado" : "Foi multado");

    }

}
