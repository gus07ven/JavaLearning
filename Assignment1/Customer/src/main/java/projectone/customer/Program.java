/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectone.customer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Program {

    public static String fetchData() throws IOException {

        StringBuilder data = new StringBuilder();

        try {
            URL url = new URL("https://www.w3schools.com/angular/customers.php");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed: HTTP error code: " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String output;
            while ((output = br.readLine()) != null) {
                data.append(output);
            }
            conn.disconnect();
        } catch (MalformedURLException MalUrl) {

            System.out.println("URL error");
        } catch (IOException e) {

            System.out.println("IO Error");
        }
        return data.toString();
    }

    public void gsonToJava() throws IOException, NullPointerException {
        String input = fetchData();
        Gson gson = new GsonBuilder().create();
        Records r = gson.fromJson(input, Records.class);
        for (Customer s : r.getRecords()) {
            System.out.println(s.toString());
        }
    }

    public static void main(String[] args) throws IOException {
        Program program = new Program();
        program.gsonToJava();
    }
}