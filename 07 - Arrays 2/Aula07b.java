import java.util.Arrays;

public class Aula07b {
    public static void main(String[] args){

        final int tam=10;
        int[] num={9,2,7,1,8,5,3,4,0,6};
        int[] numeros=new int[tam];

        //esse metodo preenche o array numeros com o valor indicado
        Arrays.fill(numeros,10);

        for(int n:numeros){
            System.out.printf("%d - ", n);
        }

    }   
}
