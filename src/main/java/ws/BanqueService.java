package ws;

import java.util.Date;
import java.util.List;

public class BanqueService implements IBanqueService {

    @Override
    public double conversion(double mt) {
        return  mt*10.5;
    }

    @Override
    public Compte getCompte(int code) {
        return new Compte(code, 1000+Math.random()*9000 + 12, new Date());

    }

    @Override
    public List<Compte> listComptes() {
        return List.of(
                new Compte(1, 1000+Math.random()*9000 +12, new Date()),
                new Compte(2, 1000+Math.random()*9000 +12, new Date()),
                new Compte(3, 1000+Math.random()*9000 +12, new Date())
        );
    }
}
