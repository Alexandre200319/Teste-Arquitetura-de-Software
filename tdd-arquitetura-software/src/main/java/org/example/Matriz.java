package org.example;

public class Matriz {

    public static int[][] somaMatrizes(int[][] matriz1, int[][] matriz2){
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            // Se as dimensões das matrizes forem diferentes, retorna null
            System.out.println("As matrizes têm dimensões diferentes.");
            return null;
        }

        int linhas = matriz1.length;
        int colunas = matriz1[0].length;

        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    };
    public static int[][] subtracaoMatrizes(int[][] matriz1, int[][] matriz2) {
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) {
            System.out.println("As matrizes têm dimensões diferentes.");
            return null;
        }

        int linhas = matriz1.length;
        int colunas = matriz1[0].length;

        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }

        return resultado;
    }

    public static int[][] multiplicacaoMatrizes(int[][] matriz1, int[][] matriz2) {
        if (matriz1[0].length != matriz2.length) {
            System.out.println("Número de colunas da primeira matriz não é igual ao número de linhas da segunda matriz.");
            return null;
        }

        int linhas = matriz1.length;
        int colunas = matriz2[0].length;
        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return resultado;
    }

    public static int[][] multiplicacaoPorEscalar(int[][] matriz, int escalar) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = matriz[i][j] * escalar;
            }
        }

        return resultado;
    }

    public static int[][] transposicaoMatriz(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[][] resultado = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[j][i] = matriz[i][j];
            }
        }

        return resultado;
    }
}
