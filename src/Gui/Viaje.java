/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.util.ArrayList;

/**
 *
 * @author Brenda
 */
public class Viaje {

    private ArrayList<String> path;
    private ArrayList<Integer> coste;

    public Viaje(ArrayList<String> path, ArrayList<Integer> coste) {
        this.path = path;
        this.coste = coste;
    }

    public Viaje(String inicio) {
        this.path = new ArrayList();
        this.coste = new ArrayList();
        path.add(inicio);
    }

    public ArrayList<String> getPath() {
        return path;
    }

    public void setPath(ArrayList<String> path) {
        this.path = path;
    }

    public void addPath(String s) {
        path.add(s);
    }

    public int getCoste() {
        if (coste.size() > 0) {
            int total = 0;
            for (int i = 0; i < coste.size(); i++) {
                total += coste.get(i);
            }
            return total;
        } else {
            return -1;
        }
    }

    public void addG(int g) {
        this.coste.add(g);
    }

    public boolean buscar(String v) {
        boolean retorno = true;
        for (int i = 0; i < path.size(); i++) {
            if (path.get(i).equals(v)) {
                retorno = false;
            }
        }
        return retorno;
    }

    public String[] ToString() {
        String m[] = new String[2];
        m[0] = "";
        for (int i = 0; i < path.size(); i++) {
            m[0] += "-" + path.get(i);
        }
        m[1] = "\nCon coste de " + getCoste();
        return m;
    }

    public void delete() {
        try {
            this.finalize();
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String toString() {
        String m = "";
        for (int i = 0; i < path.size(); i++) {
            m += "-" + path.get(i);
        }
        return m + "\n coste de: " + getCoste();
    }

    public Viaje clonar() {
        ArrayList<String> pathtemp = new ArrayList();
        ArrayList<Integer> gtemp = new ArrayList();
        for (int i = 0; i < path.size(); i++) {
            pathtemp.add(path.get(i));
        }
        for (int i = 0; i < coste.size(); i++) {
            gtemp.add(coste.get(i));
        }
        return new Viaje(pathtemp, gtemp);
    }

    public void warp() {
        int pos[] = new int[2];
        pos[0] = 0;
        if (coste.size() > 2) {
            for (int i = 0; i < coste.size(); i++) {
                if (coste.get(i) > pos[0]) {
                    pos[0] = coste.get(i);
                    pos[1] = i;
                }
            }
            coste.remove(pos[1]);
            pos[0] = 0;
            for (int i = 0; i < coste.size(); i++) {
                if (coste.get(i) > pos[0]) {
                    pos[0] = coste.get(i);
                    pos[1] = i;
                }
            }
            coste.remove(pos[1]);
        } else {
            coste = new ArrayList();
            coste.add(0);
        }
    }
}
