package dio.bootcampJava.orangeTech.intermediario;

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //System.out.println("Digite o tipo de imóvel, valor e situação. Separando por /. ");
        //System.out.println("Exemplo: Casa/1900/Disponível");
        String frase = leitor.next();
        String array[] = frase.split("/");

        System.out.println("Imovel: "+ array[0]+" R$"+array[1]+" "+ array[2]);
    }
}

