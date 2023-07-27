import java.security.SecureRandom;
public class Aula08a {
    public static void main(string[] args){
        final int linhas=3;
        final int colunas=5;
        int[][] numeros=new int[linhas][colunas];

        for(int l=0;l<linhas;l++){
            for(int c=0; c<colunas;c++){
                numeros[l][c]=new SecureRandom().nextInt(100);
            }
        }
        //modelo de somente impressao dos dados das matrizes...
        for(int[] n:numeros){
            for(int v:n){
                System.out.printf("%d ",v);
            }
            System.out.printf("%n");
        }

    }
}
