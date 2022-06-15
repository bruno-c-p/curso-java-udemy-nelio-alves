package poo.multidimensional_array;

import utils.Messages;

public class MultidimensionalArrayExercise {

    public static void main(String[] args) {

        int m = Messages.readInt("Number M: ");
        int n = Messages.readInt("Number N: ");

        int[][] matriz = new int[m][n];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = Messages.readInt("");
            }
        }

        int selectedNumber = Messages.readInt("X: ");

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
