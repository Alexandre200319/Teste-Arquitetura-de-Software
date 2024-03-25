import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MinhaClasseTest {

    private int[][] matriz1;
    private int[][] matriz2;

    @Before
    public void setUp() {
        matriz1 = new int[][]{{1, 2}, {3, 4}};
        matriz2 = new int[][]{{5, 6}, {7, 8}};
    }

    @Test
    public void testSomaMatrizes() {
        int[][] resultadoEsperado = {{6, 8}, {10, 12}};
        int[][] resultado = MinhaClasse.somaMatrizes(matriz1, matriz2);
        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSubtracaoMatrizes() {
        int[][] resultadoEsperado = {{-4, -4}, {-4, -4}};
        int[][] resultado = MinhaClasse.subtracaoMatrizes(matriz1, matriz2);
        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testMultiplicacaoMatrizes() {
        int[][] resultadoEsperado = {{19, 22}, {43, 50}};
        int[][] resultado = MinhaClasse.multiplicacaoMatrizes(matriz1, matriz2);
        assertArrayEquals(resultadoEsperado, resultado);
    }
    @Test
    public void testMultiplicacaoPorEscalar() {
        int[][] matriz = {{1, 2}, {3, 4}};
        int[][] resultadoEsperado = {{2, 4}, {6, 8}};
        int[][] resultado = MinhaClasse.multiplicacaoPorEscalar(matriz, 2);
        assertArrayEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testTransposicaoMatriz() {
        int[][] matriz = {{1, 2}, {3, 4}, {5, 6}};
        int[][] resultadoEsperado = {{1, 3, 5}, {2, 4, 6}};
        int[][] resultado = MinhaClasse.transposicaoMatriz(matriz);
        assertArrayEquals(resultadoEsperado, resultado);
    }
}
