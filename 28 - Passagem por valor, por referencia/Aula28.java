import java.util.Scanner;

public class Aula28 {

    public static void main(String[] args) {
        //toda passagem e por valor, menos os arrays...
        int[] notas={10,85,62,45,98,78,88,60,67,82};
        int[] res={0,0};

        conferir(notas, res);
        System.out.printf("Aprovados: %d%n", res[0]);
        System.out.printf("Reprovados: %d%n", res[1]);
    }

    public static void conferir(int[] n, int[] r){
        for(int x:n){
            if(x>60){
                r[0]++;
            }else{
                r[1]++;
            }
        }

        
    }
}