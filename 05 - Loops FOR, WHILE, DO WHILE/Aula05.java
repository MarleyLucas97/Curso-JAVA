import java.util.Scanner;

public class Aula05{
    public static void main(String[] args){

        //FOR
        //cont = cont + 1
        //cont+=1
        //cont++

        /*for(int cont=0 ; cont < 5 ; cont++){
            System.out.println("CFB Cursos");
        }*/

        /*for(int cont=5 ; cont>0 ; cont--){
            System.out.println(cont + " - CFB Cursos");
        }*/

        //WHILE
        //utilizado quando nao souber de antemao quantas vezes sera 
        //necessario executar o comando
        /*Scanner leia=new Scanner(System.in);

        System.out.println("Digite a quantidade de repeticoes: ");
        int max=leia.nextInt();
        
        int cont=0;
        while(cont<max){
            System.out.println(cont + " - CFB Cursos");
            cont++;
        }*/

        //DO WHILE
        //utilizado quando o comando precisa ser executado 
        //ao menos uma vez

        int cont=0;
        do{ 
            System.out.println(cont + " - CFB Cursos");
            cont++;
        }while(cont<0);
        
        System.out.println("Fim do programa...");
    }
}