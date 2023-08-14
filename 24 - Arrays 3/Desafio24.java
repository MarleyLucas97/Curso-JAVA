public class Desafio24 {
    public static void main(String[] args) {
        final int tamanho=5;
        int[] num=new int[tamanho];

        num[0]=52;
        num[1]=100;
        num[2]=3;
        num[3]=15;
        num[4]=527;

        for(int i=4 ; i<=tamanho; i--){
            System.out.printf("%d%n", num[i]);
        }
    }
}
