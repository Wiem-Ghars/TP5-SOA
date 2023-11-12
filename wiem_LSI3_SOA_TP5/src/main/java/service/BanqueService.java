package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;
import java.util.Date;
import java.util.List;
@WebService(name = "Banque")
public class BanqueService {
    @WebMethod(operationName = "conv")
    public double conversion(@WebParam(name = "m") double montant)
    {return montant*3.3;}
    @WebMethod(operationName = "gc")
    public Compte getCompte(@WebParam(name = "c") int code)
    {return new Compte(code, Math.random()*9888,new Date());}

    @WebMethod(operationName = "gcs")
    public List<Compte> getComptes(){
        return List.of(
                new Compte(1,0, new Date()),
                new Compte(2,0, new Date()),
                new Compte(3,0, new Date())
        );
    }
}
