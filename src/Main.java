//Número positivo, negativo o neutro.
public class Main {
    public static void main(String[] args) {

        int numero = 0;
        if (numero > 0)
            System.out.println("Es positivo");
        else if (numero < 0)
            System.out.println("Es negativo");
        else if (numero == 0) {
            System.out.println("Es neutro");
        }

        //Bucle While y Do While

        int numeroWhile = 1;

        do {
                System.out.println(numeroWhile);
                numeroWhile = numeroWhile + 1;
            } while (numeroWhile < 3);
        numeroWhile = numeroWhile + 1;


        //Bucle For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1){
            System.out.println(numeroFor);
        }
        //Bucle Switch
        var Estación = "INVIERNO";
        switch (Estación){
            case "VERANO":
            System.out.println("Es verano");
            break;
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
              break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Estoy en default");

        }
        }

    }






