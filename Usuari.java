/**
 * Classe que representa un usuari de la biblioteca.
 * @author Daniel
 * @version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class Usuari {

    private String nom;
    private int id;
    private List<Llibre> llibresPrestats;

    public Usuari(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.llibresPrestats = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public List<Llibre> getLlibresPrestats() {
        return llibresPrestats;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Afegeix un llibre prestat a l'usuari.
     * @param llibre llibre prestat
     */
    public void afegirLlibre(Llibre llibre) {
        llibresPrestats.add(llibre);
    }

    public void retornarLlibre(Llibre llibre) {
        llibresPrestats.remove(llibre);
    }

    public void llistarLlibres() {

        if (llibresPrestats.isEmpty()) {

            System.out.println("L'usuari no té llibres prestats");

        } else {

            System.out.println("Llibres prestats per " + nom + ":");

            for (Llibre llibre : llibresPrestats) {
                System.out.println("- " + llibre.getTitol());
            }
        }
    }

    @Override
    public String toString() {
        return "Usuari{id=" + id + ", nom='" + nom + "', llibres prestats=" + llibresPrestats.size() + "}";
    }
}
