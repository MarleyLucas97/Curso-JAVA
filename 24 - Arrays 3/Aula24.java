public class Aula24 {

    public static void main(String[] args) {
        final int tamanho=7;

        int[] num=new int[tamanho];
        num[0]=52;
        num[1]=100;
        num[2]=3;
        num[3]=15;
        num[4]=527;
        num[5]=112;
        num[6]=79;

        for(int i=0 ; i<tamanho ; i++){
        System.out.printf("%d - ", num[i]);
        }

        for(int n:num){
            System.out.printf("%n%d", n);
        }
    }
}