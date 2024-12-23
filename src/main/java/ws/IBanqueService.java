package ws;

import java.util.List;

public interface IBanqueService {

    double conversion(double mt);

    Compte getCompte(int code);

    List<Compte> listComptes();
}
