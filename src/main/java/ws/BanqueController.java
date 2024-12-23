package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueController {

    @WebMethod(operationName = "conversionEuroToDh")
    public double conversion(@WebParam(name = "montant") double mt){
        return new BanqueService().conversion(mt);
    }
    @WebMethod(operationName = "getCompteByCode")
    public  Compte getCompte(@WebParam(name = "code") int code){
        return new BanqueService().getCompte(code);
    }
    @WebMethod(operationName = "listComptes")
    public List<Compte> listComptes(){
        return new BanqueService().listComptes();
    }
}
