package grafo;

import java.util.ArrayList;

public class Grafo {

    ArrayList<Vertice> vertices;

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

    public void deleteArista(int pos) {
        vertices.remove(pos);
    }

    public void print() {
        for (Vertice temp : vertices) {
            temp.print();
        }
    }
}
