import java.util.Arrays;

public class Aula07d {
    public static void main(String[] args){

        final int tam=10;
        int[] num={9,2,7,1,8,5,3,4,0,6};
        int[] numeros=new int[tam];

        //checa se os arrays sao iguals e retorna em booleano
        //true or false

        //System.arraycopy(num, 0, numeros, 0, tam);
        
        System.out.printf("Arrays sao iguais:%s", Arrays.equals(num, numeros) ? "Sim" : "Nao");

    }   
}
