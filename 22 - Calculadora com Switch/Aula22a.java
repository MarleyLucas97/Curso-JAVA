import java.util.Scanner;

public class Aula22a{
    public static void main(String[] args){
        Scanner leia= new Scanner(System.in);

        int n1=0, n2=0, res=0, pos=1, opc=0;
        int mec=1;
        do{
        do{System.out.printf("Bem vindo a Calculadora!%nDigite a Operacao desejada:%n1-Soma    2-Subtracao     3-Multiplicacao     4-Divisao%n");
        opc=leia.nextInt();}while(pos<=0||pos>=5);
        System.out.printf("Digite o primeiro numero:%n");
        n1=leia.nextInt();
        System.out.printf("Digite o segundo numero:%n");
        n2=leia.nextInt();

        switch(opc){
            case 1 :
            res=n1+n2; 
            System.out.printf("A soma de %d com %d e %d%n",n1,n2,res);
            break;
            case 2 : 
            res=n1-n2;  
            System.out.printf("A subtracao de %d com %d e %d%n",n1,n2,res);
            break;
            case 3 : 
            res=n1*n2; 
            System.out.printf("A multiplicacao de %d com %d e %d%n",n1,n2,res);
            break;
            case 4 : 
            res=n1/n2; 
            System.out.printf("A divisao de %d com %d e %d%n",n1,n2,res);
            break;
        }
        System.out.printf("Deseja fazer outra opecacao?%n1-s 2-n%n");
        mec=leia.nextInt();
        }while(mec==1);
        System.out.println("Fim do programa...");
    }
}