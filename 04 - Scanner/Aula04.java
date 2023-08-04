import java.util.Scanner;

public class Aula04{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);

        int n1=0, n2=0, n3=0, n4=0, soma=0;
        final int media = 60;
        String nome="", res="";

        System.out.println("Digite o nome do aluno: ");
        nome=leia.nextLine();
        System.out.println("Digite a primeira nota: ");
        n1=leia.nextInt();
        System.out.println("Digite a segunda nota: ");
        n2=leia.nextInt();
        System.out.println("Digite a terceira nota: ");
        n3=leia.nextInt();
        System.out.println("Digite a quarta nota: ");
        n4=leia.nextInt();
        
        soma=n1+n2+n3+n4;

        if(soma>=media){
            res="aprovado";
        }else if(soma>=40){
            res="para a recuperacao";
        }else{
            res="reprovado";
        }
        System.out.printf("O aluno %s foi %s, a soma das notas deu %d.",nome,res,soma);
    }
}