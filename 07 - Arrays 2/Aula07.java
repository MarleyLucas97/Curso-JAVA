import java.util.Scanner;

public class Aula07 {
    public static void main(String[] args){

        int[] num={10, 20, 30, 40, 50};

        /*for(int i=0;i<num.length; i++){
            System.out.printf("%d - ", num[i]);
        }*/

        //Este for simplificado e feito para otimizar a 
        //leitura dos elementos de um array
        for(int n:num){
            System.out.printf("%d - ", n);
        }
    }
}
