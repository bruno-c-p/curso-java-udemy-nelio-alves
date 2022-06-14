package poo.matriz;

import utils.Mensagens;

public class MatrizMain {

    public static void main(String[] args) {
        
        int n = Mensagens.leInteiro("");

        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = Mensagens.leInteiro("");
            }
        }

        System.out.println("Main diagonal: ");

        for (int i = 0; i < matriz.length; i++) {

            System.out.println(matriz[i][i] + " ");
        }

        
        int negativeNumbers = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] < 0) {

                    negativeNumbers++;
                }
            }
        }

        System.out.println("Negative numbers: " + negativeNumbers);
    }
    
}
