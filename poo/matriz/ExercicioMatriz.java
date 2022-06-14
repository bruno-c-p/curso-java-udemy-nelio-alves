package poo.matriz;

import utils.Mensagens;

public class ExercicioMatriz {

    public static void main(String[] args) {

        int m = Mensagens.leInteiro("Number M: ");
        int n = Mensagens.leInteiro("Number N: ");

        int[][] matriz = new int[m][n];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = Mensagens.leInteiro("");
            }
        }

        int selectedNumber = Mensagens.leInteiro("X: ");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == selectedNumber) {
                    System.out.println("Position: " + i + ", " + j);

                    if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
                    
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}

					if (j < matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}

					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
                }
            }
        }
    }

}
