package grafo;

import java.util.ArrayList;

public class Vertice {
    ArrayList <Arista> aristas;

    public Vertice() {
        this.aristas = new ArrayList();
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
}
