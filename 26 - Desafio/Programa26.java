import java.util.Scanner;

public class Programa26 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        final int numPerguntas=5;
        int pontoQuestao=2;

        char[] gabarito={'a','c','b','a','c'};
        String[] perguntas={
            "Qual o maior astro do nosso sistema solar? ",
            "Qual a primeira letra do nosso alfabeto? ",
            "2x10 e igual a? ",
            "O Fantastico Mundo de ___. (Desenho dos anos 80) ",
            "Qual o valor de PI? "
            };
        String[] alternativas={
            "a)Sol   b)Lua   c)Marte",
            "a)Z     b)C     c)A",
            "a)10    b)20    c12",
            "a)Bob   b)Zec   c)Joe",
            "a)3.10      b)3     c)3.14"
            };
        char[] respostas=new char[numPerguntas];
        char resp;
        int nota=0;
        String aluno;
        
        System.out.print("Digite seu nome: ");
        aluno=leia.nextLine();

        for(int i=0;i<numPerguntas;i++){
            System.out.println("-----------------------------");
            System.out.printf("Pergunta %d%n",i+1);
            System.out.printf("%s%n", perguntas[i]);
            System.out.printf("%s%n", alternativas[i]);
            resp=leia.nextLine().charAt(0);
            respostas[i]=resp;
        }
        System.out.printf("%s%n","Fim da prova, confira o resultado: ");
        for(int i=0;i<numPerguntas;i++){
            if(respostas[i]==gabarito[i]){
                nota+=pontoQuestao;
            }
        }
        System.out.printf("%s sua nota foi %d, voce foi %s",aluno,nota,nota>=6 ? "Aprovado" : "reprovado");
    }
}
