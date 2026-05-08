import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        GestorBiblioteca gestor = new GestorBiblioteca();
        Scanner teclat = new Scanner(System.in);
        
        biblioteca.afegirLlibre(new Llibre("1984", "George Orwell"));
        biblioteca.afegirLlibre(new Llibre("El petit princep", "Antoine de Saint-Exupéry"));

        int opcio = 0;

        while (opcio != 5) {
            System.out.println("\n--- SISTEMA DE GESTIÓ DE BIBLIOTECA ---");
            System.out.println("1. Llistar llibres");
            System.out.println("2. Cercar llibre");
            System.out.println("3. Realitzar un préstec");
            System.out.println("4. Consultar historial d'un usuari");
            System.out.println("5. Sortir");
            System.out.print("Selecciona una opció: ");
            
            opcio = teclat.nextInt();
            teclat.nextLine();

            if (opcio == 1) {
                System.out.println("\n--- LLISTAT DE LLIBRES ---");
                for (Llibre l : biblioteca.getLlibres()) {
                    System.out.println(l);
                }
            } 
            else if (opcio == 2) {
                System.out.print("Introdueix el títol a cercar: ");
                String cerca = teclat.nextLine();
                Llibre trobat = biblioteca.buscarLlibre(cerca);
                if (trobat != null) {
                    System.out.println("Llibre trobat: " + trobat);
                } else {
                    System.out.println("No s'ha trobat cap llibre.");
                }
            } 
            else if (opcio == 3) {
                System.out.print("Nom de l'usuari: ");
                String nomU = teclat.nextLine();
                System.out.print("Títol del llibre: ");
                String titolL = teclat.nextLine();
                
                Usuari u = biblioteca.buscarUsuari(nomU);
                Llibre l = biblioteca.buscarLlibre(titolL);
                
                if (u != null && l != null) {
                    gestor.prestarLlibre(u, l);
                } else {
                    System.out.println("Error: Usuari o llibre no trobat.");
                }
            } 
            else if (opcio == 4) {
                System.out.print("Introdueix el nom de l'usuari: ");
                String nomU = teclat.nextLine();
                Usuari u = biblioteca.buscarUsuari(nomU);
                if (u != null) {
                    u.llistarLlibres();
                } else {
                    System.out.println("Usuari no trobat.");
                }
            } 
            else if (opcio == 5) {
                System.out.println("Sortint del sistema.");
            } 
            else {
                System.out.println("Opció no vàlida.");
            }
        }
        teclat.close();
    }
}
}
