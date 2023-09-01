import java.util.Arrays;

public class Aula30c {
    public static void main(String[] args) {
        int[] num1={0,1,2,3,4,5,6,7,8,9};
        int[] num2={9,5,0,7,4,2,6,3,1,8};
        int[] num3={0,1,2,3,4,5,6,7,8,9};
        int[] num4={10,4,7,23,4,10,8,0,4,9};
        int[] num5=new int[10];

        //metodo equals para comparacao de arrays...
        System.out.printf("Num1 igual num 2: %s%n",Arrays.equals(num1,num2) ? "Igual" : "Diferente");
    }
}
