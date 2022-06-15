package poo.multidimensional_array;

import utils.Messages;

public class MultidimensionalArrayMain {

    public static void main(String[] args) {
        
        int n = Messages.readInt("");

        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = Messages.readInt("");
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
