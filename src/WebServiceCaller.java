import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Project: Lab 4
 * Purpose Details: Sends Pizza JSON to Web Service
 * Course: IST
 * Author: Arbi Xhepa
 * Date Developed: 06/14/2026
 * Last Date Changed: 06/14/2026
 * Rev: 1.0
 */

public class WebServiceCaller {

    public static void main(String[] args) {

        try {

            // Create Pizza object (your data)
            Pizza pizza = new Pizza(
                    "Arbi Xhepa",   // your name
                    "Large",
                    "Pepperoni",
                    19.99
            );

            // Convert to JSON
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(pizza);

            // URL of server
            URL url = new URL("http://localhost:8000/pizza");

            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);

            // Send JSON
            try (OutputStream os = con.getOutputStream()) {
                os.write(json.getBytes());
                os.flush();
            }

            // Response code
            int responseCode = con.getResponseCode();
            System.out.println("Response Code: " + responseCode);

            // Read response
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream())
            );

            String line;
            StringBuilder response = new StringBuilder();

            while ((line = in.readLine()) != null) {
                response.append(line);
            }

            in.close();

            System.out.println("Response: " + response);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}