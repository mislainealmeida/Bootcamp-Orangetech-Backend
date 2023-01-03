package dio.bootcampJava.orangeTech.basico;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //System.out.println("Digite a porcentagem, usando 1-10");
        //System.out.println("10% = 1");
        int tamanho = leitor.nextInt();

        String resultado;
        if(tamanho==1){
            resultado= "/";
        }
        else if(tamanho==2){
            resultado = "//";
        }
        else if(tamanho==3){
            resultado = "///";
        }
        else if(tamanho==4){
            resultado = "////";
        }
        else if(tamanho==5){
            resultado = "/////";
        }
        else if(tamanho==6){
            resultado = "//////";
        }
        else if(tamanho==7){
            resultado = "///////";
        }
        else if(tamanho==8){
            resultado = "////////";
        }
        else if(tamanho==9){
            resultado = "/////////";
        }
        else if(tamanho==10){
            resultado = "//////////";
        }
        else{
            resultado = "Valor inválido. Digite um número entre 1-10";
        }
        System.out.println(resultado);
    }
}
