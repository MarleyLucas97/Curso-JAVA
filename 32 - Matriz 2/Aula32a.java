import java.security.SecureRandom;

public class Aula32a {
    public static void main(String[] args) {
        final int linhas=3;
        final int colunas=5;
        int[][] numero = new int[linhas][colunas];

        geraDados(numero, linhas, colunas);
        
        impDados(numero, linhas, colunas);
    }

    public static void geraDados(int[][] mtz, int linha, int coluna){
         //for que percorre as linhas...
         for(int l=0;l<linha;l++){
            //for que percorre as colunas...
            for(int c=0;c<coluna;c++){
                mtz[l][c] = new SecureRandom().nextInt(100);
            }
        }
    }

    public static void impDados(int[][] mtz, int linha, int coluna){
        for(int l=0;l<linha;l++){
            for(int c=0;c<coluna;c++){
                System.out.printf("%d - ", mtz[l][c]);
            }
            System.out.printf("%n");
        }
    }
}

