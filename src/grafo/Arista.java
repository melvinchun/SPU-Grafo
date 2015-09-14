package grafo;

public class Arista {

    private Vertice destino;
    private int peso;

    public Arista(Vertice destino, int peso) {
        this.destino = destino;
        this.peso = peso;
    }

    public Arista() {
        this.destino = null;
        this.peso = -1;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Destino: " + destino + ", peso: " + peso;
    }

}
