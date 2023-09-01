import java.util.Arrays;

public class Aula30d {
    public static void main(String[] args) {
        int[] num1={0,1,2,3,4,5,6,7,8,9};
        int[] num2={9,5,0,7,4,2,6,3,1,8};
        int[] num3={0,1,2,3,4,5,6,7,8,9};
        int[] num4={10,4,7,23,4,10,8,0,4,9};
        int[] num5=new int[10];

        //metodo binarySearch serve para buscar um elemento dentro de um array...
        //se o elemento nao existir ele retorna um valor negativo...
        int valor=100;
        int pos=Arrays.binarySearch(num1, valor);
        System.out.printf("%d esta no array? %s - posicao: %d%n",valor,pos>-1 ? "Sim" : "Nao", pos);
        
    }
}
