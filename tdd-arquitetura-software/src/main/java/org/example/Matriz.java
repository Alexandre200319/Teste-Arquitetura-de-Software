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
    public static int[][] subtracaoMatrizes(int[][] matriz1, int[][] matriz2){
        return null;
    };
    public static int[][] multiplicacaoMatrizes(int[][] matriz1, int[][] matriz2){
        return null;
    };
    public static int[][] multiplicacaoPorEscalar(int[][] matriz1, int[][] matriz2){
        return null;
    };
    public static int[][] transposicaoMatriz(int[][] matriz1, int[][] matriz2){
        return null;
    };
}
