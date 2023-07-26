import java.util.Arrays;

public class Aula07e {
     public static void main(String[] args){

        final int tam=10;
        int[] num={9,2,7,1,8,5,3,4,0,6};
        int[] numeros=new int[tam];
        int p=4;
        int pos;

        //binary search busca o elemento e verifica se ele esta na posicao mas exige que esteja na ordem
        //por algum motivo foi necessario criar mais uma variavel e ordenar 
        //os numeros da Array para que o binary search encontrasse o elemento na posicao
        //Ele retorna a posicao em positivo, se for negativo ele nao esta no array...
        Arrays.sort(num);
        pos=Arrays.binarySearch(num, p);
        System.out.printf("O elemento %d esta no Array? %s, esta na posicao %d",p, pos > 0 ? "Sim" : "Nao", pos);
    }
}
