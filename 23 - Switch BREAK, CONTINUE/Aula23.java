import java.util.Scanner;

public class Aula23 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n1=0,n2=0,res=0;
        String op="";

        System.out.println("Bem vindo a Calculadora...");
        System.out.println("Digite a operacao desejada: ");
        System.out.printf("+ Soma%n- Subtracao%n* Multiplicacao%n/ Divisao%n");
        op = leia.nextLine();

        System.out.println("Digite o primeiro numero: ");
        n1 = leia.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = leia.nextInt();        
        

        switch(op){
            case "+":
                res=n1+n2;
                System.out.printf("Resultado da Soma de %d com %d e igual a %d%n",n1,n2,res);
                break;
            case "-":
                res=n1-n2;
                System.out.printf("Resultado da Subtracao de %d com %d e igual a %d%n",n2,n2,res);
                break;
            case "*":
                res=n1*n2;
                System.out.printf("Resultado da Multiplicacao de %d com %d e igual a %d%n",n2,n2,res);
                break;
            case "/":
                res=n1/n2;
                System.out.printf("Resultado da Divisao de %d com %d e igual a %d%n",n2,n2,res);
                break;
            default:
                System.out.printf("Operacao invalida...%n");
                break;
            }
        System.out.println("Fim do programa...");
    }
}
