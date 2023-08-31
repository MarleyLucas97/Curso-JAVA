import java.util.Scanner;
public class Aula29a {
    public static void main(String[] args) {
        int[] valores={10,15,5,3,1};
        int res=soma(valores);
        System.out.printf("%d",res);
    }
    public static int soma(int[] n){
        int res=0;
        for(int v:n){
            res+=v;
        }
        return res;
    }
}
