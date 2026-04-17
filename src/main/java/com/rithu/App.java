package com.rithu;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;

public class App {
    public static void main(String[] args) throws IOException {

        HttpServer server = HttpServer.create(new InetSocketAddress(8081), 0);
        server.createContext("/", exchange -> {
            String response = "Hello DevOps 🚀";
            byte[] responseBytes = response.getBytes();

            exchange.sendResponseHeaders(200, responseBytes.length);

            OutputStream os = exchange.getResponseBody();
            os.write(responseBytes);
            os.close();
        });

        server.start();
        System.out.println("Server started on port 8081");
    }
}
