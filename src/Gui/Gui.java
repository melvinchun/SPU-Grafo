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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Random;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
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
        velocidad_warp = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menupop = new javax.swing.JPopupMenu();
        Eliminar = new javax.swing.JMenuItem();
        Modificar = new javax.swing.JMenuItem();
        menupop2 = new javax.swing.JPopupMenu();
        agregar = new javax.swing.JMenuItem();
        GuardarImg = new javax.swing.JMenuItem();
        agregarv = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        nombre = new javax.swing.JTextField();
        aristas = new javax.swing.JComboBox();
        agregar_arista = new javax.swing.JButton();
        peso = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        salvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        modificarv = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        mnombre = new javax.swing.JTextField();
        maristas = new javax.swing.JComboBox();
        magregar_arista = new javax.swing.JButton();
        mpeso = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        msalvar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        Reportev = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        reporte1 = new javax.swing.JLabel();
        reportee = new javax.swing.JLabel();
        reporte = new javax.swing.JLabel();
        salirb = new javax.swing.JButton();
        guardab = new javax.swing.JButton();
        menupop3 = new javax.swing.JPopupMenu();
        eliminarA = new javax.swing.JMenuItem();
        menu1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        b_cargar = new javax.swing.JButton();
        b_iniciar = new javax.swing.JButton();
        menu2 = new javax.swing.JPanel();
        b_viajar = new javax.swing.JButton();
        b_warp = new javax.swing.JButton();
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
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        menupop.add(Modificar);

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        menupop2.add(agregar);

        GuardarImg.setText("Guardar Imagen");
        GuardarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarImgActionPerformed(evt);
            }
        });
        menupop2.add(GuardarImg);

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

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        mnombre.setBackground(new java.awt.Color(204, 204, 204));
        mnombre.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N

        maristas.setBackground(new java.awt.Color(0, 0, 0));
        maristas.setFont(new java.awt.Font("8BIT WONDER", 0, 14)); // NOI18N
        maristas.setForeground(new java.awt.Color(153, 153, 153));
        maristas.setAlignmentX(1.0F);
        maristas.setAlignmentY(1.0F);
        maristas.setMinimumSize(new java.awt.Dimension(175, 37));
        maristas.setPreferredSize(new java.awt.Dimension(165, 37));
        maristas.setSize(new java.awt.Dimension(106, 37));

        magregar_arista.setFont(new java.awt.Font("8BIT WONDER", 0, 14)); // NOI18N
        magregar_arista.setText("Agregar Arista");
        magregar_arista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magregar_aristaActionPerformed(evt);
            }
        });

        mpeso.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AristAS");

        msalvar.setFont(new java.awt.Font("8BIT WONDER", 0, 14)); // NOI18N
        msalvar.setText("Guardar Planeta");
        msalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msalvarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("8BIT WONDER", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre");

        lista.setFont(new java.awt.Font("8BIT WONDER", 0, 12)); // NOI18N
        lista.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(msalvar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(magregar_arista)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(maristas, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(mpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mnombre)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maristas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(magregar_arista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(msalvar)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout modificarvLayout = new javax.swing.GroupLayout(modificarv.getContentPane());
        modificarv.getContentPane().setLayout(modificarvLayout);
        modificarvLayout.setHorizontalGroup(
            modificarvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modificarvLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        modificarvLayout.setVerticalGroup(
            modificarvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modificarvLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        reporte1.setBackground(new java.awt.Color(255, 255, 255));
        reporte1.setFont(new java.awt.Font("8BIT WONDER", 1, 18)); // NOI18N
        reporte1.setForeground(new java.awt.Color(51, 153, 255));
        reporte1.setText("Seleccione su ruta de viaje ");

        reportee.setBackground(new java.awt.Color(255, 255, 255));
        reportee.setFont(new java.awt.Font("8BIT WONDER", 1, 18)); // NOI18N
        reportee.setForeground(new java.awt.Color(255, 255, 255));
        reportee.setText("La trayectoria fue:");

        reporte.setBackground(new java.awt.Color(255, 255, 255));
        reporte.setFont(new java.awt.Font("8BIT WONDER", 1, 18)); // NOI18N
        reporte.setForeground(new java.awt.Color(102, 255, 102));
        reporte.setText("Seleccione su ruta de viaje ");

        salirb.setBackground(new java.awt.Color(0, 0, 0));
        salirb.setFont(new java.awt.Font("8BIT WONDER", 0, 14)); // NOI18N
        salirb.setForeground(new java.awt.Color(255, 255, 255));
        salirb.setText("Salir");
        salirb.setBorderPainted(false);
        salirb.setContentAreaFilled(false);
        salirb.setFocusable(false);
        salirb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirbActionPerformed(evt);
            }
        });

        guardab.setBackground(new java.awt.Color(0, 0, 0));
        guardab.setFont(new java.awt.Font("8BIT WONDER", 0, 14)); // NOI18N
        guardab.setForeground(new java.awt.Color(255, 255, 255));
        guardab.setText("Guardar");
        guardab.setBorder(null);
        guardab.setBorderPainted(false);
        guardab.setContentAreaFilled(false);
        guardab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(guardab, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salirb)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reportee)
                    .addComponent(reporte1)
                    .addComponent(reporte))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reportee, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardab, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ReportevLayout = new javax.swing.GroupLayout(Reportev.getContentPane());
        Reportev.getContentPane().setLayout(ReportevLayout);
        ReportevLayout.setHorizontalGroup(
            ReportevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReportevLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ReportevLayout.setVerticalGroup(
            ReportevLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        eliminarA.setText("Eliminar");
        eliminarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarAActionPerformed(evt);
            }
        });
        menupop3.add(eliminarA);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N

        b_cargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/load.png"))); // NOI18N
        b_cargar.setBorderPainted(false);
        b_cargar.setContentAreaFilled(false);
        b_cargar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/load-.png"))); // NOI18N
        b_cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cargarActionPerformed(evt);
            }
        });

        b_iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iniciar.png"))); // NOI18N
        b_iniciar.setBorderPainted(false);
        b_iniciar.setContentAreaFilled(false);
        b_iniciar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iniciar-.png"))); // NOI18N
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

        b_viajar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/viajar.png"))); // NOI18N
        b_viajar.setBorderPainted(false);
        b_viajar.setContentAreaFilled(false);
        b_viajar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/viajar-.png"))); // NOI18N
        b_viajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_viajarActionPerformed(evt);
            }
        });

        b_warp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/warp.png"))); // NOI18N
        b_warp.setBorderPainted(false);
        b_warp.setContentAreaFilled(false);
        b_warp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/warp-.png"))); // NOI18N
        b_warp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_warpActionPerformed(evt);
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
                    .addComponent(viaje)
                    .addComponent(b_viajar)
                    .addComponent(b_warp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu2Layout.setVerticalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viaje, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_viajar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_warp, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(menu2);
        menu2.setBounds(440, 10, 450, 280);

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
        if (leer(cargar())) {
            mapa.print();
            b_iniciar.setVisible(true);
        }
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
        if (principio != null && fin != null) {
            Viajes = new ArrayList();
            System.out.println(principio + " " + fin);
            SMA(new Viaje(principio), fin);
            System.out.println("El tamaño es: " + Viajes.size());
            if (Viajes.size() > 0) {
                if (velocidad_warp) {
                    for (Viaje temp : Viajes) {
                        temp.warp();
                    }
                    Viaje resultado = new Viaje("");
                    for (Viaje temp : Viajes) {
                        if (resultado.getCoste() > temp.getCoste() || resultado.getCoste() == -1) {
                            resultado = temp;
                        }
                    }
                    String m[] = resultado.ToString();
                    reporte.setText(m[0]);
                    reporte1.setText(m[1]);
                    Reportev.pack();
                    Reportev.setModal(true);
                    Reportev.setLocationRelativeTo(this);
                    Reportev.setVisible(true);
                } else {
                    Viaje resultado = new Viaje("");
                    for (Viaje temp : Viajes) {
                        if (resultado.getCoste() > temp.getCoste() || resultado.getCoste() == -1) {
                            resultado = temp;
                        }
                    }
                    String m[] = resultado.ToString();
                    reporte.setText(m[0]);
                    reporte1.setText(m[1]);
                    Reportev.pack();
                    Reportev.setModal(true);
                    Reportev.setLocationRelativeTo(this);
                    Reportev.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se puede llegar a ese Planeta", "ERROR", 2);
            }
        }
    }//GEN-LAST:event_b_viajarActionPerformed

    private void b_warpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_warpActionPerformed
        if (!velocidad_warp) {
            ImageIcon im = new ImageIcon("./src/Imagenes/warp-.png");
            b_warp.setIcon(im);
            velocidad_warp = true;
        } else {
            ImageIcon im = new ImageIcon("./src/Imagenes/warp.png");
            b_warp.setIcon(im);
            velocidad_warp = false;
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_b_warpActionPerformed

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
        } else {
            viaje.setText("Seleccione un destino");
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
            for (Vertice temporal : mapa.getVertices()) {
                if (temporal.getNombre().equals(ar)) {
                    temp = temporal;
                }
            }
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

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        Vertice temp = null;
        int cont = 0;
        for (Vertice temporal : mapa.getVertices()) {
            if (inicio[0] > temporal.getArea()[0] && inicio[0] < temporal.getArea()[1] && inicio[1] > temporal.getArea()[2] && inicio[1] < temporal.getArea()[3]) {
                break;
            }
            cont++;
        }
        Vertice v = mapa.getVertices().get(cont);
        modificado = v;
        mnombre.setText(v.getNombre());
        DefaultListModel model = new DefaultListModel();
        for (Arista temporal : v.getAristas()) {
            model.addElement(temporal);
        }
        lista.setModel(model);
        DefaultComboBoxModel models = new DefaultComboBoxModel();
        for (Vertice temporal : mapa.getVertices()) {
            models.addElement(temporal.getNombre());
        }
        maristas.setModel(models);
        modificarv.pack();
        modificarv.setModal(true);
        modificarv.setLocationRelativeTo(this);
        modificarv.setVisible(true);
    }//GEN-LAST:event_ModificarActionPerformed

    private void magregar_aristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magregar_aristaActionPerformed
        String ar = maristas.getSelectedItem().toString();
        int pes = (int) mpeso.getValue();
        int cont = 0;
        for (Vertice temporal : mapa.getVertices()) {
            if (inicio[0] > temporal.getArea()[0] && inicio[0] < temporal.getArea()[1] && inicio[1] > temporal.getArea()[2] && inicio[1] < temporal.getArea()[3]) {
                break;
            }
            cont++;
        }
        Vertice v = mapa.getVertices().get(cont);
        Vertice temp = null;
        for (Vertice temporal : mapa.getVertices()) {
            if (temporal.getNombre().equals(ar)) {
                temp = temporal;
            }
        }
        if (temp != null) {
            Arista a = new Arista(temp, pes);
            v.getAristas().add(a);
        }
        DefaultListModel model = new DefaultListModel();
        for (Arista temporal : v.getAristas()) {
            model.addElement(temporal);
        }
        lista.setModel(model);
        maristas.setSelectedIndex(0);
        mpeso.setValue(0);
    }//GEN-LAST:event_magregar_aristaActionPerformed

    private void msalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msalvarActionPerformed
        int cont = 0;
        for (Vertice temporal : mapa.getVertices()) {
            if (inicio[0] > temporal.getArea()[0] && inicio[0] < temporal.getArea()[1] && inicio[1] > temporal.getArea()[2] && inicio[1] < temporal.getArea()[3]) {
                break;
            }
            cont++;
        }
        Vertice v = mapa.getVertices().get(cont);
        v.setNombre(mnombre.getText().toUpperCase());
        mnombre.setText("");
        drawPlanets();
        modificarv.setVisible(false);
    }//GEN-LAST:event_msalvarActionPerformed

    private void salirbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirbActionPerformed
        Reportev.setVisible(false);
    }//GEN-LAST:event_salirbActionPerformed

    private void guardabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardabActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileWriter fw = null;
        BufferedWriter bw = null;
        chooser.setDialogTitle("Especifique un Nombre");
        int result = chooser.showSaveDialog(this);
        try {
            if (result == chooser.APPROVE_OPTION) {
                File outputfile = new File(chooser.getSelectedFile() + ".txt");
                fw = new FileWriter(outputfile, false);
                bw = new BufferedWriter(fw);
                bw.write(reporte.getText() + reporte1.getText());
                bw.flush();
                JOptionPane.showMessageDialog(this, "Archivo guardado exitosamente", "Guardado", 1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar la imagen", "ERROR", 2);
        }
    }//GEN-LAST:event_guardabActionPerformed

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        if (evt.isMetaDown()) {
            menupop3.show(evt.getComponent(), evt.getX(), evt.getY());
        }

    }//GEN-LAST:event_listaMouseClicked

    private void eliminarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarAActionPerformed
        if (lista.getSelectedValue() != null) {
            int cont = 0;
            for (Arista temp : modificado.getAristas()) {
                if (((Arista) lista.getSelectedValue()).getDestino().getNombre().equals(temp.getDestino().getNombre())) {
                    break;
                }
                cont++;
            }
            modificado.getAristas().remove(cont);
            DefaultListModel model = new DefaultListModel();
            for (Arista temporal : modificado.getAristas()) {
                model.addElement(temporal);
            }
            lista.setModel(model);
        }
    }//GEN-LAST:event_eliminarAActionPerformed

    private void GuardarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarImgActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Especifique un Nombre");
        int result = chooser.showSaveDialog(this);
        try {
            if (result == chooser.APPROVE_OPTION) {
                File outputfile = new File(chooser.getSelectedFile() + ".bmp");
                ImageIO.write(map, "png", outputfile);
                JOptionPane.showMessageDialog(this, "Archivo guardado exitosamente", "Guardado", 1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar la imagen", "ERROR", 2);
        }
    }//GEN-LAST:event_GuardarImgActionPerformed

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

    public boolean leer(File archivo) {
        Scanner sc = null;
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                String planeta = sc.next();
                planeta = planeta.replaceAll("\n", "");
                planeta = planeta.toUpperCase();
                int peso = sc.nextInt();
                if (peso < 0) {
                    throw new EmptyStackException();
                }
                String destino = sc.next();
                destino = destino.toUpperCase();
                crearGrafo(planeta, peso, destino);
            }
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Formato Invalido", "ERROR", 2);
            return false;
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
            if (nuevo && nuevo2 && mapa.getVertices().size() < 9) {
                Vertice v = new Vertice(nombre);
                Vertice d = new Vertice(destino);
                v.addArista(new Arista(d, peso));
                mapa.addVertice(v);
                mapa.addVertice(d);
            } else if (nuevo && mapa.getVertices().size() < 9) {
                Vertice v = new Vertice(nombre);
                v.addArista(new Arista(temp2, peso));
                mapa.addVertice(v);
            } else if (nuevo2 && mapa.getVertices().size() < 9) {
                Vertice d = new Vertice(destino);
                temp1.addArista(new Arista(d, peso));
                mapa.addVertice(d);
            } else if (!nuevo && !nuevo2) {
                if (!temp1.getNombre().equals(temp2.getNombre())) {
                    temp1.addArista(new Arista(temp2, peso));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
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
                    if (temporal.getQ() == 0) {
                        Random r = new Random();
                        int n = r.nextInt(5) + 10;
                        temporal.setQ(n);
                        temp = ImageIO.read(new File("./src/Imagenes/" + (n) + ".png"));
                        v = temporal;
                    } else {
                        temp = ImageIO.read(new File("./src/Imagenes/" + temporal.getQ() + ".png"));
                        v = temporal;
                    }
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
                    g.drawImage(temp, null, 50, 200);
                    map.setRGB(50 + temp.getWidth() / 2, 200 + temp.getHeight() / 2, Color.WHITE.getRGB());
                    v.setArea(50, 50 + temp.getWidth(), 200, 200 + temp.getHeight());
                    v.setLocation(50 + temp.getWidth() / 2, 200 + temp.getHeight() / 2);

                } else if (conteo == 4) {
                    g.drawImage(temp, null, 300, 200);
                    map.setRGB(300 + temp.getWidth() / 2, 200 + temp.getHeight() / 2, Color.WHITE.getRGB());
                    v.setArea(300, 300 + temp.getWidth(), 200, 200 + temp.getHeight());
                    v.setLocation(300 + temp.getWidth() / 2, 200 + temp.getHeight() / 2);

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

    public void SMA(Viaje recibir, String destino) {
        Viaje clon = recibir.clonar();
        recibir.delete();
        //Buscar nodo
        Vertice temp = null;
        for (Vertice temporal : mapa.getVertices()) {
            if (recibir.getPath().get(recibir.getPath().size() - 1).equals(temporal.getNombre())) {
                temp = temporal;
            }
        }
        //Manda hacia aristas
        if (temp != null) {
            if (!(destino.equals(temp.getNombre()))) {
                if (temp.hasArista()) {
                    for (Arista temporal : temp.getAristas()) {
                        if (clon.buscar(temporal.getDestino().getNombre())) {
                            Viaje enviar = clon.clonar();
                            clon.delete();
                            enviar.addPath(temporal.getDestino().getNombre());
                            enviar.addG(temporal.getPeso());
                            SMA(enviar, destino);
                        }

                    }
                }
            } else {
                Viajes.add(clon);
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Eliminar;
    private javax.swing.JMenuItem GuardarImg;
    private javax.swing.JMenuItem Modificar;
    private javax.swing.JDialog Reportev;
    private javax.swing.JMenuItem agregar;
    private javax.swing.JButton agregar_arista;
    private javax.swing.JDialog agregarv;
    private javax.swing.JComboBox aristas;
    private javax.swing.JButton b_cargar;
    private javax.swing.JButton b_iniciar;
    private javax.swing.JButton b_viajar;
    private javax.swing.JButton b_warp;
    private javax.swing.JMenuItem eliminarA;
    private javax.swing.JButton guardab;
    private javax.swing.JLabel image_mapa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lista;
    private javax.swing.JButton magregar_arista;
    private javax.swing.JComboBox maristas;
    private javax.swing.JMenuBar menu;
    private javax.swing.JPanel menu1;
    private javax.swing.JPanel menu2;
    private javax.swing.JPopupMenu menupop;
    private javax.swing.JPopupMenu menupop2;
    private javax.swing.JPopupMenu menupop3;
    private javax.swing.JTextField mnombre;
    private javax.swing.JDialog modificarv;
    private javax.swing.JSpinner mpeso;
    private javax.swing.JButton msalvar;
    private javax.swing.JTextField nombre;
    private javax.swing.JMenu opciones;
    private javax.swing.JLabel panel;
    private javax.swing.JSpinner peso;
    private javax.swing.JLabel reporte;
    private javax.swing.JLabel reporte1;
    private javax.swing.JLabel reportee;
    private javax.swing.JButton salirb;
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
    ArrayList<Viaje> Viajes;
    boolean velocidad_warp;
    Vertice modificado;
}
