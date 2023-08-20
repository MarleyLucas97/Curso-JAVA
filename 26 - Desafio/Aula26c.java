import java.util.Scanner;

public class Aula26c{
    public static void main(String[] args){
        Scanner leia=new Scanner(System.in);

        String nome;
        int nota=0, ponto=2;
        final int numPerguntas=5;
        char resp;
        String[] perguntas={
            "Primeira Questao",
            "Segunda questao",
            "Terceira questao",
            "Quarta questao",
            "Quinta questao"
        };
        String[] alternativas={
            "a)     b)      c)",
            "a)     b)      c)",
            "a)     b)      c)",
            "a)     b)      c)",
            "a)     b)      c)"
        };
        char[] gabarito={'a','b','c','a','b'};
        char[] respostas=new char[numPerguntas];

        System.out.println("Digite seu nome: ");
        nome=leia.nextLine();

        for(int i=0;i<numPerguntas;i++){
            System.out.printf("----------------------------%n");
            System.out.printf("Pergunta %d%n", i+1);
            System.out.printf("%s%n", perguntas[i]);
            System.out.printf("%s%n", alternativas[i]);
            resp=leia.nextLine().charAt(0);
            respostas[i]=resp;
        }

        for(int i=0;i<numPerguntas;i++){
            if(gabarito[i]==respostas[i]){
                nota+=ponto;
            }
        }
        System.out.printf("Fim da prova, confira o resultado: %n");
        System.out.printf("%s, sua nota foi %d. Voce foi %s.",nome,nota,nota>=6 ? "Aprovado" : "Reprovado");
    }
}