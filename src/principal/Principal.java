package principal;

import model.ConsultaDeMoneda;
import model.ConvertirMoneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        ConsultaDeMoneda consulta = new ConsultaDeMoneda();
        int opcion= -1;
        while (opcion != 0){
            System.out.println("**********************************\n" +
                    "Bienvenido al Conversor de Moneda\n\n" +
                    "Ingresa la opción de la conversión que deseas realizar\n\n" +
                    "1. Dolar a Peso Mexicano\n" +
                    "2. Peso Mexicano a Dolar\n" +
                    "3. Dolar a Real Brasileiro\n" +
                    "4. Real Brasileiro a Dolar\n" +
                    "5. Dolar a Peso Colombiano\n" +
                    "6. Peso colombiano a Dolar\n" +
                    "0. Salir\n");
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD","MXN", consulta, teclado);
                    break;
                case 2:
                    ConvertirMoneda.convertir("MXN","USD", consulta, teclado);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD","BRL", consulta, teclado);
                    break;
                case 4:
                    ConvertirMoneda.convertir("BRL","USD", consulta, teclado);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD","COP", consulta, teclado);
                    break;
                case 6:
                    ConvertirMoneda.convertir("COP","USD", consulta, teclado);
                    break;
                case 0:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
