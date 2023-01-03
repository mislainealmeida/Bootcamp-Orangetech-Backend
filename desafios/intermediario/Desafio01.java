package dio.bootcampJava.orangeTech.intermediario;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //System.out.println("Qual o nome da música? ");
        String arquivoDoPc = leitor.next();

        System.out.println(arquivoDoPc.contains(".mp3") ? "Salvar": "Deletar");
    }
}
