package grafo;

import java.util.ArrayList;

public class Vertice {

    private int x;
    private int y;
    private int q;
    private String nombre;
    private ArrayList<Arista> aristas;
    private int area[];

    public Vertice(String nombre) {
        this.nombre = nombre;
        this.aristas = new ArrayList();
        x = 0;
        y = 0;
        q = 0;
        area = new int[4];
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public int[] getArea() {
        return area;
    }

    public void setArea(int x1, int x2, int y1, int y2) {
        this.area[0] = x1;
        this.area[1] = x2;
        this.area[2] = y1;
        this.area[3] = y2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Arista> getAristas() {
        return aristas;
    }

    public void setAristas(ArrayList<Arista> aristas) {
        this.aristas = aristas;
    }

    public void addArista(Arista nueva) {
        aristas.add(nueva);
    }

    public void deleteArista(int pos) {
        aristas.remove(pos);
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean hasArista() {
        if (aristas.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        System.out.println(nombre);
        for (Arista temp : aristas) {
            System.out.print("\t" + temp.toString());
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return nombre;
    }

}
