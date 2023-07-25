public class Aula06 {
    public static void main(String[] args) {
        //Ao inves de criar varias variaveis se cria um array
        // e muda somente o indice

        final int tam=5;
        
        int[] num=new int[tam];
        int[] numeros={40,50,60,70,80, 90, 100};

        //Sempre se inicia no 0, logo 
        //posicao 3 significa 4a posicao e etc...

        num[0] = 10;
        num[1] = 15;
        num[2] = 20;
        num[3] = 25;
        num[4] = 30;

        //System.out.printf("%d", num[4]);
        //System.out.printf("%d", numeros[1]);

        for(int i=0;i<numeros.length;i++){
            System.out.printf("%d - ", numeros[i]);
        }

    }
}
