package dio.bootcampJava.orangeTech.intermediario;

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //System.out.println("Digite o tamanho da fila ");
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;

        for (int i = 0; i <= tamanhoDaFila; i ++){
            if(i % 2 != 0){
                pessoasNoCamarote +=1;
            }
        }
        System.out.print(pessoasNoCamarote + " pessoas no camarote");
    }
}
