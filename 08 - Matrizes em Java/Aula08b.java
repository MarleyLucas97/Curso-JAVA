public class Aula08b {
    public static void main(String[] args) {
        
        final int linhas=3;
        final int colunas=5;
        int[][] numeros=new int[linhas][colunas];
        //esse e o modelo para especificar os numerais da matriz...
        int[][] num={{12,1,5,6,6},{7,7,7,52,33},{9,9,8,4,5}};
        
    for(int[] n:num){
        for(int v:n){
            System.out.printf("%d ",v);
        }
        System.out.printf("%n");
        }
    } 
}
