import java.util.Scanner;
public class Aula26 {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);

        final int numeroPerguntas=5;
        String nome;
        String[] perguntas={
            "Qual o primeiro planeta do sistema solar? ",
            "Qual o resultado de 15/3? ",
            "Qual e a ultima letra do alfabeto? ",
            "Onde fica Berlim? ",
            "Qual a moeda oficial do Brasil hoje? "
            };
        String[] alternativas={
            "a)Marte    b)Jupiter   c)Mercurio",
            "a)5    b)10    c)3",
            "a)A    b)W     c)Z",
            "a)Alemanha     b)Paris     c)Suica",
            "a)Dolar    b)Pesos     c)Real"
            };
        char[] gabarito={'c','a','c','a','c'};
        char[] respostas=new char[numeroPerguntas];
        char resp;
        int nota=0, pontoQuestao=2;

        System.out.print("Digite seu nome: ");
        nome=leia.nextLine();

        for(int i=0;i<numeroPerguntas;i++){
            System.out.println("-------------------------------------");
            System.out.printf("Pergunta %d%n", i+1);
            System.out.printf("%s%n", perguntas[i]);
            System.out.printf("%s%n", alternativas[i]);
            resp=leia.nextLine().charAt(0);
            respostas[i]=resp;
        }
        System.out.printf("%s%n","Fim da prova, confira o resultado: ");
        for(int i=0;i<numeroPerguntas;i++){
            if(respostas[i]==gabarito[i]){
                nota+=pontoQuestao;
            }
        }
        System.out.printf("%s, sua nota foi %d. Voce foi %s.",nome,nota,nota>=6 ? "Aprovado" : "Reprovado");
    }
}