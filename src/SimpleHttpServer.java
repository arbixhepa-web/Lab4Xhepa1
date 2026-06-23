import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
/**
 * Project: Lab 4
 * Purpose Details: Sends Pizza JSON to Web Service
 * Course: IST
 * Author: Arbi Xhepa
 * Date Developed: 06/14/2026
 * Last Date Changed: 06/14/2026
 * Rev: 1.0
 */

public class SimpleHttpServer {

    public static void main(String[] args) throws Exception {

        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        server.createContext("/pizza", new PizzaHandler());

        server.setExecutor(null);
        server.start();

        System.out.println("Server started on port 8000");
    }

    static class PizzaHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            if (!exchange.getRequestMethod().equalsIgnoreCase("POST")) {
                String response = "Only POST allowed";
                exchange.sendResponseHeaders(405, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
                return;
            }

            try {
                InputStream is = exchange.getRequestBody();

                ObjectMapper mapper = new ObjectMapper();
                Pizza pizza = mapper.readValue(is, Pizza.class);

                System.out.println("PIZZA RECEIVED");
                System.out.println("Customer: " + pizza.getCustomerName());
                System.out.println("Size: " + pizza.getSize());
                System.out.println("Toppings: " + pizza.getToppings());
                System.out.println("Price: " + pizza.getPrice());

                String response = "OK";

                exchange.sendResponseHeaders(200, response.length());
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();

            } catch (Exception e) {
                e.printStackTrace();

                String response = "ERROR";
                exchange.sendResponseHeaders(500, response.length());

                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();
            }
        }
    }
}