import java.util.Arrays;

public class Aula30a {
    public static void main(String[] args) {
        int[] num={9,5,0,7,4,2,6,3,1,8};

        //metodo fill preenche os arrays com o valor indicado...
        Arrays.fill(num,10);

        for(int n:num){
            System.out.printf("%d - ",n);
        }
    }
}
