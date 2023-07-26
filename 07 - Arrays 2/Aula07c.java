import java.util.Arrays;

public class Aula07c {
    public static void main(String[] args){

        final int tam=10;
        int[] num={9,2,7,1,8,5,3,4,0,6};
        int[] numeros=new int[tam];

        //esse metodo copia o array a partir de qualquer 
        //posicao e quantidade que for necessario para
        //outro array
        //sendo indicado o array a ser copiado, a posicao de inicio,
        //o array a ser gravado a posicao do array a ser gravado e 
        //a quantidade de informacoes 
        System.arraycopy(num, 0, numeros, 0, tam);

        for(int n:numeros){
            System.out.printf("%d - ", n);
        }

    }   
    
}
