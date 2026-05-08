import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Llibre> llibres;

    public Biblioteca() {
        this.llibres = new ArrayList<>();
    }

    public void afegirLlibre(Llibre llibre) {
        llibres.add(llibre);
    }

    public void eliminarLlibre(Llibre llibre) {
        llibres.remove(llibre);
    }

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
}
