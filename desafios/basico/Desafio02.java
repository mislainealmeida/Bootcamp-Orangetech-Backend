package dio.bootcampJava.orangeTech.basico;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //System.out.println("Digite entre 1-10");
        int tamanho = leitor.nextInt();

        if(tamanho > 0 && tamanho <=10){
            for (int i = 0; i< tamanho; i++){
                System.out.print("/");
            }
        }else{
            System.out.println("Valor inválido. Digite entre 1-10");
        }
    }
}
