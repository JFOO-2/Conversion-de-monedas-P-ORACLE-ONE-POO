import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

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

    }
}
