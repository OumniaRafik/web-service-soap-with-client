package server;

import jakarta.xml.ws.Endpoint;
import ws.BanqueController;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://localhost:1997/";
        Endpoint.publish(url, new BanqueController());
        System.out.println("Web service déployé sur "+url);
    }
}
