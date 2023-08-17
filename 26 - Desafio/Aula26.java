//Quebrado ainda...
import java.util.Scanner;

public class Aula26 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        String nome="";
        String[] usuario=new String[5];
        String[] respostas={"a","c","b","a","c"};
        int gabarito=0;
        
        System.out.println("Digite seu nome: ");
        nome=leia.nextLine();
        System.out.println("-----------------------------");

        System.out.println("Pergunta 1");
        System.out.println("Qual o maior astro do nosso sistema solar? ");
        System.out.println("a)Sol   b)Lua   c)Marte");
        usuario[0]=leia.nextLine();
        System.out.println("-----------------------------");
        
        System.out.println("Pergunta 2");
        System.out.println("Qual a primeira letra do nosso alfabeto?");
        System.out.println("a)Z     b)C     c)A");
        usuario[1]=leia.nextLine();
        System.out.println("-----------------------------");
        
        System.out.println("Pergunta 3");
        System.out.println("2x10 e igual a?");
        System.out.println("a)10    b)20    c12");
        usuario[2]=leia.nextLine();
        System.out.println("-----------------------------");
        
        System.out.println("Pergunta 4");
        System.out.println("O Fantastico Mundo de ___. (Desenho dos anos 80)");
        System.out.println("a)Bob   b)Zec   c)Joe");
        usuario[3]=leia.nextLine();
        System.out.println("-----------------------------");
        
        System.out.println("Pergunta 5");
        System.out.println("Qual o valor de PI?");
        System.out.println("a)3.10      b)3     c)3.14");
        usuario[4]=leia.nextLine();
        System.out.println("-----------------------------");

        System.out.println("Fim da prova, confira o resultado: ");

        if(usuario[0]==respostas[0]){
            gabarito+=2;
        }
        if(usuario[1]==respostas[1]){
            gabarito+=2;
        }
        if(usuario[2]==respostas[2]){
            gabarito+=2;
        }
        if(usuario[3]==respostas[3]){
            gabarito+=2;
        }
        if(usuario[4]==respostas[4]){
            gabarito+=2;
        }
        if(gabarito==10){
            System.out.printf("%s voce tirou nota 10, voce foi perfeito!", nome);
        }else if(gabarito==8){
            System.out.printf("%s voce tirou nota 8, voce foi muito bem!", nome);
        }else if(gabarito==6){
            System.out.printf("%s voce tirou nota 6, voce foi bem!", nome);
        }else if(gabarito==4){
            System.out.printf("%s voce tirou nota 4.", nome);
        }else if(gabarito==2){
            System.out.printf("%s voce tirou nota 2.", nome);
        }else{
            System.out.printf("%s voce tirou nota 0.", nome);
        }
    }
}