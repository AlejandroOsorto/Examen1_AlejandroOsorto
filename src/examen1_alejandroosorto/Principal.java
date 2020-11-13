package examen1_alejandroosorto;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class Principal extends javax.swing.JFrame
{

    ArrayList lista = new ArrayList();
    ArrayList listaJasons = new ArrayList();

    public Principal()
    {
        initComponents();

        DefaultComboBoxModel m = (DefaultComboBoxModel) CB_Armas.getModel();

        m.addElement("Hacha");
        m.addElement("Pistola");
        m.addElement("Bate");
        m.addElement("Pala");
        m.addElement("Puños");

        DefaultComboBoxModel modeloMalo = (DefaultComboBoxModel) CB_ArmasMalo.getModel();

        modeloMalo.addElement("Hacha");
        modeloMalo.addElement("Pistola");
        modeloMalo.addElement("Bate");
        modeloMalo.addElement("Pala");
        modeloMalo.addElement("Puños");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        GrupoSexo = new javax.swing.ButtonGroup();
        GrupoCampistas = new javax.swing.ButtonGroup();
        GrupoVida = new javax.swing.ButtonGroup();
        GrupoSexoMalos = new javax.swing.ButtonGroup();
        PanelPrincipal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        Personas = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        AddDatos = new javax.swing.JPanel();
        cuadroNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cuadroEdad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BTN_DatosPersonasBuenas = new javax.swing.JButton();
        BTN_Mas = new javax.swing.JRadioButton();
        BTN_Fem = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        CB_Armas = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CT_Porcentaje = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BTN_Camp = new javax.swing.JRadioButton();
        BTN_Sup = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        BTN_Vivo = new javax.swing.JRadioButton();
        BTN_Muerto = new javax.swing.JRadioButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        cuadroNombreMalo = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        cuadroEdadMalo = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        BTN_MasMalo = new javax.swing.JRadioButton();
        BTN_FemMalo = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        CB_ArmasMalo = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        CT_PorcentajeMalo = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        cuadroMatados = new javax.swing.JTextField();
        BTN_DatosPersonasMalas = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        ModDatos = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        CB_Lista = new javax.swing.JComboBox<>();
        BTN_Eliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_Lista = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipal.setBackground(new java.awt.Color(103, 107, 110));
        PanelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        PanelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setOpaque(true);
        PanelPrincipal.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                PanelPrincipalMouseClicked(evt);
            }
        });

        AddDatos.setBackground(new java.awt.Color(245, 245, 245));

        cuadroNombre.setBackground(new java.awt.Color(40, 44, 47));
        cuadroNombre.setForeground(new java.awt.Color(255, 255, 255));
        cuadroNombre.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cuadroNombreActionPerformed(evt);
            }
        });
        cuadroNombre.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                cuadroNombreKeyTyped(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(40, 44, 47));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre: ");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(40, 44, 47));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Edad: ");
        jLabel2.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabel2.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 16));

        cuadroEdad.setBackground(new java.awt.Color(40, 44, 47));
        cuadroEdad.setForeground(new java.awt.Color(255, 255, 255));
        cuadroEdad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cuadroEdad.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cuadroEdadActionPerformed(evt);
            }
        });
        cuadroEdad.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                cuadroEdadKeyTyped(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(40, 44, 47));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sexo:");
        jLabel3.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabel3.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(50, 16));

        BTN_DatosPersonasBuenas.setBackground(new java.awt.Color(40, 44, 47));
        BTN_DatosPersonasBuenas.setForeground(new java.awt.Color(255, 255, 255));
        BTN_DatosPersonasBuenas.setText("Añadir datos");
        BTN_DatosPersonasBuenas.setOpaque(true);
        BTN_DatosPersonasBuenas.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BTN_DatosPersonasBuenasActionPerformed(evt);
            }
        });

        BTN_Mas.setBackground(new java.awt.Color(40, 44, 47));
        GrupoSexo.add(BTN_Mas);
        BTN_Mas.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Mas.setText("M");
        BTN_Mas.setOpaque(true);

        BTN_Fem.setBackground(new java.awt.Color(40, 44, 47));
        GrupoSexo.add(BTN_Fem);
        BTN_Fem.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Fem.setText("F");
        BTN_Fem.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(40, 44, 47));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Armas");
        jLabel4.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabel4.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(50, 16));

        CB_Armas.setBackground(new java.awt.Color(40, 44, 47));
        CB_Armas.setOpaque(true);
        CB_Armas.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                CB_ArmasItemStateChanged(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Seleccione un elemento de la lista");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Ingrese un nombre");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Ingrese una edad");

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Seleccione un sexo");

        jLabel5.setBackground(new java.awt.Color(40, 44, 47));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Porcentaje de daño:");
        jLabel5.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabel5.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel5.setOpaque(true);
        jLabel5.setPreferredSize(new java.awt.Dimension(50, 16));

        CT_Porcentaje.setBackground(new java.awt.Color(40, 44, 47));
        CT_Porcentaje.setForeground(new java.awt.Color(255, 255, 255));
        CT_Porcentaje.setMaximumSize(new java.awt.Dimension(50, 16));
        CT_Porcentaje.setMinimumSize(new java.awt.Dimension(50, 16));
        CT_Porcentaje.setOpaque(true);
        CT_Porcentaje.setPreferredSize(new java.awt.Dimension(50, 16));

        jLabel6.setBackground(new java.awt.Color(40, 44, 47));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo de campista: ");
        jLabel6.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabel6.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel6.setOpaque(true);
        jLabel6.setPreferredSize(new java.awt.Dimension(50, 16));

        BTN_Camp.setBackground(new java.awt.Color(40, 44, 47));
        GrupoCampistas.add(BTN_Camp);
        BTN_Camp.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Camp.setText("Campista");
        BTN_Camp.setOpaque(true);

        BTN_Sup.setBackground(new java.awt.Color(40, 44, 47));
        GrupoCampistas.add(BTN_Sup);
        BTN_Sup.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Sup.setText("Supervisor");
        BTN_Sup.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(40, 44, 47));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Estado de vida");
        jLabel8.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabel8.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel8.setOpaque(true);
        jLabel8.setPreferredSize(new java.awt.Dimension(50, 16));

        BTN_Vivo.setBackground(new java.awt.Color(40, 44, 47));
        GrupoVida.add(BTN_Vivo);
        BTN_Vivo.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Vivo.setText("Vivo");
        BTN_Vivo.setOpaque(true);

        BTN_Muerto.setBackground(new java.awt.Color(40, 44, 47));
        GrupoVida.add(BTN_Muerto);
        BTN_Muerto.setForeground(new java.awt.Color(255, 255, 255));
        BTN_Muerto.setText("Palmado(Muerto)");
        BTN_Muerto.setOpaque(true);

        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Se muestra aqui cuanto daño hace el arma");

        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Seleccione el tipo de campista");

        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Seleccione si esta vivo o muerto");

        javax.swing.GroupLayout AddDatosLayout = new javax.swing.GroupLayout(AddDatos);
        AddDatos.setLayout(AddDatosLayout);
        AddDatosLayout.setHorizontalGroup(
            AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddDatosLayout.createSequentialGroup()
                        .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddDatosLayout.createSequentialGroup()
                                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AddDatosLayout.createSequentialGroup()
                                        .addComponent(cuadroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10))
                                    .addGroup(AddDatosLayout.createSequentialGroup()
                                        .addComponent(cuadroEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel12)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddDatosLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CB_Armas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(AddDatosLayout.createSequentialGroup()
                        .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddDatosLayout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BTN_Mas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_Fem))
                            .addComponent(BTN_DatosPersonasBuenas)
                            .addGroup(AddDatosLayout.createSequentialGroup()
                                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AddDatosLayout.createSequentialGroup()
                                        .addComponent(CT_Porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel36))
                                    .addGroup(AddDatosLayout.createSequentialGroup()
                                        .addComponent(BTN_Camp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTN_Sup)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel37))))
                            .addGroup(AddDatosLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BTN_Vivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BTN_Muerto)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel38)))
                        .addGap(0, 8, Short.MAX_VALUE))))
        );
        AddDatosLayout.setVerticalGroup(
            AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddDatosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuadroNombre)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuadroEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Mas)
                    .addComponent(BTN_Fem)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_Armas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CT_Porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel36))
                .addGap(18, 18, 18)
                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Camp)
                    .addComponent(BTN_Sup)
                    .addComponent(jLabel37))
                .addGap(18, 18, 18)
                .addGroup(AddDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_Vivo)
                    .addComponent(BTN_Muerto)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(BTN_DatosPersonasBuenas)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 511, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AddDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AddDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Personas.addTab("Campistas", jPanel2);

        jPanel5.setBackground(new java.awt.Color(198, 44, 44));

        jLabel25.setBackground(new java.awt.Color(40, 44, 47));
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Nombre: ");
        jLabel25.setOpaque(true);

        cuadroNombreMalo.setBackground(new java.awt.Color(40, 44, 47));
        cuadroNombreMalo.setForeground(new java.awt.Color(255, 255, 255));
        cuadroNombreMalo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cuadroNombreMaloActionPerformed(evt);
            }
        });
        cuadroNombreMalo.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                cuadroNombreMaloKeyTyped(evt);
            }
        });

        jLabel26.setBackground(new java.awt.Color(40, 44, 47));
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Edad: ");
        jLabel26.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabel26.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel26.setOpaque(true);
        jLabel26.setPreferredSize(new java.awt.Dimension(50, 16));

        cuadroEdadMalo.setBackground(new java.awt.Color(40, 44, 47));
        cuadroEdadMalo.setForeground(new java.awt.Color(255, 255, 255));
        cuadroEdadMalo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cuadroEdadMalo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cuadroEdadMaloActionPerformed(evt);
            }
        });
        cuadroEdadMalo.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                cuadroEdadMaloKeyTyped(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(40, 44, 47));
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Sexo:");
        jLabel27.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabel27.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel27.setOpaque(true);
        jLabel27.setPreferredSize(new java.awt.Dimension(50, 16));

        BTN_MasMalo.setBackground(new java.awt.Color(40, 44, 47));
        GrupoSexoMalos.add(BTN_MasMalo);
        BTN_MasMalo.setForeground(new java.awt.Color(255, 255, 255));
        BTN_MasMalo.setSelected(true);
        BTN_MasMalo.setText("M");
        BTN_MasMalo.setOpaque(true);

        BTN_FemMalo.setBackground(new java.awt.Color(40, 44, 47));
        GrupoSexoMalos.add(BTN_FemMalo);
        BTN_FemMalo.setForeground(new java.awt.Color(255, 255, 255));
        BTN_FemMalo.setText("F");
        BTN_FemMalo.setOpaque(true);

        jLabel28.setBackground(new java.awt.Color(40, 44, 47));
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Armas");
        jLabel28.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabel28.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel28.setOpaque(true);
        jLabel28.setPreferredSize(new java.awt.Dimension(50, 16));

        CB_ArmasMalo.setBackground(new java.awt.Color(40, 44, 47));
        CB_ArmasMalo.setOpaque(true);
        CB_ArmasMalo.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                CB_ArmasMaloItemStateChanged(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(40, 44, 47));
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Porcentaje de daño:");
        jLabel29.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabel29.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel29.setOpaque(true);
        jLabel29.setPreferredSize(new java.awt.Dimension(50, 16));

        CT_PorcentajeMalo.setBackground(new java.awt.Color(40, 44, 47));
        CT_PorcentajeMalo.setForeground(new java.awt.Color(255, 255, 255));
        CT_PorcentajeMalo.setMaximumSize(new java.awt.Dimension(50, 16));
        CT_PorcentajeMalo.setMinimumSize(new java.awt.Dimension(50, 16));
        CT_PorcentajeMalo.setOpaque(true);
        CT_PorcentajeMalo.setPreferredSize(new java.awt.Dimension(50, 16));

        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Ingrese un nombre");

        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Ingrese una edad");

        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Seleccione un sexo");

        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Seleccione un elemento de la lista");

        jLabel34.setBackground(new java.awt.Color(40, 44, 47));
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Cantidad de asesinatos: ");
        jLabel34.setMaximumSize(new java.awt.Dimension(50, 16));
        jLabel34.setMinimumSize(new java.awt.Dimension(50, 16));
        jLabel34.setOpaque(true);
        jLabel34.setPreferredSize(new java.awt.Dimension(50, 16));

        cuadroMatados.setBackground(new java.awt.Color(40, 44, 47));
        cuadroMatados.setForeground(new java.awt.Color(255, 255, 255));
        cuadroMatados.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cuadroMatados.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cuadroMatadosActionPerformed(evt);
            }
        });
        cuadroMatados.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                cuadroMatadosKeyTyped(evt);
            }
        });

        BTN_DatosPersonasMalas.setBackground(new java.awt.Color(40, 44, 47));
        BTN_DatosPersonasMalas.setForeground(new java.awt.Color(255, 255, 255));
        BTN_DatosPersonasMalas.setText("Añadir Jason");
        BTN_DatosPersonasMalas.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BTN_DatosPersonasMalasActionPerformed(evt);
            }
        });

        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Se muestra aqui cuanto daño hace el arma");

        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Ingrese una cantidad");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_MasMalo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_FemMalo))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(cuadroNombreMalo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel30))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(cuadroEdadMalo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel32)
                                            .addComponent(jLabel31)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CB_ArmasMalo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel33))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CT_PorcentajeMalo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cuadroMatados, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel35))
                    .addComponent(BTN_DatosPersonasMalas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuadroNombreMalo)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuadroEdadMalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_MasMalo)
                    .addComponent(BTN_FemMalo)
                    .addComponent(jLabel32))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_ArmasMalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CT_PorcentajeMalo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuadroMatados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(148, 148, 148)
                .addComponent(BTN_DatosPersonasMalas)
                .addContainerGap())
        );

        Personas.addTab("Jason", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Personas, javax.swing.GroupLayout.PREFERRED_SIZE, 507, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Personas)
        );

        PanelPrincipal.addTab("Añadir Datos", jPanel1);

        javax.swing.GroupLayout ModDatosLayout = new javax.swing.GroupLayout(ModDatos);
        ModDatos.setLayout(ModDatosLayout);
        ModDatosLayout.setHorizontalGroup(
            ModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 507, Short.MAX_VALUE)
        );
        ModDatosLayout.setVerticalGroup(
            ModDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        PanelPrincipal.addTab("Modificar datos", ModDatos);

        jPanel4.setBackground(new java.awt.Color(134, 150, 161));

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Seleccione de la lista el elemento que quiere eliminar");

        CB_Lista.setBackground(new java.awt.Color(40, 44, 47));
        CB_Lista.setForeground(new java.awt.Color(246, 246, 246));

        BTN_Eliminar.setText("Eliminar");
        BTN_Eliminar.setOpaque(true);
        BTN_Eliminar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BTN_EliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CB_Lista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(BTN_Eliminar))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(CB_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 349, Short.MAX_VALUE)
                .addComponent(BTN_Eliminar)
                .addContainerGap())
        );

        PanelPrincipal.addTab("Eliminar datos", jPanel4);

        jPanel3.setBackground(new java.awt.Color(170, 131, 55));

        T_Lista.setBackground(new java.awt.Color(163, 153, 124));
        T_Lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Vivos", "Muertos", "Jasons"
            }
        ));
        jScrollPane1.setViewportView(T_Lista);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelPrincipal.addTab("Estadisticas", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelPrincipalMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_PanelPrincipalMouseClicked
    {//GEN-HEADEREND:event_PanelPrincipalMouseClicked
        // TODO add your handling code here:
        DefaultComboBoxModel modeloLista = (DefaultComboBoxModel) CB_Lista.getModel();
        for (int i = 0; i < lista.size(); i++)        
        {
            modeloLista.addElement(lista.get(i));
        }
    }//GEN-LAST:event_PanelPrincipalMouseClicked

    private void CB_ArmasItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_CB_ArmasItemStateChanged
    {//GEN-HEADEREND:event_CB_ArmasItemStateChanged
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) CB_Armas.getModel();
        if (modelo.getSelectedItem().equals("Hacha"))
        {
            CT_Porcentaje.setText("70");
        } else if (modelo.getSelectedItem().equals("Pistola"))
        {
            CT_Porcentaje.setText("90");
        } else if (modelo.getSelectedItem().equals("Bate"))
        {
            CT_Porcentaje.setText("60");
        } else if (modelo.getSelectedItem().equals("Pala"))
        {
            CT_Porcentaje.setText("65");
        } else if (modelo.getSelectedItem().equals("Puños"))
        {
            CT_Porcentaje.setText("5");
        }
    }//GEN-LAST:event_CB_ArmasItemStateChanged

    private void BTN_DatosPersonasBuenasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BTN_DatosPersonasBuenasActionPerformed
    {//GEN-HEADEREND:event_BTN_DatosPersonasBuenasActionPerformed
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) CB_Armas.getModel();

        if (cuadroNombre.getText().isBlank() || cuadroEdad.getText().isBlank())
        {
            JOptionPane.showMessageDialog(rootPane, "Uno o mas campos estan vacios, por favor rellene todos los campos");
        } else
        {
            String nombre = cuadroNombre.getText();
            int edad = Integer.parseInt(cuadroEdad.getText());
            String sexo;
            if (BTN_Mas.isSelected())
            {
                sexo = "M";
            } else
            {
                sexo = "F";
            }

            String nombreArma = modelo.getSelectedItem().toString();

            double porcentaje = Double.parseDouble(CT_Porcentaje.getText());

            Armas arma = new Armas(nombreArma, porcentaje);

            String tipoCampista;
            if (BTN_Camp.isSelected())
            {
                tipoCampista = "Campista";
            } else
            {
                tipoCampista = "Supervisor";
            }

            String estadoVida;
            if (BTN_Vivo.isSelected())
            {
                estadoVida = "Vivo";
            } else
            {
                estadoVida = "Muerto";
            }

            lista.add(new Campistas(tipoCampista, estadoVida, nombre, edad, sexo, arma));
            JOptionPane.showMessageDialog(rootPane, "Persona añadida exitosamente :D");
        }
    }//GEN-LAST:event_BTN_DatosPersonasBuenasActionPerformed

    private void cuadroEdadKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cuadroEdadKeyTyped
    {//GEN-HEADEREND:event_cuadroEdadKeyTyped
        char check = evt.getKeyChar();

        if (Character.isLetter(check))
        {
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingrese numeros solamente");
        }
    }//GEN-LAST:event_cuadroEdadKeyTyped

    private void cuadroEdadActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cuadroEdadActionPerformed
    {//GEN-HEADEREND:event_cuadroEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadroEdadActionPerformed

    private void cuadroNombreKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cuadroNombreKeyTyped
    {//GEN-HEADEREND:event_cuadroNombreKeyTyped
        char check = evt.getKeyChar();

        if (Character.isDigit(check))
        {
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "No puede ingresar numeros");
        }
    }//GEN-LAST:event_cuadroNombreKeyTyped

    private void cuadroNombreActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cuadroNombreActionPerformed
    {//GEN-HEADEREND:event_cuadroNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadroNombreActionPerformed

    private void cuadroNombreMaloActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cuadroNombreMaloActionPerformed
    {//GEN-HEADEREND:event_cuadroNombreMaloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadroNombreMaloActionPerformed

    private void cuadroNombreMaloKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cuadroNombreMaloKeyTyped
    {//GEN-HEADEREND:event_cuadroNombreMaloKeyTyped
        char check = evt.getKeyChar();

        if (Character.isDigit(check))
        {
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "No puede ingresar numeros");
        }
    }//GEN-LAST:event_cuadroNombreMaloKeyTyped

    private void cuadroEdadMaloActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cuadroEdadMaloActionPerformed
    {//GEN-HEADEREND:event_cuadroEdadMaloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadroEdadMaloActionPerformed

    private void cuadroEdadMaloKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cuadroEdadMaloKeyTyped
    {//GEN-HEADEREND:event_cuadroEdadMaloKeyTyped
        char check = evt.getKeyChar();

        if (Character.isLetter(check))
        {
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingrese numeros solamente");
        }

    }//GEN-LAST:event_cuadroEdadMaloKeyTyped

    private void CB_ArmasMaloItemStateChanged(java.awt.event.ItemEvent evt)//GEN-FIRST:event_CB_ArmasMaloItemStateChanged
    {//GEN-HEADEREND:event_CB_ArmasMaloItemStateChanged
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) CB_ArmasMalo.getModel();
        if (modelo.getSelectedItem().equals("Hacha"))
        {
            CT_PorcentajeMalo.setText("90");
        } else if (modelo.getSelectedItem().equals("Pistola"))
        {
            CT_PorcentajeMalo.setText("200");
        } else if (modelo.getSelectedItem().equals("Bate"))
        {
            CT_PorcentajeMalo.setText("80");
        } else if (modelo.getSelectedItem().equals("Pala"))
        {
            CT_PorcentajeMalo.setText("85");
        } else if (modelo.getSelectedItem().equals("Puños"))
        {
            CT_PorcentajeMalo.setText("25");
        }
    }//GEN-LAST:event_CB_ArmasMaloItemStateChanged

    private void cuadroMatadosKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_cuadroMatadosKeyTyped
    {//GEN-HEADEREND:event_cuadroMatadosKeyTyped
        char check = evt.getKeyChar();

        if (Character.isLetter(check))
        {
            evt.consume();

            JOptionPane.showMessageDialog(rootPane, "Ingrese numeros");
        }
    }//GEN-LAST:event_cuadroMatadosKeyTyped

    private void cuadroMatadosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cuadroMatadosActionPerformed
    {//GEN-HEADEREND:event_cuadroMatadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuadroMatadosActionPerformed

    private void BTN_DatosPersonasMalasActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BTN_DatosPersonasMalasActionPerformed
    {//GEN-HEADEREND:event_BTN_DatosPersonasMalasActionPerformed
        DefaultComboBoxModel modeloMalo = (DefaultComboBoxModel) CB_ArmasMalo.getModel();

        if (cuadroNombreMalo.getText().isBlank() || cuadroEdadMalo.getText().isBlank() || cuadroMatados.getText().isBlank())
        {
            JOptionPane.showMessageDialog(rootPane, "Uno o mas campos estan vacios, por favor rellene todos los campos");
        } else
        {
            String nombre = cuadroNombreMalo.getText();
            int edad = Integer.parseInt(cuadroEdadMalo.getText());
            String sexo;
            if (BTN_MasMalo.isSelected())
            {
                sexo = "M";
            } else
            {
                sexo = "F";
            }

            String nombreArma = modeloMalo.getSelectedItem().toString();

            double porcentaje = Double.parseDouble(CT_PorcentajeMalo.getText());

            Armas arma = new Armas(nombreArma, porcentaje);
            
            int cantPersonas = Integer.parseInt(cuadroMatados.getText());
            
            listaJasons.add(new El_Yeison_Burpees(cantPersonas, nombre, edad, sexo, arma));

            JOptionPane.showMessageDialog(rootPane, "Jason añadido exitosamente >:D");
        }
    }//GEN-LAST:event_BTN_DatosPersonasMalasActionPerformed

    private void BTN_EliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BTN_EliminarActionPerformed
    {//GEN-HEADEREND:event_BTN_EliminarActionPerformed
        for (int i = 0; i < lista.size(); i++)        
        {
            if (lista.get(i).equals(CB_Lista.getSelectedItem()))
            {
                lista.remove(i);
            }
        }
    }//GEN-LAST:event_BTN_EliminarActionPerformed
    
    /**
         * @param args the command line arguments
         */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Principal().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddDatos;
    private javax.swing.JRadioButton BTN_Camp;
    private javax.swing.JButton BTN_DatosPersonasBuenas;
    private javax.swing.JButton BTN_DatosPersonasMalas;
    private javax.swing.JButton BTN_Eliminar;
    private javax.swing.JRadioButton BTN_Fem;
    private javax.swing.JRadioButton BTN_FemMalo;
    private javax.swing.JRadioButton BTN_Mas;
    private javax.swing.JRadioButton BTN_MasMalo;
    private javax.swing.JRadioButton BTN_Muerto;
    private javax.swing.JRadioButton BTN_Sup;
    private javax.swing.JRadioButton BTN_Vivo;
    private javax.swing.JComboBox<String> CB_Armas;
    private javax.swing.JComboBox<String> CB_ArmasMalo;
    private javax.swing.JComboBox<String> CB_Lista;
    private javax.swing.JLabel CT_Porcentaje;
    private javax.swing.JLabel CT_PorcentajeMalo;
    private javax.swing.ButtonGroup GrupoCampistas;
    private javax.swing.ButtonGroup GrupoSexo;
    private javax.swing.ButtonGroup GrupoSexoMalos;
    private javax.swing.ButtonGroup GrupoVida;
    private javax.swing.JPanel ModDatos;
    private javax.swing.JTabbedPane PanelPrincipal;
    private javax.swing.JTabbedPane Personas;
    private javax.swing.JTable T_Lista;
    private javax.swing.JTextField cuadroEdad;
    private javax.swing.JTextField cuadroEdadMalo;
    private javax.swing.JTextField cuadroMatados;
    private javax.swing.JTextField cuadroNombre;
    private javax.swing.JTextField cuadroNombreMalo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
