import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        int n1=0, n2=0, res=0;
        String nome="";

        System.out.println("Digite seu nome: ");
        nome=leia.nextLine();
        System.out.println("Digite um numero: ");
        n1=leia.nextInt();
        System.out.println("Digite outro numero: ");
        n2=leia.nextInt();

        res=n1+n2;

        System.out.printf("%s, a soma de %d com %d e igual a %d.",nome, n1, n2, res);
    }
}
