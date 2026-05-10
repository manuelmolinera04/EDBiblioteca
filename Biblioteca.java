/**
 * Classe que gestiona llibres i usuaris de la biblioteca.
 * @author Daniel
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Llibre> llibres;
    private List<Usuari> usuaris;

    public Biblioteca() {
        this.llibres = new ArrayList<>();
        this.usuaris = new ArrayList<>();
    }

    /**
     * Afegeix un llibre a la biblioteca.
     * @param llibre llibre a afegir
     */
    public void afegirLlibre(Llibre llibre) {
        llibres.add(llibre);
    }

    public void eliminarLlibre(Llibre llibre) {
        llibres.remove(llibre);
    }

    /**
     * Afegeix un usuari a la biblioteca.
     * @param usuari usuari a afegir
     */
    public void afegirUsuari(Usuari usuari) {
        usuaris.add(usuari);
    }

    /**
     * Cerca un usuari pel nom.
     * @param nom nom de l'usuari
     * @return usuari trobat o null
     */
    public Usuari buscarUsuari(String nom) {

        for (Usuari usuari : usuaris) {

            if (usuari.getNom().equalsIgnoreCase(nom)) {
                return usuari;
            }
        }

        return null;
    }

    /**
     * Cerca un llibre pel títol.
     * @param titol títol del llibre
     * @return llibre trobat o null
     */
    public Llibre buscarLlibre(String titol) {

        for (Llibre llibre : llibres) {

            if (llibre.getTitol().equalsIgnoreCase(titol)) {
                return llibre;
            }
        }

        return null;
    }

    public void mostrarLlibres() {

        if (llibres.isEmpty()) {

            System.out.println("No hi ha llibres a la biblioteca");

        } else {

            System.out.println("Llista de llibres:");

            for (Llibre llibre : llibres) {
                System.out.println("- " + llibre.getTitol());
            }
        }
    }

    public List<Llibre> getLlibres() {
        return llibres;
    }

    public List<Usuari> getUsuaris() {
        return usuaris;
    }
}
