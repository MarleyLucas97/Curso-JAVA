import java.util.Scanner;

public class Aula26b{
    public static void main(String[] args){
        Scanner leia=new Scanner(System.in);

        String nome;
        char resp;
        int nota=0, ponto=2;
        final int numeroPerguntas=5;
        String[] perguntas={
            "Qual a primeira letra do alfabeto? ",
            "Qual o maior astro do sistema solar? ",
            "Quanto e 2x10? ",
            "Qual o valor de PI?",
            "O Fantastico Mundo de ___. (Desenho dos anos 80)"
            };
        String[] alternativas={
            "a)A    b)Z     c)W",
            "a)Marte    b)Jupter    c)Sol",
            "a)10       b)20       c)30",
            "a)3    b)3.14      c)3.10",
            "a)Bob      b)Zac       c)Joe"
            };
        char[] gabarito={'a','c','b','b','a'};
        char[] respostas=new char[numeroPerguntas];

        System.out.println("Digite seu nome: ");
        nome=leia.nextLine();

        for(int i=0;i<numeroPerguntas;i++){
            System.out.printf("-----------------------------------%n");
            System.out.printf("Pergunta %d%n", i+1);
            System.out.printf("%s%n", perguntas[i]);
            System.out.printf("%s%n", alternativas[i]);
            resp=leia.nextLine().charAt(0);
            respostas[i]=resp;
        }

        System.out.printf("%s%n", "Fim da prova, confira o resultado: ");
        
        for(int i=0;i<numeroPerguntas;i++){
            if(gabarito[i]==respostas[i]){
                nota+=ponto;
            }
        }

        System.out.printf("%s, sua nota foi %d. Voce foi %s.", nome, nota, nota>=6 ? "Aprovado" : "Reprovado");
    }
}