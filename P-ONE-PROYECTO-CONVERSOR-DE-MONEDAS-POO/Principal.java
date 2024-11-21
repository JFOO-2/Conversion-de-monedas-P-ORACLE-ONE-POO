import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        var t = new Scanner(System.in);
        String opcion = "";

        String instrucciones = """
                Bienbenido al conversosr de monedas:
                ----------------------------------------------------------------
                Instrucciones:
                *Proporcionar un código de moneda de tres letras
                    (para moneda Origen y Destino)
                    Ejemplo:
                    ORIGEN: MXN, DESTINO: USD
                    
                * Colocar el valor que desea convertir a la moneda Destino
                
                ---------------------------------------------------------------
                ***** Si no conoce el codigo de 3 digitos de las monedas
                      a convertir favor de investigarlas ****************
                """;

        System.out.println(instrucciones);
        try {
            while (!opcion.equalsIgnoreCase("no")) {
                // Instanceo la Api
                ImportAPI datosDeApi = new ImportAPI();
                // Instanceo la entrada de datos del usuario
                DatosInUsuario datosDeUsuario = new DatosInUsuario();
                // Llamo al metodo datosentradausuario que contiene los valores de los setters
                datosDeUsuario.datosEntradaUsuario();
        /*Lanzo record, Toma el valor de la instacia la clase ImportAPI (que llama
        a el Constructor de record implementando al metodo conversor
         */

                DatosRequeridosApi datosParaIniciarConversorApi = datosDeApi.conversor(
                        datosDeUsuario.getDivisa(),
                        datosDeUsuario.getDivisaAConvertir(),
                        datosDeUsuario.getValorAConvertir()
                );

                System.out.println(datosParaIniciarConversorApi);

                System.out.println("Quiere hacer otra conversion: ");
                opcion = t.next();
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error vuelve a intentar");
        }
        System.out.println("Proceso finalizado, gracias por usar nuetro servicio");

    }
}
