/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.awt.event.ActionEvent;
import javax.swing.Timer;
import Modelo.Xogo;

/**
 *
 * @author a22manuelmf
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private Xogo xogo;
    private Timer timer;
    private int timerDelay = 1000;
    private Timer timerContador;
    private int segundos = 0;
    private int minutos = 0;
    private int puntuacion;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PantallaJuego = new javax.swing.JDialog();
        FondoNombres = new javax.swing.JPanel();
        SiguienteFicha = new javax.swing.JPanel();
        TiempoEtiqueta = new javax.swing.JLabel();
        SalirJuego = new javax.swing.JButton();
        BotonPausa = new javax.swing.JToggleButton();
        Puntos = new javax.swing.JPanel();
        PuntosLabel = new javax.swing.JLabel();
        LineasEliminadas = new javax.swing.JPanel();
        LineasEliminadasLabel = new javax.swing.JLabel();
        PanelJuego = new javax.swing.JPanel();
        PantallaAjustes = new javax.swing.JDialog();
        PanelAjustes = new javax.swing.JPanel();
        BotonCambiarColor = new javax.swing.JButton();
        BotonDificultad = new javax.swing.JButton();
        BotonSalirAjustes = new javax.swing.JButton();
        PantallaDificultad = new javax.swing.JDialog();
        PanelDificultad = new javax.swing.JPanel();
        BotonSalirDificultad = new javax.swing.JButton();
        BotonAceptarDificultad = new javax.swing.JButton();
        MarcadorDificultad = new javax.swing.JSlider();
        PantallaCambiarDeColor = new javax.swing.JDialog();
        PanelColoresFondo = new javax.swing.JPanel();
        BotonAceptarColores = new javax.swing.JButton();
        BotonSalirColores = new javax.swing.JButton();
        PanelColores = new javax.swing.JColorChooser();
        Inicio = new javax.swing.JPanel();
        Jugar = new javax.swing.JButton();
        Ajustes = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();

        PantallaJuego.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        PantallaJuego.setTitle("Tetris");
        PantallaJuego.setBackground(new java.awt.Color(33, 202, 243));
        PantallaJuego.setMaximumSize(new java.awt.Dimension(400, 550));
        PantallaJuego.setMinimumSize(new java.awt.Dimension(400, 550));
        PantallaJuego.setPreferredSize(new java.awt.Dimension(400, 550));
        PantallaJuego.setResizable(false);

        FondoNombres.setBackground(new java.awt.Color(0, 0, 0));
        FondoNombres.setMaximumSize(new java.awt.Dimension(162, 500));
        FondoNombres.setMinimumSize(new java.awt.Dimension(162, 500));
        FondoNombres.setPreferredSize(new java.awt.Dimension(162, 500));

        TiempoEtiqueta.setText("00:00:00");

        SalirJuego.setText("Salir");
        SalirJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirJuegoActionPerformed(evt);
            }
        });

        BotonPausa.setText("| |");
        BotonPausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPausaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SiguienteFichaLayout = new javax.swing.GroupLayout(SiguienteFicha);
        SiguienteFicha.setLayout(SiguienteFichaLayout);
        SiguienteFichaLayout.setHorizontalGroup(
            SiguienteFichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SiguienteFichaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TiempoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(SiguienteFichaLayout.createSequentialGroup()
                .addComponent(SalirJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonPausa, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        SiguienteFichaLayout.setVerticalGroup(
            SiguienteFichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SiguienteFichaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TiempoEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SiguienteFichaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalirJuego)
                    .addComponent(BotonPausa))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        PuntosLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        PuntosLabel.setText("Puntos:");
        PuntosLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout PuntosLayout = new javax.swing.GroupLayout(Puntos);
        Puntos.setLayout(PuntosLayout);
        PuntosLayout.setHorizontalGroup(
            PuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PuntosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PuntosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PuntosLayout.setVerticalGroup(
            PuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PuntosLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(PuntosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );

        LineasEliminadasLabel.setText("Lineas Eliminadas:");
        LineasEliminadasLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout LineasEliminadasLayout = new javax.swing.GroupLayout(LineasEliminadas);
        LineasEliminadas.setLayout(LineasEliminadasLayout);
        LineasEliminadasLayout.setHorizontalGroup(
            LineasEliminadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LineasEliminadasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LineasEliminadasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        LineasEliminadasLayout.setVerticalGroup(
            LineasEliminadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LineasEliminadasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LineasEliminadasLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout FondoNombresLayout = new javax.swing.GroupLayout(FondoNombres);
        FondoNombres.setLayout(FondoNombresLayout);
        FondoNombresLayout.setHorizontalGroup(
            FondoNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoNombresLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(FondoNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(LineasEliminadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Puntos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SiguienteFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        FondoNombresLayout.setVerticalGroup(
            FondoNombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoNombresLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(SiguienteFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(Puntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LineasEliminadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        PanelJuego.setBackground(new java.awt.Color(0, 51, 51));
        PanelJuego.setFocusCycleRoot(true);
        PanelJuego.setMaximumSize(new java.awt.Dimension(180, 500));
        PanelJuego.setMinimumSize(new java.awt.Dimension(180, 500));
        PanelJuego.setPreferredSize(new java.awt.Dimension(180, 500));
        PanelJuego.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PanelJuegoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout PanelJuegoLayout = new javax.swing.GroupLayout(PanelJuego);
        PanelJuego.setLayout(PanelJuegoLayout);
        PanelJuegoLayout.setHorizontalGroup(
            PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        PanelJuegoLayout.setVerticalGroup(
            PanelJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PantallaJuegoLayout = new javax.swing.GroupLayout(PantallaJuego.getContentPane());
        PantallaJuego.getContentPane().setLayout(PantallaJuegoLayout);
        PantallaJuegoLayout.setHorizontalGroup(
            PantallaJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallaJuegoLayout.createSequentialGroup()
                .addComponent(PanelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FondoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        PantallaJuegoLayout.setVerticalGroup(
            PantallaJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaJuegoLayout.createSequentialGroup()
                .addGroup(PantallaJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelJuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FondoNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        PantallaAjustes.setTitle("Tetris");
        PantallaAjustes.setMinimumSize(new java.awt.Dimension(500, 500));

        BotonCambiarColor.setText("Cambiar color de fondo");
        BotonCambiarColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCambiarColorActionPerformed(evt);
            }
        });

        BotonDificultad.setText("dificultad");
        BotonDificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDificultadActionPerformed(evt);
            }
        });

        BotonSalirAjustes.setText("Salir");
        BotonSalirAjustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirAjustesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAjustesLayout = new javax.swing.GroupLayout(PanelAjustes);
        PanelAjustes.setLayout(PanelAjustesLayout);
        PanelAjustesLayout.setHorizontalGroup(
            PanelAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAjustesLayout.createSequentialGroup()
                .addGroup(PanelAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAjustesLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(BotonCambiarColor))
                    .addGroup(PanelAjustesLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(BotonDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAjustesLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(BotonSalirAjustes)))
                .addContainerGap(339, Short.MAX_VALUE))
        );
        PanelAjustesLayout.setVerticalGroup(
            PanelAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAjustesLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(BotonCambiarColor, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonSalirAjustes)
                .addContainerGap(295, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PantallaAjustesLayout = new javax.swing.GroupLayout(PantallaAjustes.getContentPane());
        PantallaAjustes.getContentPane().setLayout(PantallaAjustesLayout);
        PantallaAjustesLayout.setHorizontalGroup(
            PantallaAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaAjustesLayout.createSequentialGroup()
                .addComponent(PanelAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PantallaAjustesLayout.setVerticalGroup(
            PantallaAjustesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaAjustesLayout.createSequentialGroup()
                .addComponent(PanelAjustes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PantallaDificultad.setTitle("Tetris");
        PantallaDificultad.setMinimumSize(new java.awt.Dimension(500, 500));

        BotonSalirDificultad.setText("Salir");
        BotonSalirDificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirDificultadActionPerformed(evt);
            }
        });

        BotonAceptarDificultad.setText("Aceptar");
        BotonAceptarDificultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarDificultadActionPerformed(evt);
            }
        });

        MarcadorDificultad.setMajorTickSpacing(1);
        MarcadorDificultad.setMaximum(10);
        MarcadorDificultad.setMinorTickSpacing(1);
        MarcadorDificultad.setPaintLabels(true);
        MarcadorDificultad.setPaintTicks(true);
        MarcadorDificultad.setValue(1);

        javax.swing.GroupLayout PanelDificultadLayout = new javax.swing.GroupLayout(PanelDificultad);
        PanelDificultad.setLayout(PanelDificultadLayout);
        PanelDificultadLayout.setHorizontalGroup(
            PanelDificultadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDificultadLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(MarcadorDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDificultadLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(BotonAceptarDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(BotonSalirDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        PanelDificultadLayout.setVerticalGroup(
            PanelDificultadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDificultadLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(MarcadorDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addGroup(PanelDificultadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSalirDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAceptarDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(270, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PantallaDificultadLayout = new javax.swing.GroupLayout(PantallaDificultad.getContentPane());
        PantallaDificultad.getContentPane().setLayout(PantallaDificultadLayout);
        PantallaDificultadLayout.setHorizontalGroup(
            PantallaDificultadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaDificultadLayout.createSequentialGroup()
                .addComponent(PanelDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PantallaDificultadLayout.setVerticalGroup(
            PantallaDificultadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaDificultadLayout.createSequentialGroup()
                .addComponent(PanelDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PantallaCambiarDeColor.setTitle("Tetris");
        PantallaCambiarDeColor.setMinimumSize(new java.awt.Dimension(500, 500));

        PanelColoresFondo.setMinimumSize(new java.awt.Dimension(500, 500));

        BotonAceptarColores.setText("Aceptar");
        BotonAceptarColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarColoresActionPerformed(evt);
            }
        });

        BotonSalirColores.setText("Salir");
        BotonSalirColores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirColoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelColoresFondoLayout = new javax.swing.GroupLayout(PanelColoresFondo);
        PanelColoresFondo.setLayout(PanelColoresFondoLayout);
        PanelColoresFondoLayout.setHorizontalGroup(
            PanelColoresFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelColoresFondoLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(BotonAceptarColores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonSalirColores)
                .addGap(139, 139, 139))
            .addGroup(PanelColoresFondoLayout.createSequentialGroup()
                .addComponent(PanelColores, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        PanelColoresFondoLayout.setVerticalGroup(
            PanelColoresFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelColoresFondoLayout.createSequentialGroup()
                .addComponent(PanelColores, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelColoresFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAceptarColores)
                    .addComponent(BotonSalirColores))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PantallaCambiarDeColorLayout = new javax.swing.GroupLayout(PantallaCambiarDeColor.getContentPane());
        PantallaCambiarDeColor.getContentPane().setLayout(PantallaCambiarDeColorLayout);
        PantallaCambiarDeColorLayout.setHorizontalGroup(
            PantallaCambiarDeColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PantallaCambiarDeColorLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(PanelColoresFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(280, Short.MAX_VALUE))
        );
        PantallaCambiarDeColorLayout.setVerticalGroup(
            PantallaCambiarDeColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PantallaCambiarDeColorLayout.createSequentialGroup()
                .addContainerGap(328, Short.MAX_VALUE)
                .addComponent(PanelColoresFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tetris");

        Jugar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Jugar.setText("Jugar");
        Jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarActionPerformed(evt);
            }
        });

        Ajustes.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Ajustes.setText("Ajustes");
        Ajustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjustesActionPerformed(evt);
            }
        });

        Salir.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        Titulo.setText("TETRIS ");

        javax.swing.GroupLayout InicioLayout = new javax.swing.GroupLayout(Inicio);
        Inicio.setLayout(InicioLayout);
        InicioLayout.setHorizontalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioLayout.createSequentialGroup()
                .addGroup(InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InicioLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ajustes, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(Jugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(InicioLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(Titulo)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        InicioLayout.setVerticalGroup(
            InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Ajustes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Inicio.getAccessibleContext().setAccessibleName("");
        Inicio.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarActionPerformed
        // TODO add your handling code here:
        PanelJuego.removeAll();
        PantallaJuego.setVisible(true);
        PanelJuego.setFocusable(true);
        PanelJuego.requestFocus();
        segundos = 0;
        minutos = 0;
        TiempoEtiqueta.setText("0:" + minutos + ":" + segundos);
        xogo = new Xogo(this);
        xogo.xenerarNovaFicha();
        for (int i = 0; i < 4; i++) {
            pintarCadrado(xogo.getFichaActual().getCadrados().get(i).getlBlCadrado());
        }
        if (timer == null || !timer.isRunning()) {
            timerTicks();
            timer.start();
            timerContador.start();
        }
    }//GEN-LAST:event_JugarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void BotonCambiarColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCambiarColorActionPerformed
        // TODO add your handling code here:
        PantallaCambiarDeColor.setVisible(true);
    }//GEN-LAST:event_BotonCambiarColorActionPerformed

    private void BotonAceptarDificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarDificultadActionPerformed
        timerDelay=1000;
        PantallaDificultad.setVisible(false);
        timerDelay -= MarcadorDificultad.getValue() * 50;
    }//GEN-LAST:event_BotonAceptarDificultadActionPerformed

    private void BotonSalirDificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirDificultadActionPerformed
        // TODO add your handling code here:
        PantallaDificultad.setVisible(false);
    }//GEN-LAST:event_BotonSalirDificultadActionPerformed

    private void SalirJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirJuegoActionPerformed
        // TODO add your handling code here:
        PantallaJuego.setVisible(false);
        timer.stop();
        timerContador.stop();
    }//GEN-LAST:event_SalirJuegoActionPerformed

    private void AjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjustesActionPerformed
        // TODO add your handling code here:
        PantallaAjustes.setVisible(true);
    }//GEN-LAST:event_AjustesActionPerformed

    private void BotonSalirAjustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirAjustesActionPerformed
        // TODO add your handling code here:
        PantallaAjustes.setVisible(false);
    }//GEN-LAST:event_BotonSalirAjustesActionPerformed

    private void BotonDificultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDificultadActionPerformed
        // TODO add your handling code here:
        PantallaDificultad.setVisible(true);
    }//GEN-LAST:event_BotonDificultadActionPerformed

    private void BotonSalirColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirColoresActionPerformed
        // TODO add your handling code here:
        PantallaCambiarDeColor.setVisible(false);
    }//GEN-LAST:event_BotonSalirColoresActionPerformed

    private void BotonAceptarColoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarColoresActionPerformed
        // TODO add your handling code here:
        PanelJuego.setBackground(PanelColores.getColor());
        SiguienteFicha.setBackground(PanelColores.getColor());
        Puntos.setBackground(PanelColores.getColor());
        LineasEliminadas.setBackground(PanelColores.getColor());
        PanelAjustes.setBackground(PanelColores.getColor());
        PanelDificultad.setBackground(PanelColores.getColor());
        Inicio.setBackground(PanelColores.getColor());
        PanelColoresFondo.setBackground(PanelColores.getColor());
    }//GEN-LAST:event_BotonAceptarColoresActionPerformed

    private void BotonPausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPausaActionPerformed
        // TODO add your handling code here:
        if (BotonPausa.isSelected()) {
            timer.stop();
            timerContador.stop();
            xogo.setPausa(true);
        } else {
            timer.start();
            timerContador.start();
            xogo.setPausa(false);
            PanelJuego.requestFocus();
        }
    }//GEN-LAST:event_BotonPausaActionPerformed

    private void PanelJuegoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PanelJuegoKeyPressed

        if (!xogo.isPausa()) {
            if (evt.getKeyChar() == 'a') {
                xogo.moverFichaEsquerda();

            } else if (evt.getKeyChar() == 'd') {
                xogo.moverFichaDereita();

            } else if (evt.getKeyChar() == 'w') {
                xogo.rotarFicha();

            } else if (evt.getKeyChar() == 's') {
                xogo.moverFichaAbaixo();
            }
        }
    }//GEN-LAST:event_PanelJuegoKeyPressed

    public void pintarCadrado(javax.swing.JLabel cadrado) {

        PanelJuego.add(cadrado);

        cadrado.setOpaque(true);
        PanelJuego.updateUI();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    private void timerTicks() {
        this.timer = new Timer(timerDelay, (ActionEvent e) -> {

            xogo.moverFichaAbaixo();
            for (int i = 0; i < 4; i++) {
                pintarCadrado(xogo.getFichaActual().getCadrados().get(i).getlBlCadrado());
            }

            // xogo.fichaActual.updateLabelPos();
        });
        this.timerContador = new Timer(1000, (ActionEvent e) -> {

            //  xogo.moverFichaAbaixo();
            segundos++;

            if (segundos == 60) {
                segundos = 0;
                minutos++;
            }
            TiempoEtiqueta.setText("0:" + minutos + ":" + segundos);

        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajustes;
    private javax.swing.JButton BotonAceptarColores;
    private javax.swing.JButton BotonAceptarDificultad;
    private javax.swing.JButton BotonCambiarColor;
    private javax.swing.JButton BotonDificultad;
    private javax.swing.JToggleButton BotonPausa;
    private javax.swing.JButton BotonSalirAjustes;
    private javax.swing.JButton BotonSalirColores;
    private javax.swing.JButton BotonSalirDificultad;
    private javax.swing.JPanel FondoNombres;
    private javax.swing.JPanel Inicio;
    private javax.swing.JButton Jugar;
    private javax.swing.JPanel LineasEliminadas;
    private javax.swing.JLabel LineasEliminadasLabel;
    private javax.swing.JSlider MarcadorDificultad;
    private javax.swing.JPanel PanelAjustes;
    private javax.swing.JColorChooser PanelColores;
    private javax.swing.JPanel PanelColoresFondo;
    private javax.swing.JPanel PanelDificultad;
    private javax.swing.JPanel PanelJuego;
    private javax.swing.JDialog PantallaAjustes;
    private javax.swing.JDialog PantallaCambiarDeColor;
    private javax.swing.JDialog PantallaDificultad;
    private javax.swing.JDialog PantallaJuego;
    private javax.swing.JPanel Puntos;
    private javax.swing.JLabel PuntosLabel;
    private javax.swing.JButton Salir;
    private javax.swing.JButton SalirJuego;
    private javax.swing.JPanel SiguienteFicha;
    private javax.swing.JLabel TiempoEtiqueta;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
