package handsON;

import java.lang.Math;

public class Exercicio02 {
    public static void main(String[] args) {

        //Valore de entrada em grau
        double lat1 = 25;
        double lon1 = 35;
        double lat2 = 35.5;
        double lon2 = 25.5;

        //Raio da terra em km
        double raio = 6371.01;

        // convertendo graus para radianos
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);
        lon1 = Math.toRadians(lon1);
        lon2 = Math.toRadians(lon2);


        double distancia = raio * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));

        System.out.println("A distancia entre os pontos informados serao de " + distancia+" Km");
    }
}
