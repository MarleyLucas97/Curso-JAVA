import java.util.Scanner;
public class Aula06a {
    public static void main(String[] args) {

        final int tam=5;
        
        char[] gabarito={'a','a','d','b','c'};
        char[] respostas=new char[tam];
        int nota=0;
        Scanner leia=new Scanner(System.in);

        /*respostas[0]='a';
        respostas[1]='b';
        respostas[2]='c';
        respostas[3]='b';
        respostas[4]='c';*/

        for(int i=0; i<gabarito.length; i++){
            System.out.printf("Informe a resposta: %d", i);
            respostas[i]=leia.nextLine().charAt(0);
        }
        for(int i=0; i<gabarito.length; i++){
            if(respostas[i]==gabarito[i]){
                nota++;
            }
        }
        System.out.printf("%nNota do Aluno: %d", nota);
    }
}
