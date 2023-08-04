import java.util.Scanner;

public class Aula05{
    public static void main(String[] args){

        //FOR
        //cont = cont + 1
        //cont+=1
        //cont++

        //WHILE
        //utilizado quando nao souber de antemao quantas vezes sera 
        //necessario executar o comando

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