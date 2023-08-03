public class Switch {
    public static void main(String[] args) {
        
        //aplicacao do SWITCH
        //altere a posicao no codigo...
        int posicao=7;

        switch(posicao){
            case 1:
                System.out.println("Primeiro Lugar");
                break;
            case 2:
                System.out.println("Segundo Lugar");
                break;
            case 3:
                System.out.println("Terceiro Lugar");
                break;
            case 4: case 5: case 6:
                System.out.println("Premio de participacao");
                break;
            default:
                System.out.println("Nao ganhou premio");
                break;                
        }
    }
    
}
