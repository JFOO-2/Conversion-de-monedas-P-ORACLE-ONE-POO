import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class Principal {

    public static void main(String[] args) throws IOException, InterruptedException {
        
        String urlApi = "https://v6.exchangerate-api.com/v6/92e3a1c050624b43759343a0/pair/USD/MXN";

        // Class HttpRequest
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create(urlApi))
              .build();

              // Interface HttpResponse<T>

              HttpResponse<String> response = client
              .send(request, BodyHandlers.ofString()); 


              String json = response.body();
              System.out.println(json);
              
    }
}