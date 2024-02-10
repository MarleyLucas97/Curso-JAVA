// "Confie no SENHOR de todo coração, não dependa do seu próprio entendimento." -Provérbios, 3 : 5
// "Deus abeçoe este código e quem vier a lê-lo." -Marley de Lucas, 25/01/2024 14:33

import java.util.ArrayList;

public class Aula36b {
    public static void main(String[] args) {
        
        ArrayList<String> carros = new ArrayList<>();

        carros.add("HRV");
        carros.add("Polo");
        carros.add("Cruze");
        carros.add("Argo");
        carros.add("Fusion");

        //Aqui vemos o método 'get' para impressão de um dado específico na posição 'um'.
        System.out.println(carros.get(1));
    }
}
