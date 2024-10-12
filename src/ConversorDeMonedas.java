import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorDeMonedas {
        public ResultadoConversion cambiarMoneda(String monedaOrigen,String monedaObjetivo,double amount){
            URI direccion=URI.create("https://v6.exchangerate-api.com/v6/7285b13821e086ae0c838edc/pair/"+monedaOrigen+"/"+monedaObjetivo+"/"+String.valueOf(amount));

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(direccion)
                    .build();
            try {
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                return new Gson().fromJson(response.body(), ResultadoConversion.class);
            } catch (Exception e) {
                throw new RuntimeException("no encontramos ese valor");
            }

        }
    }

