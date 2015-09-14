package grafo;

import java.util.ArrayList;

public class Grafo {

    private ArrayList<Vertice> vertices;

    public Grafo() {
        this.vertices = new ArrayList();
    }

    public ArrayList<Vertice> getVertices() {
        return vertices;
    }

    public void setVertices(ArrayList<Vertice> vertices) {
        this.vertices = vertices;
    }

    public void addVertice(Vertice nueva) {
        vertices.add(nueva);
    }

    public void deleteVertice(int pos) {
        boolean borrado = false;
        for (Vertice temporal : vertices) {
            int cont = 0;
            for (Arista temporal1 : temporal.getAristas()) {
                if (temporal1.getDestino().getNombre().equals(vertices.get(pos).getNombre())) {
                    borrado = true;
                    break;
                }
                cont++;
            }
            if (borrado) {
                temporal.deleteArista(cont);
                borrado = false;
            }

        }
        vertices.remove(pos);
    }

    public void print() {
        for (Vertice temp : vertices) {
            temp.print();
        }
    }
}
