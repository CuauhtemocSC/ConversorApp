import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int opcion=0;
        while (opcion!=7){
            System.out.println("**********************\n"+
                    "Bienvenidos al conversor de monedas\n\n"+
                    "Ingrese la consulta de desea realizar\n\n"+
                    "1. Peso Mexicano a peso Dolar USA\n"+
                    "2. Dolar USA a Peso Mexicano\n"+
                    "3. Peso Mexicano a Dolar Canadiense\n"+
                    "4. Dolar Canadiense a Peso Mexicano\n"+
                    "5. Peso Mexicano a Euro\n"+
                    "6. Euro a Peso Mexicano\n"+
                    "7. Salir");
            opcion= lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    ConvertirMoneda.convertir("MXN","USD",consulta, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("USD","MXN", consulta, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("MXN","CAD", consulta, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("CAD","MXN", consulta, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("MXN","EUR", consulta, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("EUR","MXN", consulta, lectura);
                    break;
                case 7:
                    System.out.println("Aplicación finalizada. ");
                    break;


                default:
                    System.out.println("Opcion no valida!");
                    break;
            }
        }

    }
}