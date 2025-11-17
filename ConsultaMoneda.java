import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public Monedas buscaMoneda (String monedaOrigen, String monedaDestino){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/874f45d81e98cac8bf170371/pair/"+monedaOrigen+"/"+monedaDestino);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Monedas.class);
        } catch (Exception e) {
            throw new RuntimeException("No seleccionó una opción válida.");
        }

    }
}
