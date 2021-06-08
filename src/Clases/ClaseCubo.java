package Clases;

public class ClaseCubo {

    int alto;
    int ancho;
    int profundo;

    public ClaseCubo(int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    public ClaseCubo() {
        System.out.println("INGRES LOS VALORES");
    }

    public int volumen() {
        int vol = this.alto * this.ancho * this.profundo;
        return vol;
    }
}
