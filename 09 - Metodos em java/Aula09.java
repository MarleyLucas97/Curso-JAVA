//metodos sao as funcoes da classe...
public class Aula09{
    //metodo main:
    public static void main(String[] args){
        //estrutura do metodo: modificador de acesso, tipo de retorno
        //o nome e o conjunto de parametros desse metodo.
        //*Dentro dos parenteses tem um array de strings chamada args*/

        //*para o metodo canal ser chamado e necessario chama-lo no principal */
        //voce pode chamar quantas vezes for preciso
        for(int i=0;i<5;i++){
        canal();
        }
    }
    //* public eu tenho acesso a esse metodo fora da classe, posso
    //acessar os objetos desse metodo fora da classe.
    //* private so pode ser acessado dentro da propria classe.
    //* Se um metodo for static todos tem que ser tambem.
    //* O retorno void significa que nao vai ser retornado nada
    //podem ser retornados um objeto, um float, um boolean e etc...
    //* O nome do metodo.
    //* Entrada de argumentos desse metodo.

    public static void canal(){
        System.out.println("CFB Cursos");
    }
}