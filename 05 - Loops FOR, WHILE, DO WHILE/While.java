import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a quantidade de repeticoes: ");
        int max=leia.nextInt();

        int cont=0;
        while(cont<max){
            System.out.println(cont + " - CFB Cursos");
            cont++;
        }
    }
}
