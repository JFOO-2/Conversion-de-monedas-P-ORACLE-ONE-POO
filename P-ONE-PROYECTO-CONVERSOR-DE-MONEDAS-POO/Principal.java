import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        var t = new Scanner(System.in);
        String opcion = "";
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
        System.out.println("Proceso finalizado, gracias por usar nuetro servicio");

    }
}
