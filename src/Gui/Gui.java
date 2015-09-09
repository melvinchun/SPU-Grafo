/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import grafo.Arista;
import grafo.Grafo;
import grafo.Vertice;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Gui extends javax.swing.JFrame {

    public Gui() throws IOException {
        this.setUndecorated(true);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        this.setVisible(true);
        initComponents();
        mapa = new Grafo();
        menu.setBackground(Color.BLACK);
        opciones.setBackground(Color.BLACK);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int x = (int) tk.getScreenSize().getWidth();
        int y = (int) tk.getScreenSize().getHeight();
        BufferedImage bi = ImageIO.read(new File("./src/Imagenes/fondo.png"));
        Image img = Toolkit.getDefaultToolkit().createImage(bi.getSource()).getScaledInstance(x, y, 0);
        panel.setIcon(new ImageIcon(img));
        panel.setLocation(0, 0);
        panel.setBackground(Color.black);
        panel.setSize(x, y);
        panel2.setLocation(2 * x / 5, y / 4);
        panel2.setOpaque(false);
        this.setSize(x, y);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new javax.swing.JPanel();
        b_cargar = new javax.swing.JButton();
        panel = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        opciones = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        b_cargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prueba.png"))); // NOI18N
        b_cargar.setBorderPainted(false);
        b_cargar.setContentAreaFilled(false);
        b_cargar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prueba2.png"))); // NOI18N
        b_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_cargar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_cargar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panel2);
        panel2.setBounds(210, 40, 220, 90);
        getContentPane().add(panel);
        panel.setBounds(120, 90, 0, 0);

        opciones.setBackground(new java.awt.Color(0, 0, 0));
        opciones.setBorder(null);
        opciones.setText("Opciones");
        opciones.setContentAreaFilled(false);
        opciones.setFocusable(false);

        jMenuItem1.setText("jMenuItem1");
        opciones.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        opciones.add(jMenuItem2);

        menu.add(opciones);

        setJMenuBar(menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cargarActionPerformed
        leer(cargar());
        mapa.print();
    }//GEN-LAST:event_b_cargarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Gui().setVisible(true);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public File cargar() {
        try {
            this.setAlwaysOnTop(false);
            JFileChooser jfc = new JFileChooser();
            FileFilter filtro = new FileNameExtensionFilter("MAPAS", "chun");
            jfc.setFileFilter(filtro);
            File archivo = null;
            int op = jfc.showOpenDialog(null);
            if (op == JFileChooser.APPROVE_OPTION) {
                archivo = jfc.getSelectedFile();
            }
            return archivo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Formato invalido", "ERROR", 2);
            return null;
        }
    }

    public void leer(File archivo) {
        Scanner sc = null;
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                String planeta = sc.next();
                planeta = planeta.replaceAll("\n", "");
                int peso = sc.nextInt();
                String destino = sc.next();
                //System.out.println(planeta + " " + peso + " " + destino);
                crearGrafo(planeta, peso, destino);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Formato Invalido", "ERROR", 2);

        }
    }

    public void crearGrafo(String nombre, int peso, String destino) {
        boolean nuevo = true;
        boolean nuevo2 = true;
        Vertice temp1=null;
        Vertice temp2=null;
        try {
            //Busqueda de Existencia
            for (Vertice temp : mapa.getVertices()) {
                if (nombre.equals(temp.getNombre())) {
                    nuevo = false;
                    temp1=temp;
                }
                if (destino.equals(temp.getNombre())) {
                    nuevo2 = false;
                    temp2=temp;
                }
            }
            //Creacion
            if (nuevo&&nuevo2) {
                Vertice v=new Vertice(nombre);
                Vertice d=new Vertice(destino);
                v.addArista(new Arista(d,peso));
                mapa.addVertice(v);
                mapa.addVertice(d);
            }else if(nuevo){
                Vertice v=new Vertice(nombre);
                v.addArista(new Arista(temp2,peso));
                mapa.addVertice(v);
            }else if(nuevo2){
                Vertice d=new Vertice(destino);
                temp1.addArista(new Arista(d,peso));
                mapa.addVertice(d);
            }else{
                if(!temp1.getNombre().equals(temp2.getNombre()))
                    temp1.addArista(new Arista(temp2,peso));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al crear el grafo", "ERROR", 2);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cargar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu opciones;
    private javax.swing.JLabel panel;
    private javax.swing.JPanel panel2;
    // End of variables declaration//GEN-END:variables
Grafo mapa;
}
