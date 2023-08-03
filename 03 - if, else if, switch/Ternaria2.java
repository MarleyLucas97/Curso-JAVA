public class Ternaria2 {
    public static void main(String[] args) {
        //operacao ternaria com exemplo em numeros...
        int nota=8, media=7;
        int resultado;

        resultado=(nota>=media ? 0 : 1);
        System.out.println("Resultado: " + (resultado==0?"Aprovado":"Reprovado"));
    }
}
