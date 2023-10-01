import java.security.SecureRandom;

public class Aula32 {
    public static void main(String[] args) {
        
        //matriz e um array de duas dimensoes...
        int[][] numeros = new int[3][5];
        final int linhas=3;
        final int colunas=5;
        int[][] numeros2 = new int[linhas][colunas];

        //for que percorre as linhas...
        for(int l=0;l<linhas;l++){
            //for que percorre as colunas...
            for(int c=0;c<colunas;c++){
                numeros2[l][c] = new SecureRandom().nextInt(100);
            }
        }

         for(int l=0;l<linhas;l++){
            for(int c=0;c<colunas;c++){
                System.out.printf("%d - ",numeros2[l][c]);
            }
            System.out.printf("%n");
        }
    }
    
}