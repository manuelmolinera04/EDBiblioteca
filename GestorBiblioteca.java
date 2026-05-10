/**
 * Classe que gestiona els préstecs de la biblioteca.
 * @author Manel
 * @version 1.0
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorBiblioteca {

    private List<Prestec> prestecs;

    public GestorBiblioteca() {
        this.prestecs = new ArrayList<>();
    }

    /**
     * Realitza el préstec d'un llibre.
     * @param usuari usuari que rep el llibre
     * @param llibre llibre prestat
     */
    public void prestarLlibre(Usuari usuari, Llibre llibre) {

        if (!llibre.esPrestat()) {
            llibre.prestar();
            Prestec prestec = new Prestec(usuari, llibre, LocalDate.now());
            prestecs.add(prestec);
            usuari.afegirLlibre(llibre);
            System.out.println(usuari.getNom() + " ha agafat el llibre: " + llibre.getTitol());

        } else {
            System.out.println("Aquest llibre ja està prestat.");
        }
    }
}
