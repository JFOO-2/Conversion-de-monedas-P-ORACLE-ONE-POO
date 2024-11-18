import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class ImportAPI {

    DatosRequeridosApi conversor (String divisa, String divisaConvertir, double DineroAConvertir) throws IOException, InterruptedException {

        String urlApi = "https://v6.exchangerate-api.com/v6/92e3a1c050624b43759343a0/pair/"+divisa+"/"+divisaConvertir+"/"+DineroAConvertir;

        // Class HttpRequest
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create(urlApi)) // implementacion de API
              .build();

              // Interface HttpResponse<T>

              HttpResponse<String> response = client
              .send(request, BodyHandlers.ofString()); 


             // String json = response.body();
              //System.out.println(json);

        return new Gson().fromJson(response.body(), DatosRequeridosApi.class);


              
    }

    //Estas importaciones incluyen las clases necesarias para manejar solicitudes HTTP y para deserializar JSON usando la biblioteca Gson.

   /*
   El método conversor realiza lo siguiente:

    Construye una URL para la API de tipo de cambio utilizando los parámetros proporcionados.

    Crea una solicitud HTTP y la envía utilizando HttpClient.

    Obtiene la respuesta de la API y deserializa el JSON en una instancia de DatosRequeridosApi utilizando Gson.

    Devuelve la instancia de DatosRequeridosApi con los datos de la conversión.
    */


}