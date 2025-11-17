import java.util.Scanner;

public class ConvertirMoneda {

    public static void convertir (String monedaOrigen, String monedaDestino, ConsultaMoneda consultar, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consultar.buscaMoneda(monedaOrigen, monedaDestino);
        System.out.println("La tasa de conversion para hoy\n1"+monedaOrigen+"="+monedas.conversion_rate()+" "+monedaDestino);
        System.out.println("Ingresa la cantidad "+monedaOrigen);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaOrigen + "=" + cantidadConvertida+" "+ monedaDestino);
    }
}