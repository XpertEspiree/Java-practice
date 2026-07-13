import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpExchange;
import java.net.InetSocketAddress;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class Backend {
    public static void main(String[] args) throws Exception {

        // Step 1: Create a server that listens on port 8080
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        // Step 2: Define what happens when someone calls "/login"
        server.createContext("/login", (HttpExchange exchange) -> {

            // Read the data sent from the frontend
            InputStream is = exchange.getRequestBody();
            String body = new String(is.readAllBytes(), StandardCharsets.UTF_8);

            // Print it so YOU can see it arrive
            System.out.println("Received from frontend: " + body);

            // Send a response back to the frontend
            String response = "Server got your data!";
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        });

        // Step 3: Start the server
        server.setExecutor(null);
        server.start();
        System.out.println("Backend running at http://localhost:8080");
    }
}