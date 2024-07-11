package model;

import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaOrigen, String monedaFinal, ConsultaDeMoneda consulta, Scanner teclado){
        double cantidad;
        double cantidadConvertida;
        Monedas monedas = consulta.buscarMoneda(monedaOrigen, monedaFinal);
        System.out.println("La tasa de conversion para hoy: " + monedaOrigen+ " = " +monedas.conversion_rate()+ " " + monedaFinal);
        System.out.println("Ingrese la cantidad de " +monedaOrigen+ ":");
        cantidad = Double.parseDouble(teclado.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+ " " +monedaOrigen+ " = " + cantidadConvertida + " " + monedas.target_code());
    }
}
