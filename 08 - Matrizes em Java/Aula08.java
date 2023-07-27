import java.security.SecureRandom;
public class Aula08{
    public static void main(String[] args){
        //a matriz seria um array dentro de outro array

        final int linhas=3;
        final int colunas=5;
        int[][] numeros=new int[linhas][colunas];

        for(int l=0;l<linhas;l++){
            for(int c=0; c<colunas;c++){
                numeros[l][c]=new SecureRandom().nextInt(100);
            }
        }
        for(int l=0;l<linhas;l++){
            for(int c=0;c<colunas;c++){
                //vc pode usar o %2d para limitar a quantidade de numerais
                //a serem imprimidos...
                System.out.printf("%d ", numeros[l][c]);
            }
            System.out.printf("%n");
        }
    }
}