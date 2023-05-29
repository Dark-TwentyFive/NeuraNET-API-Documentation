import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        String apiKey = "your_api_key_here"; // Replace with your actual NeuraNET API key
        String message = "Hello NeuraNET!";

        try {
            // URL encode the message
            String encodedMessage = URLEncoder.encode(message, StandardCharsets.UTF_8.toString());

            // Create the URL for the API request
            String urlString = "https://neuranet-api.dark9015.repl.co/api/" + apiKey + "/" + encodedMessage;
            URL url = new URL(urlString);

            // Send the HTTP GET request
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Read the response
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String response = reader.readLine();

            // Print the response
            System.out.println("Response from NeuraNET: " + response);

            // Close the connection
            reader.close();
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
