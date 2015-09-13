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
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
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
        menu1.setLocation(3 * x / 9, y / 9);
        menu1.setOpaque(false);
        this.setSize(x, y);
        image_mapa.setVisible(false);
        b_iniciar.setVisible(false);
        menu2.setVisible(false);
        inicio = new int[2];
        destino = new int[2];
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menupop = new javax.swing.JPopupMenu();
        Eliminar = new javax.swing.JMenuItem();
        Modificar = new javax.swing.JMenuItem();
        menupop2 = new javax.swing.JPopupMenu();
        agregar = new javax.swing.JMenuItem();
        agregarv = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        nombre = new javax.swing.JTextField();
        aristas = new javax.swing.JComboBox();
        agregar_arista = new javax.swing.JButton();
        peso = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        salvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        menu1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        b_cargar = new javax.swing.JButton();
        b_iniciar = new javax.swing.JButton();
        menu2 = new javax.swing.JPanel();
        b_viajar = new javax.swing.JButton();
        b_iniciar1 = new javax.swing.JButton();
        viaje = new javax.swing.JLabel();
        image_mapa = new javax.swing.JLabel();
        panel = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        opciones = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        menupop.add(Eliminar);

        Modificar.setText("Modificar");
        menupop.add(Modificar);

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        menupop2.add(agregar);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        nombre.setBackground(new java.awt.Color(204, 204, 204));
        nombre.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N

        aristas.setBackground(new java.awt.Color(0, 0, 0));
        aristas.setFont(new java.awt.Font("8BIT WONDER", 0, 14)); // NOI18N
        aristas.setForeground(new java.awt.Color(153, 153, 153));
        aristas.setAlignmentX(1.0F);
        aristas.setAlignmentY(1.0F);
        aristas.setMinimumSize(new java.awt.Dimension(175, 37));
        aristas.setPreferredSize(new java.awt.Dimension(165, 37));
        aristas.setSize(new java.awt.Dimension(106, 37));

        agregar_arista.setFont(new java.awt.Font("8BIT WONDER", 0, 14)); // NOI18N
        agregar_arista.setText("Agregar Arista");
        agregar_arista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_aristaActionPerformed(evt);
            }
        });

        peso.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AristAS");

        salvar.setFont(new java.awt.Font("8BIT WONDER", 0, 14)); // NOI18N
        salvar.setText("Guardar Planeta");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(agregar_arista)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(aristas, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombre)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salvar)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aristas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peso, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agregar_arista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(salvar)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout agregarvLayout = new javax.swing.GroupLayout(agregarv.getContentPane());
        agregarv.getContentPane().setLayout(agregarvLayout);
        agregarvLayout.setHorizontalGroup(
            agregarvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        agregarvLayout.setVerticalGroup(
            agregarvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N

        b_cargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/load.png"))); // NOI18N
        b_cargar.setBorderPainted(false);
        b_cargar.setContentAreaFilled(false);
        b_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cargarActionPerformed(evt);
            }
        });

        b_iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iniciar.png"))); // NOI18N
        b_iniciar.setBorderPainted(false);
        b_iniciar.setContentAreaFilled(false);
        b_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_iniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1);
        menu1.setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menu1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(menu1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b_iniciar)
                            .addComponent(b_cargar))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(b_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_iniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        getContentPane().add(menu1);
        menu1.setBounds(10, 0, 420, 600);

        b_viajar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prueba.png"))); // NOI18N
        b_viajar.setBorderPainted(false);
        b_viajar.setContentAreaFilled(false);
        b_viajar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prueba2.png"))); // NOI18N
        b_viajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_viajarActionPerformed(evt);
            }
        });

        b_iniciar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prueba.png"))); // NOI18N
        b_iniciar1.setBorderPainted(false);
        b_iniciar1.setContentAreaFilled(false);
        b_iniciar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prueba2.png"))); // NOI18N
        b_iniciar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_iniciar1ActionPerformed(evt);
            }
        });

        viaje.setBackground(new java.awt.Color(255, 255, 255));
        viaje.setFont(new java.awt.Font("8BIT WONDER", 1, 18)); // NOI18N
        viaje.setForeground(new java.awt.Color(255, 255, 255));
        viaje.setText("Seleccione su ruta de viaje ");

        javax.swing.GroupLayout menu2Layout = new javax.swing.GroupLayout(menu2);
        menu2.setLayout(menu2Layout);
        menu2Layout.setHorizontalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b_iniciar1)
                    .addComponent(viaje)
                    .addComponent(b_viajar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu2Layout.setVerticalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viaje)
                .addGap(18, 18, 18)
                .addComponent(b_viajar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_iniciar1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(menu2);
        menu2.setBounds(440, 80, 450, 270);

        image_mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/v.png"))); // NOI18N
        image_mapa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                image_mapaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                image_mapaMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image_mapaMouseClicked(evt);
            }
        });
        getContentPane().add(image_mapa);
        image_mapa.setBounds(120, 160, 700, 500);
        getContentPane().add(panel);
        panel.setBounds(120, 90, 0, 0);

        opciones.setBackground(new java.awt.Color(0, 0, 0));
        opciones.setBorder(null);
        opciones.setText("Opciones");
        opciones.setContentAreaFilled(false);
        opciones.setFocusable(false);

        jMenuItem1.setText("jMenuItem1");
        opciones.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
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
        b_iniciar.setVisible(true);
    }//GEN-LAST:event_b_cargarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void b_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_iniciarActionPerformed
        Toolkit tk = Toolkit.getDefaultToolkit();
        int x = (int) tk.getScreenSize().getWidth();
        int y = (int) tk.getScreenSize().getHeight();
        menu1.setVisible(false);
        image_mapa.setLocation(x / 23, y / 9);
        drawPlanets();
        menu2.setOpaque(false);
        menu2.setLocation(x / 23 + 800, y / 9);
        menu2.setVisible(true);
    }//GEN-LAST:event_b_iniciarActionPerformed

    private void b_viajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_viajarActionPerformed

    }//GEN-LAST:event_b_viajarActionPerformed

    private void b_iniciar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_iniciar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_iniciar1ActionPerformed

    private void image_mapaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image_mapaMouseReleased
        principio = null;
        fin = null;
        destino[0] = evt.getX();
        destino[1] = evt.getY();
        if (destino[0] > 0 && destino[1] > 0 && inicio[0] > 0 && inicio[1] > 0) {
            for (Vertice temporal : mapa.getVertices()) {
                if (inicio[0] > temporal.getArea()[0] && inicio[0] < temporal.getArea()[1] && inicio[1] > temporal.getArea()[2] && inicio[1] < temporal.getArea()[3]) {
                    principio = temporal.getNombre();
                }
                if (destino[0] > temporal.getArea()[0] && destino[0] < temporal.getArea()[1] && destino[1] > temporal.getArea()[2] && destino[1] < temporal.getArea()[3]) {
                    fin = temporal.getNombre();
                }
            }
        }
        if (principio != null && fin != null) {
            if (!principio.equals(fin)) {
                viaje.setText(principio + " a " + fin);
            }
        }

    }//GEN-LAST:event_image_mapaMouseReleased

    private void image_mapaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image_mapaMousePressed
        inicio[0] = evt.getX();
        inicio[1] = evt.getY();
    }//GEN-LAST:event_image_mapaMousePressed

    private void image_mapaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image_mapaMouseClicked
        boolean x = false;
        boolean y = false;
        boolean z = true;
        if (evt.isMetaDown()) {
            for (Vertice temporal : mapa.getVertices()) {
                if (evt.getX() > temporal.getArea()[0] && evt.getX() < temporal.getArea()[1] && evt.getY() > temporal.getArea()[2] && evt.getY() < temporal.getArea()[3]) {
                    menupop.show(evt.getComponent(), evt.getX(), evt.getY());
                    z = false;
                }
            }
            if (z) {
                menupop2.show(evt.getComponent(), evt.getX(), evt.getY());
            }

        }
    }//GEN-LAST:event_image_mapaMouseClicked

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int cont = 0;
        for (Vertice temporal : mapa.getVertices()) {
            if (inicio[0] > temporal.getArea()[0] && inicio[0] < temporal.getArea()[1] && inicio[1] > temporal.getArea()[2] && inicio[1] < temporal.getArea()[3]) {
                break;
            }
            cont++;
        }
        mapa.deleteVertice(cont);
        drawPlanets();
    }//GEN-LAST:event_EliminarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        if (mapa.getVertices().size() < 9) {
            aristas_temp = new ArrayList();
            Toolkit tk = Toolkit.getDefaultToolkit();
            int x = (int) tk.getScreenSize().getWidth();
            int y = (int) tk.getScreenSize().getHeight();
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            for (Vertice temporal : mapa.getVertices()) {
                model.addElement(temporal.getNombre());
            }
            aristas.setModel(model);
            agregarv.pack();
            agregarv.setModal(true);
            agregarv.setLocationRelativeTo(this);
            agregarv.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Su mapa ya esta lleno", "ERROR", 2);
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void agregar_aristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_aristaActionPerformed
        if (mapa.getVertices().size() < 9) {
            String ar = aristas.getSelectedItem().toString();
            int pes = (int) peso.getValue();
            Vertice temp = null;
            System.out.println(ar);
            for (Vertice temporal : mapa.getVertices()) {
                if (temporal.getNombre().equals(ar)) {
                    temp = temporal;
                }
            }
            System.out.println("");
            if (temp != null) {
                Arista a = new Arista(temp, pes);
                aristas_temp.add(a);
            }
            aristas.setSelectedIndex(0);
            peso.setValue(0);
        } else {
            JOptionPane.showMessageDialog(this, "Su mapa ya esta lleno", "ERROR", 2);
        }

    }//GEN-LAST:event_agregar_aristaActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        if (mapa.getVertices().size() < 9) {
            Vertice v = new Vertice(nombre.getText().toUpperCase());
            v.setAristas(aristas_temp);
            aristas_temp = null;
            mapa.addVertice(v);
            drawPlanets();
            nombre.setText("");
            agregarv.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Su mapa ya esta lleno", "ERROR", 2);
        }
    }//GEN-LAST:event_salvarActionPerformed

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
            JOptionPane.showMessageDialog(this, "Error al cargar el archivo", "ERROR", 2);
            return null;
        }
    }

    public void leer(File archivo) {
        Scanner sc = null;
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext() && mapa.getVertices().size() <= 9) {
                String planeta = sc.next();
                planeta = planeta.replaceAll("\n", "");
                planeta = planeta.toUpperCase();
                int peso = sc.nextInt();
                String destino = sc.next();
                destino = destino.toUpperCase();
                crearGrafo(planeta, peso, destino);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Formato Invalido", "ERROR", 2);

        }
    }

    public void crearGrafo(String nombre, int peso, String destino) {
        boolean nuevo = true;
        boolean nuevo2 = true;
        Vertice temp1 = null;
        Vertice temp2 = null;
        try {
            //Busqueda de Existencia
            for (Vertice temp : mapa.getVertices()) {
                if (nombre.equals(temp.getNombre())) {
                    nuevo = false;
                    temp1 = temp;
                }
                if (destino.equals(temp.getNombre())) {
                    nuevo2 = false;
                    temp2 = temp;
                }
            }
            //Creacion
            if (nuevo && nuevo2) {
                Vertice v = new Vertice(nombre);
                Vertice d = new Vertice(destino);
                v.addArista(new Arista(d, peso));
                mapa.addVertice(v);
                mapa.addVertice(d);
            } else if (nuevo) {
                Vertice v = new Vertice(nombre);
                v.addArista(new Arista(temp2, peso));
                mapa.addVertice(v);
            } else if (nuevo2) {
                Vertice d = new Vertice(destino);
                temp1.addArista(new Arista(d, peso));
                mapa.addVertice(d);
            } else {
                if (!temp1.getNombre().equals(temp2.getNombre())) {
                    temp1.addArista(new Arista(temp2, peso));
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al crear el grafo", "ERROR", 2);

        }
    }

    public void drawPlanets() {
        try {

            int conteo = 0;
            map = ImageIO.read(new File("./src/Imagenes/v.png"));
            Graphics2D g = map.createGraphics();
            BufferedImage temp = null;
            Vertice v = null;
            for (Vertice temporal : mapa.getVertices()) {
                if (temporal.getNombre().equals("MERCURIO")) {
                    temp = ImageIO.read(new File("./src/Imagenes/1.png"));
                    v = temporal;
                } else if (temporal.getNombre().equals("VENUS")) {
                    temp = ImageIO.read(new File("./src/Imagenes/2.png"));
                    v = temporal;
                } else if (temporal.getNombre().equals("TIERRA")) {
                    temp = ImageIO.read(new File("./src/Imagenes/3.png"));
                    v = temporal;
                } else if (temporal.getNombre().equals("MARTE")) {
                    temp = ImageIO.read(new File("./src/Imagenes/4.png"));
                    v = temporal;
                } else if (temporal.getNombre().equals("JUPITER")) {
                    temp = ImageIO.read(new File("./src/Imagenes/5.png"));
                    v = temporal;
                } else if (temporal.getNombre().equals("SATURNO")) {
                    temp = ImageIO.read(new File("./src/Imagenes/6.png"));
                    v = temporal;
                } else if (temporal.getNombre().equals("URANO")) {
                    temp = ImageIO.read(new File("./src/Imagenes/7.png"));
                    v = temporal;
                } else if (temporal.getNombre().equals("NEPTUNO")) {
                    temp = ImageIO.read(new File("./src/Imagenes/8.png"));
                    v = temporal;
                } else if (temporal.getNombre().equals("PLUTON")) {
                    temp = ImageIO.read(new File("./src/Imagenes/9.png"));
                    v = temporal;
                } else {
                    Random r = new Random();
                    temp = ImageIO.read(new File("./src/Imagenes/" + (r.nextInt(5) + 10) + ".png"));
                    v = temporal;
                }
                if (conteo == 0) {
                    g.drawImage(temp, null, 150, 50);
                    map.setRGB(150 + temp.getWidth() / 2, 50 + temp.getHeight() / 2, Color.WHITE.getRGB());
                    v.setArea(150, 150 + temp.getWidth(), 50, 50 + temp.getHeight());
                    v.setLocation(150 + temp.getWidth() / 2, 50 + temp.getHeight() / 2);

                } else if (conteo == 1) {
                    g.drawImage(temp, null, 300, 50);
                    map.setRGB(300 + temp.getWidth() / 2, 50 + temp.getHeight() / 2, Color.WHITE.getRGB());
                    v.setArea(300, 300 + temp.getWidth(), 50, 50 + temp.getHeight());
                    v.setLocation(300 + temp.getWidth() / 2, 50 + temp.getHeight() / 2);

                } else if (conteo == 2) {
                    g.drawImage(temp, null, 450, 50);
                    map.setRGB(450 + temp.getWidth() / 2, 50 + temp.getHeight() / 2, Color.WHITE.getRGB());
                    v.setArea(450, 450 + temp.getWidth(), 50, 50 + temp.getHeight());
                    v.setLocation(450 + temp.getWidth() / 2, 50 + temp.getHeight() / 2);

                } else if (conteo == 3) {
                    g.drawImage(temp, null, 200, 200);
                    map.setRGB(200 + temp.getWidth() / 2, 200 + temp.getHeight() / 2, Color.WHITE.getRGB());
                    v.setArea(200, 200 + temp.getWidth(), 200, 200 + temp.getHeight());
                    v.setLocation(200 + temp.getWidth() / 2, 200 + temp.getHeight() / 2);

                } else if (conteo == 4) {
                    g.drawImage(temp, null, 350, 200);
                    map.setRGB(350 + temp.getWidth() / 2, 200 + temp.getHeight() / 2, Color.WHITE.getRGB());
                    v.setArea(350, 350 + temp.getWidth(), 200, 200 + temp.getHeight());
                    v.setLocation(350 + temp.getWidth() / 2, 200 + temp.getHeight() / 2);

                } else if (conteo == 5) {
                    g.drawImage(temp, null, 500, 200);
                    map.setRGB(500 + temp.getWidth() / 2, 200 + temp.getHeight() / 2, Color.WHITE.getRGB());
                    v.setArea(500, 500 + temp.getWidth(), 200, 200 + temp.getHeight());
                    v.setLocation(500 + temp.getWidth() / 2, 200 + temp.getHeight() / 2);

                } else if (conteo == 6) {
                    g.drawImage(temp, null, 150, 350);
                    map.setRGB(150 + temp.getWidth() / 2, 350 + temp.getHeight() / 2, Color.WHITE.getRGB());
                    v.setArea(150, 150 + temp.getWidth(), 350, 350 + temp.getHeight());
                    v.setLocation(150 + temp.getWidth() / 2, 350 + temp.getHeight() / 2);

                } else if (conteo == 7) {
                    g.drawImage(temp, null, 300, 350);
                    map.setRGB(300 + temp.getWidth() / 2, 350 + temp.getHeight() / 2, Color.WHITE.getRGB());
                    v.setArea(300, 300 + temp.getWidth(), 350, 350 + temp.getHeight());
                    v.setLocation(300 + temp.getWidth() / 2, 350 + temp.getHeight() / 2);

                } else if (conteo == 8) {
                    g.drawImage(temp, null, 450, 350);
                    map.setRGB(450 + temp.getWidth() / 2, 350 + temp.getHeight() / 2, Color.WHITE.getRGB());
                    v.setArea(450, 450 + temp.getWidth(), 350, 350 + temp.getHeight());
                    v.setLocation(450 + temp.getWidth() / 2, 350 + temp.getHeight() / 2);

                }
                conteo++;

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        drawLines();
    }

    public void drawLines() {
        Graphics2D g = map.createGraphics();
        for (Vertice temporal : mapa.getVertices()) {
            for (Arista temp : temporal.getAristas()) {
                g.drawLine(temporal.getX(), temporal.getY(), temp.getDestino().getX(), temp.getDestino().getY());

            }

        }
        Image img;
        img = Toolkit.getDefaultToolkit().createImage(map.getSource()).getScaledInstance(700, 500, 0);
        image_mapa.setIcon(new ImageIcon(img));
        image_mapa.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JMenuItem agregar;
    private javax.swing.JButton agregar_arista;
    private javax.swing.JDialog agregarv;
    private javax.swing.JComboBox aristas;
    private javax.swing.JButton b_cargar;
    private javax.swing.JButton b_iniciar;
    private javax.swing.JButton b_iniciar1;
    private javax.swing.JButton b_viajar;
    private javax.swing.JLabel image_mapa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JPanel menu1;
    private javax.swing.JPanel menu2;
    private javax.swing.JPopupMenu menupop;
    private javax.swing.JPopupMenu menupop2;
    private javax.swing.JTextField nombre;
    private javax.swing.JMenu opciones;
    private javax.swing.JLabel panel;
    private javax.swing.JSpinner peso;
    private javax.swing.JButton salvar;
    private javax.swing.JLabel viaje;
    // End of variables declaration//GEN-END:variables
    Grafo mapa;
    BufferedImage map;
    int inicio[];
    int destino[];
    String principio;
    String fin;
    ArrayList<Arista> aristas_temp;
}
