package dio.bootcampJava.orangeTech.intermediario;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //System.out.println("Digite a velocidade: ");
        int velocidade = leitor.nextInt();
        //System.out.println("Digite a quantidade de multas do motorista:" );
        int multas = leitor.nextInt();

        if(velocidade>80){
            multas += 1;

            if(multas>=1 && multas<=2){
                System.out.println(multas+ " multas. Nao levou pontos na carteira");
            }else if(multas >=3){
                System.out.println(multas+ " multas. Levou pontos na carteira");
            }

        }else{
            System.out.println(multas+ " multas. Nao levou pontos na carteira");
        }
    }
}

