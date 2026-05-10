/**
 * Classe que representa un llibre.
 * @author Cristian
 * @version 1.0
 */

public class Llibre {

    private String titol;
    private String autor;
    private boolean prestat;

    public Llibre(String titol, String autor) {
        this.titol = titol;
        this.autor = autor;
        this.prestat = false;
    }

    public String getTitol() {
        return titol;
    }

    public String getAutor() {
        return autor;
    }

    public boolean esPrestat() {
        return prestat;
    }

    /**
     * Marca el llibre com prestat.
     */
    public void prestar() {
        prestat = true;
    }

    public void retornar() {
        prestat = false;
    }

    @Override
    public String toString() {

        if (prestat) {
            return titol + " - " + autor + " (Prestat)";
        } else {
            return titol + " - " + autor + " (Disponible)";
        }
    }
}
