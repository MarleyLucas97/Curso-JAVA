import java.util.Scanner;

public class Aula27a {
    public static void main(String[] args) {
        int[] numeros={10,5,15,20,100,25,14,8,3,98,75,62};

        parimpar(numeros);
    }
    
    public static void parimpar(int[] num){
        for(int n:num){
            String res;
                if(n%2==0){ 
                    res="par";
                }else{
                    res="impar";    
                }
            System.out.printf("%d:%s%n",n,res);
        }
    }
}
