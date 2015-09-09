package grafo;

import java.util.ArrayList;

public class Vertice {
    private String nombre;
    private ArrayList <Arista> aristas;
    
    public Vertice(String nombre) {
        this.nombre=nombre;
        this.aristas = new ArrayList();
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
    
    public void addArista(Arista nueva){
        aristas.add(nueva);
    }
    
    public void deleteArista(int pos){
        aristas.remove(pos);
    }
    
    public void print(){
        System.out.println(nombre);
        for (Arista temp : aristas) {
            System.out.print("\t"+temp.toString());
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Vertice " + "nombre= " + nombre;
    }
    
}
